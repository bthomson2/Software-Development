package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Brenda on 10/8/2015.
 */
@WebService()
class HelloWorld {
// --Commented out by Inspection START (10/19/2015 10:44 AM):
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
// --Commented out by Inspection STOP (10/19/2015 10:44 AM)
  public static void main(String[] argv) {
    Object implementor = new HelloWorld ();
    String address = "http://localhost:9000/HelloWorld";
    Endpoint.publish(address, implementor);
  }
}
