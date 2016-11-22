//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.10 at 01:13:12 PM EET
//


package ee.ria.dhx.types.ee.riik.schemas.deccontainer.vers_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for PersonType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonalIdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Residency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "name",
    "givenName",
    "surname",
    "personalIdCode",
    "residency"
})
public class PersonType {

  @XmlElement(name = "Name", required = true)
  protected String name;
  @XmlElement(name = "GivenName")
  protected String givenName;
  @XmlElement(name = "Surname")
  protected String surname;
  @XmlElement(name = "PersonalIdCode")
  protected String personalIdCode;
  @XmlElement(name = "Residency")
  protected String residency;

  /**
   * Gets the value of the name property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setName(String value) {
    this.name = value;
  }

  /**
   * Gets the value of the givenName property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getGivenName() {
    return givenName;
  }

  /**
   * Sets the value of the givenName property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setGivenName(String value) {
    this.givenName = value;
  }

  /**
   * Gets the value of the surname property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getSurname() {
    return surname;
  }

  /**
   * Sets the value of the surname property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setSurname(String value) {
    this.surname = value;
  }

  /**
   * Gets the value of the personalIdCode property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPersonalIdCode() {
    return personalIdCode;
  }

  /**
   * Sets the value of the personalIdCode property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setPersonalIdCode(String value) {
    this.personalIdCode = value;
  }

  /**
   * Gets the value of the residency property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getResidency() {
    return residency;
  }

  /**
   * Sets the value of the residency property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setResidency(String value) {
    this.residency = value;
  }

}