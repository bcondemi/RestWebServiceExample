
package com.bc.exampple.restws;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Bruno Condemi
 */
@Path("people")
public class PeopleResource {

    @Context
    private UriInfo context;

    public PeopleResource() {
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getXml() throws JsonProcessingException {
       
        String jsonInString=null;
        ObjectMapper mapper = new ObjectMapper();
        
        People p = new People();
        p.setFirstName("Bruno");
        p.setLastName("Condemi");
        p.setAge(38);
        
        jsonInString = mapper.writeValueAsString(p);
        return  jsonInString;
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putXml(People content) {
    }
}
