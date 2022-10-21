package org.leandi;

import com.fasterxml.jackson.core.JsonProcessingException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import jakarta.xml.bind.*;
import org.leandi.datalandscape.DataLandscapeSchema;
import org.leandi.datalandscape.DomainSchema;
import org.leandi.schema.Schema;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    DataLandscapeSchema dataLandscapeSchema;
    File file;
    Schema schema;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("dossier.xml").getFile());
        var filemap = new TreeMap<String, File> ();
        filemap.put("1", file);
        dataLandscapeSchema = new DataLandscapeSchema("1",null, filemap);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp(){
        String s;
        try {
            s = dataLandscapeSchema.
                    getDomainSchemaMap().
                    get("1").getAnchors();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        assertTrue( true );
    }

    public  void testJsonSerializer(){

    }
}
