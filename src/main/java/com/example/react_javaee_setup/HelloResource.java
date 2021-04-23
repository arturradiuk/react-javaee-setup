package com.example.react_javaee_setup;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/greeting")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public Response hello() {

//        return "Hello, World!";
        return Response.ok()
//                .header("Access-Control-Allow-Origin", "http://localhost:3000/")
                .entity("Hello, World!")
                .build();
    }
}