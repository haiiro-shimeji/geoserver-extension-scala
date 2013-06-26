package org.geoserver.hellorest

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

import org.geoserver.test.GeoServerTestSupport
import junit.framework.Assert._

class HelloReflectiveResourceTest extends GeoServerTestSupport {
  def testGetAsXML() {
    //make the request, parsing the result as a dom
    val dom = getAsDOM( "/rest/hello.xml" );

    //print out the result
    print(dom);

    //make assertions
    val message = getFirstElementByTagName( dom, "message");
    assertNotNull(message);
    assertEquals( "Hello World", message.getFirstChild().getNodeValue() );
  }
  def testGetAsJSON() {
    //make the request, parsing the result into a json object
    val json = getAsJSON( "/rest/hello.json");

    //print out the result
    print(json);

    //make assertions
    assertTrue( json.isInstanceOf[JSONObject] );
    val hello = json.asInstanceOf[JSONObject].getJSONObject( "org.geoserver.hellorest.Hello" );
    assertEquals( "Hello World", hello.get( "message" ) );
  }
}
