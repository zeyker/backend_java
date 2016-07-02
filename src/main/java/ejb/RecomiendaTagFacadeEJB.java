package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.RecomiendaTagFacade;
import model.RecomendacionTag;

@Stateless
public class RecomiendaTagFacadeEJB extends AbstractFacade<RecomendacionTag> implements RecomiendaTagFacade {
	
	
	@PersistenceContext(unitName = "sakilaPU")
	private EntityManager em;
	
	public RecomiendaTagFacadeEJB() {
		super(RecomendacionTag.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}

}
