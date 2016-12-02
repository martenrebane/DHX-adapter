//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.17 at 11:49:24 AM EET 
//


package ee.ria.dhx.server.types.ee.riik.xrd.dhl.producers.producer.dhl;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Tagasiside vastuvõetud dokumendi oleku ja vigade kohta
 * 
 * <p>Java class for tagasisideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tagasisideType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="dhl_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="vastuvotja_staatus_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.riik.ee/schemas/dhl}fault" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tagasisideType", propOrder = {

})
public class TagasisideType {

    @XmlElement(name = "dhl_id", namespace = "")
    protected BigInteger dhlId;
    @XmlElement(name = "vastuvotja_staatus_id", namespace = "")
    protected BigInteger vastuvotjaStaatusId;
    protected Fault fault;

    Metaxml metaxml;
    @XmlElement(name = "staatuse_muutmise_aeg", namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar staatuseMuutmiseAeg;
    public Metaxml getMetaxml() {
      return metaxml;
    }

    public void setMetaxml(Metaxml metaxml) {
      this.metaxml = metaxml;
    }

    public XMLGregorianCalendar getStaatuseMuutmiseAeg() {
      return staatuseMuutmiseAeg;
    }

    public void setStaatuseMuutmiseAeg(XMLGregorianCalendar staatuseMuutmiseAeg) {
      this.staatuseMuutmiseAeg = staatuseMuutmiseAeg;
    }

    /**
     * Gets the value of the dhlId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDhlId() {
        return dhlId;
    }

    /**
     * Sets the value of the dhlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDhlId(BigInteger value) {
        this.dhlId = value;
    }

    /**
     * Gets the value of the vastuvotjaStaatusId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVastuvotjaStaatusId() {
        return vastuvotjaStaatusId;
    }

    /**
     * Sets the value of the vastuvotjaStaatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVastuvotjaStaatusId(BigInteger value) {
        this.vastuvotjaStaatusId = value;
    }

    /**
     * vastuvõtja poolel ilmnenud vea andmed
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setFault(Fault value) {
        this.fault = value;
    }

}
