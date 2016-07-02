package facade;

import java.util.List;

import javax.ejb.Local;

import model.Valoraciontag;

@Local
public interface ValoraciontagFacade {

	public void create(Valoraciontag entity);

	public void edit(Valoraciontag entity);

	public void remove(Valoraciontag entity);
	

	public Valoraciontag find(Object id);

	public List<Valoraciontag> findAll();

	public List<Valoraciontag> findRange(int[] range);

	public int count();

}
