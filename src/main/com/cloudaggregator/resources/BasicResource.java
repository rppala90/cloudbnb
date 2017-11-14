package com.cloudaggregator.resources;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("getip")
public class BasicResource {
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getIt() {
    String ip = (92 + new Random().nextInt(4)) + "." + (120 + new Random().nextInt(9))
        + "." + new Random().nextInt(64) + "." + new Random().nextInt(99);
    return ip;
  }
}