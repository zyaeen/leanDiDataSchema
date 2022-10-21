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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}baseObjectAttributes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="innerColumn" type="{}columnDescription" maxOccurs="25" minOccurs="0"/&gt;
 *         &lt;element name="constraints" type="{}constraintsType" minOccurs="0"/&gt;
 *         &lt;element name="indexes" type="{}indexesType" minOccurs="0"/&gt;
 *         &lt;group ref="{}baseObjectSequence"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="mnemonic" use="required" type="{}knotAndAttrMnemonic" /&gt;
 *       &lt;attribute name="dataRange" type="{}dataRange" /&gt;
 *       &lt;attribute name="timeRange" type="{}identity" /&gt;
 *       &lt;attribute name="knotRange" type="{}knotAndAttrMnemonic" /&gt;
 *       &lt;attribute name="included" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nullable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="skip" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="logicalType" type="{}propertyType" /&gt;
 *       &lt;attribute name="restrictedAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attribute", propOrder = {
    "innerColumn",
    "constraints",
    "indexes",
    "metadata",
    "layout",
    "description"
})
public class Attribute
    extends BaseObjectAttributes
    implements Serializable
{

    private final static long serialVersionUID = 202012110946L;
    protected List<ColumnDescription> innerColumn;
    protected ConstraintsType constraints;
    protected IndexesType indexes;
    protected ObjectMetadata metadata;
    protected Layout layout;
    protected String description;
    @XmlAttribute(name = "mnemonic", required = true)
    protected String mnemonic;
    @XmlAttribute(name = "dataRange")
    protected DataRange dataRange;
    @XmlAttribute(name = "timeRange")
    protected Identity timeRange;
    @XmlAttribute(name = "knotRange")
    protected String knotRange;
    @XmlAttribute(name = "included")
    protected Boolean included;
    @XmlAttribute(name = "columnName")
    protected String columnName;
    @XmlAttribute(name = "nullable")
    protected Boolean nullable;
    @XmlAttribute(name = "skip")
    protected Boolean skip;
    @XmlAttribute(name = "logicalType")
    protected PropertyType logicalType;
    @XmlAttribute(name = "restrictedAccess")
    protected Boolean restrictedAccess;
    @XmlAttribute(name = "default")
    @XmlSchemaType(name = "anySimpleType")
    protected String _default;

    /**
     * Gets the value of the innerColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the innerColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnerColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnDescription }
     * 
     * 
     */
    public List<ColumnDescription> getInnerColumn() {
        if (innerColumn == null) {
            innerColumn = new ArrayList<ColumnDescription>();
        }
        return this.innerColumn;
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
     * Gets the value of the knotRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnotRange() {
        return knotRange;
    }

    /**
     * Sets the value of the knotRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnotRange(String value) {
        this.knotRange = value;
    }

    /**
     * Gets the value of the included property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncluded() {
        if (included == null) {
            return false;
        } else {
            return included;
        }
    }

    /**
     * Sets the value of the included property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncluded(Boolean value) {
        this.included = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the nullable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNullable() {
        if (nullable == null) {
            return false;
        } else {
            return nullable;
        }
    }

    /**
     * Sets the value of the nullable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNullable(Boolean value) {
        this.nullable = value;
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
     * Gets the value of the logicalType property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getLogicalType() {
        return logicalType;
    }

    /**
     * Sets the value of the logicalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setLogicalType(PropertyType value) {
        this.logicalType = value;
    }

    /**
     * Gets the value of the restrictedAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRestrictedAccess() {
        if (restrictedAccess == null) {
            return false;
        } else {
            return restrictedAccess;
        }
    }

    /**
     * Sets the value of the restrictedAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedAccess(Boolean value) {
        this.restrictedAccess = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

}