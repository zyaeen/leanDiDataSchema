//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.20 at 04:23:58 PM MSK 
//


package org.leandi.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anchorRole" type="{}anchorRole" maxOccurs="unbounded" minOccurs="2"/&gt;
 *         &lt;element name="constraints" type="{}constraintsType" minOccurs="0"/&gt;
 *         &lt;element name="knotRole" type="{}knotRole" minOccurs="0"/&gt;
 *         &lt;element name="indexes" type="{}indexesType" minOccurs="0"/&gt;
 *         &lt;group ref="{}baseObjectSequence"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="timeRange" type="{}identity" /&gt;
 *       &lt;attribute name="skip" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="descriptor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tie", propOrder = {
    "anchorRole",
    "constraints",
    "knotRole",
    "indexes",
    "metadata",
    "layout",
    "description"
})
public class Tie
    implements Serializable
{

    private final static long serialVersionUID = 202012110946L;
    @XmlElement(required = true)
    protected List<AnchorRole> anchorRole;
    protected ConstraintsType constraints;
    protected KnotRole knotRole;
    protected IndexesType indexes;
    protected ObjectMetadata metadata;
    protected Layout layout;
    protected String description;
    @XmlAttribute(name = "timeRange")
    protected Identity timeRange;
    @XmlAttribute(name = "skip")
    protected Boolean skip;
    @XmlAttribute(name = "descriptor")
    protected String descriptor;
    @XmlAttribute(name = "deprecated")
    protected Boolean deprecated;

    /**
     * Gets the value of the anchorRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the anchorRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnchorRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnchorRole }
     * 
     * 
     */
    public List<AnchorRole> getAnchorRole() {
        if (anchorRole == null) {
            anchorRole = new ArrayList<AnchorRole>();
        }
        return this.anchorRole;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintsType }
     *     
     */
    public ConstraintsType getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintsType }
     *     
     */
    public void setConstraints(ConstraintsType value) {
        this.constraints = value;
    }

    /**
     * Gets the value of the knotRole property.
     * 
     * @return
     *     possible object is
     *     {@link KnotRole }
     *     
     */
    public KnotRole getKnotRole() {
        return knotRole;
    }

    /**
     * Sets the value of the knotRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnotRole }
     *     
     */
    public void setKnotRole(KnotRole value) {
        this.knotRole = value;
    }

    /**
     * Gets the value of the indexes property.
     * 
     * @return
     *     possible object is
     *     {@link IndexesType }
     *     
     */
    public IndexesType getIndexes() {
        return indexes;
    }

    /**
     * Sets the value of the indexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexesType }
     *     
     */
    public void setIndexes(IndexesType value) {
        this.indexes = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectMetadata }
     *     
     */
    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectMetadata }
     *     
     */
    public void setMetadata(ObjectMetadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link Layout }
     *     
     */
    public Layout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layout }
     *     
     */
    public void setLayout(Layout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the timeRange property.
     * 
     * @return
     *     possible object is
     *     {@link Identity }
     *     
     */
    public Identity getTimeRange() {
        return timeRange;
    }

    /**
     * Sets the value of the timeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identity }
     *     
     */
    public void setTimeRange(Identity value) {
        this.timeRange = value;
    }

    /**
     * Gets the value of the skip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSkip() {
        if (skip == null) {
            return false;
        } else {
            return skip;
        }
    }

    /**
     * Sets the value of the skip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkip(Boolean value) {
        this.skip = value;
    }

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptor(String value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the deprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDeprecated() {
        if (deprecated == null) {
            return false;
        } else {
            return deprecated;
        }
    }

    /**
     * Sets the value of the deprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeprecated(Boolean value) {
        this.deprecated = value;
    }

}