//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.12 at 10:56:04 PM IST 
//


package com.tanjer.CountrySoapConsumer.calculate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ListOfCurrenciesByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCurrency"/&gt;
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
    "listOfCurrenciesByNameResult"
})
@XmlRootElement(name = "ListOfCurrenciesByNameResponse")
public class ListOfCurrenciesByNameResponse {

    @XmlElement(name = "ListOfCurrenciesByNameResult", required = true)
    protected ArrayOftCurrency listOfCurrenciesByNameResult;

    /**
     * Gets the value of the listOfCurrenciesByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public ArrayOftCurrency getListOfCurrenciesByNameResult() {
        return listOfCurrenciesByNameResult;
    }

    /**
     * Sets the value of the listOfCurrenciesByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public void setListOfCurrenciesByNameResult(ArrayOftCurrency value) {
        this.listOfCurrenciesByNameResult = value;
    }

}
