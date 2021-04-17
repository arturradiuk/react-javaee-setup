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
                .header("Access-Control-Allow-Origin", "*")
//                .header("Access-Control-Allow-Headers", "*")
//                .header("Access-Control-Allow-Credentials", "true")
//                .header("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS,HEAD")
//                .header("Access-Control-Max-Age", "1209600")
                .entity("Hello, World!")
                .build();
    }
}