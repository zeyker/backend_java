package service;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import facade.TagFacade;
import model.Tag;

@Path("/tags")
public class TagService {
	
	@EJB 
	TagFacade TagFacadeEJB;
	
	Logger logger = Logger.getLogger(TagService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Tag> findAll(){
		return TagFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Tag find(@PathParam("id") Integer id) {
        return TagFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(Tag entity) {
		TagFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Tag entity) {
    	entity.setTagId(id.intValue());
    	TagFacadeEJB.edit(entity);
    }
	

}
