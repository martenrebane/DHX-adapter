//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.05 at 10:27:42 AM EEST 
//


package ee.ria.dhx.server.types.ee.riik.xrd.dhl.producers.producer.dhl;

import java.util.List;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for getSendingOptionsV3ResponseTypeUnencoded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSendingOptionsV3ResponseTypeUnencoded"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asutused"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="asutus" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.riik.ee/schemas/dhl}regnr"/&gt;
 *                             &lt;element name="nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="saatmine"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="saatmisviis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ks_asutuse_regnr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="allyksused"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="allyksus" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="asutuse_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ks_allyksuse_lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ametikohad"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ametikoht" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="asutuse_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ks_allyksuse_lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "keha", namespace = "")
@XmlType(name = "getSendingOptionsV3ResponseTypeUnencoded", propOrder = {
    "asutused",
    "allyksused",
    "ametikohad"
})
public class GetSendingOptionsV3ResponseTypeUnencoded {

    @XmlElement(required = false)
    protected GetSendingOptionsV3ResponseTypeUnencoded.Asutused asutused;
    @XmlElement(required = false)
    protected GetSendingOptionsV3ResponseTypeUnencoded.Allyksused allyksused;
    @XmlElement(required = false)
    protected GetSendingOptionsV3ResponseTypeUnencoded.Ametikohad ametikohad;

    /**
     * Gets the value of the asutused property.
     *
     * @return
     *     possible object is
     *     {@link GetSendingOptionsV3ResponseTypeUnencoded.Asutused }
     * 
     */
    public GetSendingOptionsV3ResponseTypeUnencoded.Asutused getAsutused() {
        return asutused;
    }

    /**
     * Sets the value of the asutused property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSendingOptionsV3ResponseTypeUnencoded.Asutused }
     *     
     */
    public void setAsutused(GetSendingOptionsV3ResponseTypeUnencoded.Asutused value) {
        this.asutused = value;
    }

    /**
     * Gets the value of the allyksused property.
     *
     * @return
     *     possible object is
     *     {@link GetSendingOptionsV3ResponseTypeUnencoded.Allyksused }
     * 
     */
    public GetSendingOptionsV3ResponseTypeUnencoded.Allyksused getAllyksused() {
        return allyksused;
    }

    /**
     * Sets the value of the allyksused property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSendingOptionsV3ResponseTypeUnencoded.Allyksused }
     *     
     */
    public void setAllyksused(GetSendingOptionsV3ResponseTypeUnencoded.Allyksused value) {
        this.allyksused = value;
    }

    /**
     * Gets the value of the ametikohad property.
     *
     * @return
     *     possible object is
     *     {@link GetSendingOptionsV3ResponseTypeUnencoded.Ametikohad }
     * 
     */
    public GetSendingOptionsV3ResponseTypeUnencoded.Ametikohad getAmetikohad() {
        return ametikohad;
    }

