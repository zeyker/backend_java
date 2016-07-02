package facade;

import java.util.List;

import javax.ejb.Local;

import model.Comentariotag;

@Local
public interface ComeTagFacade {

	public void create(Comentariotag entity);

	public void edit(Comentariotag entity);

	public void remove(Comentariotag entity);
	

	public Comentariotag find(Object id);

	public List<Comentariotag> findAll();

	public List<Comentariotag> findRange(int[] range);

	public int count();

}
