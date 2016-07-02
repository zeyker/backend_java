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

import facade.RecomiendaTagFacade;
import model.RecomendacionTag;

@Path("/recomiendaalgo")
public class RecomiendaTagService {
	
	@EJB 
	RecomiendaTagFacade RecomiendaTagFacadeEJB;
	
	Logger logger = Logger.getLogger(RecomiendaTagService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<RecomendacionTag> findAll(){
		return RecomiendaTagFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public RecomendacionTag find(@PathParam("id") Integer id) {
        return RecomiendaTagFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(RecomendacionTag entity) {
		RecomiendaTagFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, RecomendacionTag entity) {
    	entity.setPubId(id.intValue());
    	RecomiendaTagFacadeEJB.edit(entity);
    }
	

}
