//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.20 at 04:23:58 PM MSK 
//


package org.leandi.schema;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for knot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="knot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}baseObjectAttributes"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}baseObjectSequence"/&gt;
 *         &lt;element name="items" type="{}items" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="mnemonic" use="required" type="{}knotAndAttrMnemonic" /&gt;
 *       &lt;attribute name="identity" type="{}identity" /&gt;
 *       &lt;attribute name="dataRange" use="required" type="{}dataRange" /&gt;
 *       &lt;attribute name="skip" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "knot", propOrder = {
    "metadata",
    "layout",
    "description",
    "items"
})
public class Knot
    extends BaseObjectAttributes
    implements Serializable
{

    private final static long serialVersionUID = 202012110946L;
    protected ObjectMetadata metadata;
    protected Layout layout;
    protected String description;
    protected Items items;
    @XmlAttribute(name = "mnemonic", required = true)
    protected String mnemonic;
    @XmlAttribute(name = "identity")
    protected Identity identity;
    @XmlAttribute(name = "dataRange", required = true)
    protected DataRange dataRange;
    @XmlAttribute(name = "skip")
    protected Boolean skip;

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
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link Items }
     *     
     */
    public Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link Items }
     *     
     */
    public void setItems(Items value) {
        this.items = value;
    }

    /**
     * Gets the value of the mnemonic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnemonic() {
        return mnemonic;
    }

    /**
     * Sets the value of the mnemonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnemonic(String value) {
        this.mnemonic = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link Identity }
     *     
     */
    public Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identity }
     *     
     */
    public void setIdentity(Identity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the dataRange property.
     * 
     * @return
     *     possible object is
     *     {@link DataRange }
     *     
     */
    public DataRange getDataRange() {
        return dataRange;
    }

    /**
     * Sets the value of the dataRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRange }
     *     
     */
    public void setDataRange(DataRange value) {
        this.dataRange = value;
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

}
