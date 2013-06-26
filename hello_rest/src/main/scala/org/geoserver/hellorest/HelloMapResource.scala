package org.geoserver.hellorest

import java.util.Map
import java.util.HashMap
import org.geoserver.rest.MapResource

class HelloMapResource extends MapResource {
  override def getMap() = {
    val map = new HashMap[String, String]()
    map.put( "message", "Hello World")
    map
  }
}
