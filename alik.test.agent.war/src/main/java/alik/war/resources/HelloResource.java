package alik.war.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import alik.war.greeting.Greeting;

@Path("/hello")
public class HelloResource
{
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Greeting hello(@PathParam("param") String name) {
		return new Greeting(name);
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String helloUsingJson(Greeting greeting) {
		return greeting.getMessage() + "\n";
	}
}
