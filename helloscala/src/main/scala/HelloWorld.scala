import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class HelloWorld {
  def sayHello(request: HttpServletRequest, response: HttpServletResponse){
    response.getOutputStream().write( "Hello World!!".getBytes() );
  }
}
