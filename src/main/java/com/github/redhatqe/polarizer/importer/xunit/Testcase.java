//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.18 at 03:04:36 PM EDT 
//


package com.github.redhatqe.polarizer.importer.xunit;

import javax.xml.bind.annotation.*;
import java.lang.Error;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{}skipped" minOccurs="0"/&gt;
 *         &lt;element ref="{}error" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}failure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}system-out" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}system-err" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}properties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="assertions" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="classname" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "skipped",
    "error",
    "failure",
    "systemOut",
    "systemErr",
    "properties"
})
@XmlRootElement(name = "testcase")
public class Testcase {

    protected String skipped;
    protected List<Error> error;
    protected List<Failure> failure;
    @XmlElement(name = "system-out")
    protected List<String> systemOut;
    @XmlElement(name = "system-err")
    protected List<String> systemErr;
    protected Properties properties;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "assertions")
    protected String assertions;
    @XmlAttribute(name = "time")
    protected String time;
    @XmlAttribute(name = "classname")
    protected String classname;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * Gets the value of the skipped property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSkipped() {
        return skipped;
    }

    /**
     * Sets the value of the skipped property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSkipped(String value) {
        this.skipped = value;
    }

    /**
     * Gets the value of the error property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     *
     *
     */
    public List<Error> getError() {
        if (error == null) {
            error = new ArrayList<Error>();
        }
        return this.error;
    }

    /**
     * Gets the value of the failure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Failure }
     * 
     * 
     */
    public List<Failure> getFailure() {
        if (failure == null) {
            failure = new ArrayList<Failure>();
        }
        return this.failure;
    }

    /**
     * Gets the value of the systemOut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemOut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSystemOut() {
        if (systemOut == null) {
            systemOut = new ArrayList<String>();
        }
        return this.systemOut;
    }

    /**
     * Gets the value of the systemErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSystemErr() {
        if (systemErr == null) {
            systemErr = new ArrayList<String>();
        }
        return this.systemErr;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the assertions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssertions() {
        return assertions;
    }

    /**
     * Sets the value of the assertions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssertions(String value) {
        this.assertions = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the classname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassname() {
        return classname;
    }

    /**
     * Sets the value of the classname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassname(String value) {
        this.classname = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
