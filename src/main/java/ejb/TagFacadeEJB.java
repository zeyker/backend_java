package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.TagFacade;
import model.Tag;

@Stateless
public class TagFacadeEJB extends AbstractFacade<Tag> implements TagFacade {
	
	
	@PersistenceContext(unitName = "sakilaPU")
	private EntityManager em;
	
	public TagFacadeEJB() {
		super(Tag.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}

}
