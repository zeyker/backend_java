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

import facade.ComeTagFacade;
import model.Comentariotag;

@Path("/comentariosytag")
public class ComeTagService {
	
	@EJB 
	ComeTagFacade ComeTagFacadeEJB;
	
	Logger logger = Logger.getLogger(ComeTagService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Comentariotag> findAll(){
		return ComeTagFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Comentariotag find(@PathParam("id") Integer id) {
        return ComeTagFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(Comentariotag entity) {
		ComeTagFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Comentariotag entity) {
    	entity.setcometagId(id.intValue());
    	ComeTagFacadeEJB.edit(entity);
    }
	

}
