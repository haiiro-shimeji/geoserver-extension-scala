package org.geoserver.hellorest

import java.util.List
import java.util.ArrayList
import org.geoserver.rest.format.StringFormat
import org.geoserver.rest.AbstractResource
import org.geoserver.rest.format.DataFormat
import org.restlet.data.Request
import org.restlet.data.Response
import org.restlet.data.MediaType

class HelloResource extends AbstractResource {
    override def createSupportedFormats(request: Request, response: Response): List[DataFormat] = {
        val formats = new ArrayList[DataFormat]()
        formats.add(new StringFormat( MediaType.TEXT_PLAIN ))
        return formats
    }
    override def handleGet() {
        //get the appropriate format
        val format = getFormatGet()
        //transform the string "Hello World" to the appropriate response
        getResponse().setEntity(format.toRepresentation("Hello World"))
    }
}
