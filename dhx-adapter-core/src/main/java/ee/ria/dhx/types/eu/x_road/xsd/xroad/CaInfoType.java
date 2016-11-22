//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.10 at 01:13:12 PM EET
//


package ee.ria.dhx.types.eu.x_road.xsd.xroad;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type encapsulates information about a certification authority.
 * 
 * 
 * <p>
 * Java class for CaInfoType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cert" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="ocsp" type="{http://x-road.eu/xsd/xroad.xsd}OcspInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaInfoType", propOrder = {
    "cert",
    "ocsp"
})
public class CaInfoType {

  @XmlElement(required = true)
  protected byte[] cert;
  protected List<OcspInfoType> ocsp;

  /**
   * Gets the value of the cert property.
   * 
   * @return possible object is byte[]
   */
  public byte[] getCert() {
    return cert;
  }

  /**
   * Sets the value of the cert property.
   * 
   * @param value allowed object is byte[]
   */
  public void setCert(byte[] value) {
    this.cert = value;
  }

  /**
   * Gets the value of the ocsp property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the ocsp property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getOcsp().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link OcspInfoType }
   * 
   * 
   */
  public List<OcspInfoType> getOcsp() {
    if (ocsp == null) {
      ocsp = new ArrayList<OcspInfoType>();
    }
    return this.ocsp;
  }

}