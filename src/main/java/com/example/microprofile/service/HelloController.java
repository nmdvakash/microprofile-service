package com.example.microprofile.service;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 */

@Singleton
@Path("/hello")
public class HelloController {

	@GET
	public String sayHello() {
		return "Hello World";
	}

	@Path("/test/{name}")
	@GET
	public String sayHelloForPathVariable(@PathParam(value = "name") String name) {
		return "Hello :: " + name;
	}
}
