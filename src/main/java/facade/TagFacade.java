package facade;

import java.util.List;

import javax.ejb.Local;

import model.Tag;

@Local
public interface TagFacade {

	public void create(Tag entity);

	public void edit(Tag entity);

	public void remove(Tag entity);
	

	public Tag find(Object id);

	public List<Tag> findAll();

	public List<Tag> findRange(int[] range);

	public int count();

}
