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

import facade.PublicacionFacade;
import model.Publicacion;

@Path("/publicaciones")
public class PublicacionService {
	
	@EJB 
	PublicacionFacade publicacionFacadeEJB;
	
	Logger logger = Logger.getLogger(PublicacionService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Publicacion> findAll(){
		return publicacionFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Publicacion find(@PathParam("id") Integer id) {
        return publicacionFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(Publicacion entity) {
		publicacionFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Publicacion entity) {
    	entity.setPubId(id.intValue());
    	publicacionFacadeEJB.edit(entity);
    }
	

}
