package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.ValoracionFacade;
import model.Valoracion;

@Stateless
public class ValoracionFacadeEJB extends AbstractFacade<Valoracion> implements ValoracionFacade {
	
	
	@PersistenceContext(unitName = "sakilaPU")
	private EntityManager em;
	
	public ValoracionFacadeEJB() {
		super(Valoracion.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}

}
