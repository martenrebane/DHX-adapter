package ee.ria.dhx.server;

import ee.ria.dhx.server.handlers.RejectedExecutionHandlerImpl;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.concurrent.Executor;

/**
 * Class containing main method.
 * 
 * @author Aleksei Kokarev
 *
 */
@SpringBootApplication(scanBasePackages = {
        "ee.ria.dhx.server.config",
        "ee.ria.dhx.server.service",
        "ee.ria.dhx.server.persistence.*",
        "ee.ria.dhx.server.scheduler",
        "ee.ria.dhx.ws.config",
        "ee.ria.dhx.ws.schedule",
        "ee.ria.dhx.ws.service.impl",
        "ee.ria.dhx.server.controllers",
        "ee.ria.dhx.server.converters"
})
@EnableScheduling
@EnableWebMvc
@EnableAsync
@PropertySource("classpath:dhx-application.properties")
@Slf4j
public class Application extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(Application.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean("threadPoolTaskExecutor")
  public Executor taskExecutor() {
    log.info("LOGGING: SETTING UP TASK EXECUTOR");
    int cores = Runtime.getRuntime().availableProcessors();
    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    executor.setCorePoolSize(cores);
    executor.setMaxPoolSize(100);
    executor.setQueueCapacity(1000);
    executor.setThreadNamePrefix("DHX-");
    executor.setWaitForTasksToCompleteOnShutdown(true);
    executor.setThreadPriority(10);
    executor.setRejectedExecutionHandler(new RejectedExecutionHandlerImpl());
    executor.initialize();
    return executor;
  }



}
