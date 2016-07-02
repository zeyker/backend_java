package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.ComeTagFacade;
import model.Comentariotag;

@Stateless
public class ComeTagFacadeEJB extends AbstractFacade<Comentariotag> implements ComeTagFacade {
	
	
	@PersistenceContext(unitName = "sakilaPU")
	private EntityManager em;
	
	public ComeTagFacadeEJB() {
		super(Comentariotag.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}

}