    /**
     * Sets the value of the ametikohad property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSendingOptionsV3ResponseTypeUnencoded.Ametikohad }
     *     
     */
    public void setAmetikohad(GetSendingOptionsV3ResponseTypeUnencoded.Ametikohad value) {
        this.ametikohad = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="allyksus" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="nimetus" type="{http://www.w3.org/2001/XMLSchema}string&gt;
     *                   &lt;element name="asutuse_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ks_allyksuse_lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allyksus"
    })
    public static class Allyksused {

        @XmlElement(required = true)
        protected List<GetSendingOptionsV3ResponseTypeUnencoded.Allyksused.Allyksus> allyksus;

        /**
         * Gets the value of the allyksus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allyksus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllyksus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetSendingOptionsV3ResponseTypeUnencoded.Allyksused.Allyksus }
         * 
         * 
         * 
         * @return List of {@link GetSendingOptionsV3ResponseTypeUnencoded.Allyksused.Allyksus}
         */
        public List<GetSendingOptionsV3ResponseTypeUnencoded.Allyksused.Allyksus> getAllyksus() {
            if (allyksus == null) {
                allyksus = new ArrayList<GetSendingOptionsV3ResponseTypeUnencoded.Allyksused.Allyksus>();
            }
            return this.allyksus;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="nimetus" type="{http://www.w3.org/2001/XMLSchema}string&gt;
         *         &lt;element name="asutuse_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ks_allyksuse_lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "kood",
            "nimetus",
            "asutuseKood",
            "lyhinimetus",
            "ksAllyksuseLyhinimetus"
        })
        public static class Allyksus {

            @XmlElement(required = true)
            protected String kood;
            @XmlElement(required = true)
            protected String nimetus;
            @XmlElement(name = "asutuse_kood", required = true)
            protected String asutuseKood;
            @XmlElement(required = true)
            protected String lyhinimetus;
            @XmlElement(name = "ks_allyksuse_lyhinimetus", required = true)
            protected String ksAllyksuseLyhinimetus;

            /**
             * Gets the value of the kood property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKood() {
                return kood;
            }

            /**
             * Sets the value of the kood property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKood(String value) {
                this.kood = value;
            }

            /**
             * Gets the value of the nimetus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNimetus() {
                return nimetus;
            }

            /**
             * Sets the value of the nimetus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNimetus(String value) {
                this.nimetus = value;
            }

            /**
             * Gets the value of the asutuseKood property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAsutuseKood() {
                return asutuseKood;
            }

            /**
             * Sets the value of the asutuseKood property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAsutuseKood(String value) {
                this.asutuseKood = value;
            }

            /**
             * Gets the value of the lyhinimetus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLyhinimetus() {
                return lyhinimetus;
            }

            /**
             * Sets the value of the lyhinimetus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLyhinimetus(String value) {
                this.lyhinimetus = value;
            }

            /**
             * Gets the value of the ksAllyksuseLyhinimetus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKsAllyksuseLyhinimetus() {
                return ksAllyksuseLyhinimetus;
            }

            /**
             * Sets the value of the ksAllyksuseLyhinimetus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKsAllyksuseLyhinimetus(String value) {
                this.ksAllyksuseLyhinimetus = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ametikoht" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="asutuse_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ks_allyksuse_lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ametikoht"
    })
    public static class Ametikohad {

        @XmlElement(required = true)
        protected List<GetSendingOptionsV3ResponseTypeUnencoded.Ametikohad.Ametikoht> ametikoht;

        /**
         * Gets the value of the ametikoht property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ametikoht property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmetikoht().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetSendingOptionsV3ResponseTypeUnencoded.Ametikohad.Ametikoht }
         * 
         * 
         * @return List of {@link GetSendingOptionsV3ResponseTypeUnencoded.Ametikohad.Ametikoht}
         * 
         */
        public List<GetSendingOptionsV3ResponseTypeUnencoded.Ametikohad.Ametikoht> getAmetikoht() {
            if (ametikoht == null) {
                ametikoht = new ArrayList<GetSendingOptionsV3ResponseTypeUnencoded.Ametikohad.Ametikoht>();
            }
            return this.ametikoht;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="asutuse_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ks_allyksuse_lyhinimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "kood",
            "nimetus",
            "asutuseKood",
            "lyhinimetus",
            "ksAllyksuseLyhinimetus"
        })
        public static class Ametikoht {

            @XmlElement(required = true)
            protected String kood;
            @XmlElement(required = true)
            protected String nimetus;
            @XmlElement(name = "asutuse_kood", required = true)
            protected String asutuseKood;
            @XmlElement(required = true)
            protected String lyhinimetus;
            @XmlElement(name = "ks_allyksuse_lyhinimetus", required = true)
            protected String ksAllyksuseLyhinimetus;

            /**
             * Gets the value of the kood property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKood() {
                return kood;
            }

            /**
             * Sets the value of the kood property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKood(String value) {
                this.kood = value;
            }

            /**
             * Gets the value of the nimetus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNimetus() {
                return nimetus;
            }

            /**
             * Sets the value of the nimetus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNimetus(String value) {
                this.nimetus = value;
            }

            /**
             * Gets the value of the asutuseKood property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAsutuseKood() {
                return asutuseKood;
            }

            /**
             * Sets the value of the asutuseKood property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAsutuseKood(String value) {
                this.asutuseKood = value;
            }

            /**
             * Gets the value of the lyhinimetus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLyhinimetus() {
                return lyhinimetus;
            }

            /**
             * Sets the value of the lyhinimetus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLyhinimetus(String value) {
                this.lyhinimetus = value;
            }

            /**
             * Gets the value of the ksAllyksuseLyhinimetus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKsAllyksuseLyhinimetus() {
                return ksAllyksuseLyhinimetus;
            }

            /**
             * Sets the value of the ksAllyksuseLyhinimetus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKsAllyksuseLyhinimetus(String value) {
                this.ksAllyksuseLyhinimetus = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="asutus" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.riik.ee/schemas/dhl}regnr"/&gt;
     *                   &lt;element name="nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="saatmine"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="saatmisviis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ks_asutuse_regnr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "asutus"
    })
    public static class Asutused {

        @XmlElement(required = true)
        protected List<GetSendingOptionsV3ResponseTypeUnencoded.Asutused.Asutus> asutus;

        /**
         * Gets the value of the asutus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the asutus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAsutus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetSendingOptionsV3ResponseTypeUnencoded.Asutused.Asutus }
         * 
         * 
         * @return List of {@link GetSendingOptionsV3ResponseTypeUnencoded.Asutused.Asutus}
         * 
         */
        public List<GetSendingOptionsV3ResponseTypeUnencoded.Asutused.Asutus> getAsutus() {
            if (asutus == null) {
                asutus = new ArrayList<GetSendingOptionsV3ResponseTypeUnencoded.Asutused.Asutus>();
            }
            return this.asutus;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://www.riik.ee/schemas/dhl}regnr"/&gt;
         *         &lt;element name="nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="saatmine"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="saatmisviis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ks_asutuse_regnr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "regnr",
            "nimi",
            "saatmine",
            "ksAsutuseRegnr"
        })
        public static class Asutus {

            @XmlElement(namespace = "http://www.riik.ee/schemas/dhl", required = true)
            protected String regnr;
            @XmlElement(required = true)
            protected String nimi;
            @XmlElement(required = true)
            protected GetSendingOptionsV3ResponseTypeUnencoded.Asutused.Asutus.Saatmine saatmine;
            @XmlElement(name = "ks_asutuse_regnr", required = true)
            protected String ksAsutuseRegnr;

            /**
             * Gets the value of the regnr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegnr() {
                return regnr;
            }

            /**
             * Sets the value of the regnr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegnr(String value) {
                this.regnr = value;
            }

            /**
             * Gets the value of the nimi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNimi() {
                return nimi;
            }

            /**
             * Sets the value of the nimi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNimi(String value) {
                this.nimi = value;
            }

            /**
             * Gets the value of the saatmine property.
             * 
             * @return
             *     possible object is
             *     {@link GetSendingOptionsV3ResponseTypeUnencoded.Asutused.Asutus.Saatmine }
             *     
             */
            public GetSendingOptionsV3ResponseTypeUnencoded.Asutused.Asutus.Saatmine getSaatmine() {
                return saatmine;
            }

            /**
             * Sets the value of the saatmine property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetSendingOptionsV3ResponseTypeUnencoded.Asutused.Asutus.Saatmine }
             *     
             */
            public void setSaatmine(GetSendingOptionsV3ResponseTypeUnencoded.Asutused.Asutus.Saatmine value) {
                this.saatmine = value;
            }

            /**
             * Gets the value of the ksAsutuseRegnr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKsAsutuseRegnr() {
                return ksAsutuseRegnr;
            }

            /**
             * Sets the value of the ksAsutuseRegnr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKsAsutuseRegnr(String value) {
                this.ksAsutuseRegnr = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="saatmisviis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "saatmisviis"
            })
            public static class Saatmine {

                @XmlElement(required = true)
                protected String saatmisviis;

                /**
                 * Gets the value of the saatmisviis property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSaatmisviis() {
                    return saatmisviis;
                }

                /**
                 * Sets the value of the saatmisviis property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSaatmisviis(String value) {
                    this.saatmisviis = value;
                }

            }

        }

    }

}