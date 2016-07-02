package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.ValoraciontagFacade;
import model.Valoraciontag;

@Stateless
public class ValoraciontagFacadeEJB extends AbstractFacade<Valoraciontag> implements ValoraciontagFacade {
	
	
	@PersistenceContext(unitName = "sakilaPU")
	private EntityManager em;
	
	public ValoraciontagFacadeEJB() {
		super(Valoraciontag.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}

}
