package ee.ria.dhx.server.handlers;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        try {
            executor.getQueue().put(r);
        }
        catch (InterruptedException e) {
            throw new RejectedExecutionException("Unable to add Runnable to queue", e);
        }
    }
}
