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

import facade.LugarFacade;
import model.Lugar;

@Path("/publicaciones")
public class LugarService {
	
	@EJB 
	LugarFacade lugarFacadeEJB;
	
	Logger logger = Logger.getLogger(LugarService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Lugar> findAll(){
		return lugarFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Lugar find(@PathParam("id") Integer id) {
        return lugarFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(Lugar entity) {
		lugarFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Lugar entity) {
    	entity.setPubId(id.intValue());
    	lugarFacadeEJB.edit(entity);
    }
	

}
