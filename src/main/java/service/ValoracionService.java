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

import facade.ValoracionFacade;
import model.Valoracion;

@Path("/valoraciones")
public class ValoracionService {
	
	@EJB 
	ValoracionFacade valoracionFacadeEJB;
	
	Logger logger = Logger.getLogger(ValoracionService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Valoracion> findAll(){
		return valoracionFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Valoracion find(@PathParam("id") Integer id) {
        return valoracionFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(Valoracion entity) {
		valoracionFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Valoracion entity) {
    	entity.setValoracionId(id.intValue());
    	valoracionFacadeEJB.edit(entity);
    }
	

}
