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

import facade.ValoraciontagFacade;
import model.Valoraciontag;

@Path("/valoracionestag")
public class ValoraciontagService {
	
	@EJB 
	ValoraciontagFacade valoraciontagFacadeEJB;
	
	Logger logger = Logger.getLogger(ValoraciontagService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Valoraciontag> findAll(){
		return valoraciontagFacadeEJB.findAll();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Valoraciontag find(@PathParam("id") Integer id) {
        return valoraciontagFacadeEJB.find(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(Valoraciontag entity) {
		valoraciontagFacadeEJB.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Valoraciontag entity) {
    	entity.setValoracionId(id.intValue());
    	valoraciontagFacadeEJB.edit(entity);
    }
	

}
