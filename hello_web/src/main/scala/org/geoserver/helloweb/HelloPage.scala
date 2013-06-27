package org.geoserver.helloweb

import org.apache.wicket.markup.html.basic.Label
import org.geoserver.web.GeoServerBasePage

class HelloPage extends GeoServerBasePage {
  add(new Label("hellolabel", "Hello World!!"))
}
