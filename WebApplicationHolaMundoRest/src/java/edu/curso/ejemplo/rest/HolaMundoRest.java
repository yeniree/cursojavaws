/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.curso.ejemplo.rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author educacionit
 */
@Path("holamundo")
public class HolaMundoRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HolaMundoRest
     */
    public HolaMundoRest() {
    }

    @GET
    @Path("{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response saludarConNombre(@PathParam("nombre") String nombre) {
        return Response.status(200).entity("Nombre: " + nombre).build();
    }

    /**
     * Retrieves representation of an instance of
     * edu.curso.ejemplo.rest.HolaMundoRest
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String saludar() {
        return "Hola Mundo";
    }

    /**
     * PUT method for updating or creating an instance of HolaMundoRest
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void saludarEnviandoDatos(String content) {
        System.out.println("Contenido: " + content);
    }
}
