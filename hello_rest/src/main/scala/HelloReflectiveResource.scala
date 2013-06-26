package org.geoserver.hellorest

import org.geoserver.rest.ReflectiveResource

class HelloReflectiveResource extends ReflectiveResource {
  override def handleObjectGet(): AnyRef = {
    return new Hello("Hello World")
  }
}
