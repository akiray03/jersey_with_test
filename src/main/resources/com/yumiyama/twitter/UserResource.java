package com.yumiyama.twitter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{username}")
	public User getUser(@PathParam("username") String userName) {
		User u = new User();
		u.userName = userName;
		return u;
	}
}
