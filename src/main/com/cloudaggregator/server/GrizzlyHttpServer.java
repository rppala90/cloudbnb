package com.cloudaggregator.server;

import com.cloudaggregator.resources.BasicResource;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.grizzly.http.server.HttpServer;

import java.net.URI;
import javax.ws.rs.core.UriBuilder;

public class GrizzlyHttpServer {

  public static void main(String args[]) {
    URI baseUri = UriBuilder.fromUri("http://localhost/").port(2222).build();
    ResourceConfig resourceConfig = new ResourceConfig(BasicResource.class);
    HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseUri, resourceConfig);
    System.out.println("Press enter to stop the server...");

  }

}