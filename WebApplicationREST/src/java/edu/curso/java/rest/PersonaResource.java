/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.curso.java.rest;

import edu.curso.java.rest.bo.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author educacionit
 */
@Path("Persona")
public class PersonaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PersonaResource
     */
    public PersonaResource() {
    }
    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response recuperarPersona(@PathParam("id") int id){
        Persona p1 = new Persona();
        p1.setId(id);
        p1.setApellido("Perez");
        p1.setNombre("Juan");
        return Response.status(200).entity(p1).build();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response recuperarPersonas(){
        List<Persona> personas = new ArrayList<>();
        Persona p1 = new Persona();
        p1.setId(1);
        p1.setApellido("Perez");
        p1.setNombre("Juan");
        personas.add(p1);
        
        Persona p2 = new Persona();
        p2.setId(2);
        p2.setApellido("Lopez");
        p2.setNombre("Marta");
        personas.add(p2);
        
        GenericEntity<List<Persona>> lista = new GenericEntity<List<Persona>> (personas) {};
        
        return Response.status(200).entity(lista).build();
    }

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response altaDePersonas(Persona persona){        
        return Response.status(201).entity(persona).build();
    }
    
    @PUT
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response actualizarPersona(Persona persona){        
        return Response.status(201).entity(persona).build();
    }
    
    @DELETE
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response borrarPersona(@PathParam("id") int id){        
        return Response.status(201).build();
    }
    
}
