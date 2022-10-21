//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.20 at 04:23:58 PM MSK 
//


package org.leandi.schema;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.leandi.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Schema_QNAME = new QName("", "schema");
    private final static QName _AnchorRoleDescription_QNAME = new QName("", "description");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.leandi.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Schema }
     * 
     */
    public Schema createSchema() {
        return new Schema();
    }

    /**
     * Create an instance of {@link SchemaMetadata }
     * 
     */
    public SchemaMetadata createSchemaMetadata() {
        return new SchemaMetadata();
    }

    /**
     * Create an instance of {@link Layout }
     * 
     */
    public Layout createLayout() {
        return new Layout();
    }

    /**
     * Create an instance of {@link Knot }
     * 
     */
    public Knot createKnot() {
        return new Knot();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link ColumnsType }
     * 
     */
    public ColumnsType createColumnsType() {
        return new ColumnsType();
    }

    /**
     * Create an instance of {@link ConstraintType }
     * 
     */
    public ConstraintType createConstraintType() {
        return new ConstraintType();
    }

    /**
     * Create an instance of {@link ConstraintsType }
     * 
     */
    public ConstraintsType createConstraintsType() {
        return new ConstraintsType();
    }

    /**
     * Create an instance of {@link IndexType }
     * 
     */
    public IndexType createIndexType() {
        return new IndexType();
    }

    /**
     * Create an instance of {@link IndexesType }
     * 
     */
    public IndexesType createIndexesType() {
        return new IndexesType();
    }

    /**
     * Create an instance of {@link ColumnDescription }
     * 
     */
    public ColumnDescription createColumnDescription() {
        return new ColumnDescription();
    }

    /**
     * Create an instance of {@link Anchor }
     * 
     */
    public Anchor createAnchor() {
        return new Anchor();
    }

    /**
     * Create an instance of {@link AnchorRole }
     * 
     */
    public AnchorRole createAnchorRole() {
        return new AnchorRole();
    }

    /**
     * Create an instance of {@link Tie }
     * 
     */
    public Tie createTie() {
        return new Tie();
    }

    /**
     * Create an instance of {@link KnotRole }
     * 
     */
    public KnotRole createKnotRole() {
        return new KnotRole();
    }

    /**
     * Create an instance of {@link ObjectMetadata }
     * 
     */
    public ObjectMetadata createObjectMetadata() {
        return new ObjectMetadata();
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link PropertyId }
     * 
     */
    public PropertyId createPropertyId() {
        return new PropertyId();
    }

    /**
     * Create an instance of {@link GroupId }
     * 
     */
    public GroupId createGroupId() {
        return new GroupId();
    }

    /**
     * Create an instance of {@link BaseObjectAttributes }
     * 
     */
    public BaseObjectAttributes createBaseObjectAttributes() {
        return new BaseObjectAttributes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Schema }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Schema }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "schema")
    public JAXBElement<Schema> createSchema(Schema value) {
        return new JAXBElement<Schema>(_Schema_QNAME, Schema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "description", scope = AnchorRole.class)
    public JAXBElement<String> createAnchorRoleDescription(String value) {
        return new JAXBElement<String>(_AnchorRoleDescription_QNAME, String.class, AnchorRole.class, value);
    }

}
