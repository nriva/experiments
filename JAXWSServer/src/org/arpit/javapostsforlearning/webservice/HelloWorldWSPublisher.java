package org.arpit.javapostsforlearning.webservice;
import javax.xml.ws.Endpoint;

public class HelloWorldWSPublisher {
 public static void main(String[] args) {
  Endpoint.publish("http://localhost:8080/HelloWorld/HelloWorld",new HelloWorldImpl());
 }
}
