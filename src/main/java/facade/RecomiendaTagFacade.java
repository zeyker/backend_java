package facade;

import java.util.List;

import javax.ejb.Local;

import model.RecomendacionTag;

@Local
public interface RecomiendaTagFacade {

	public void create(RecomendacionTag entity);

	public void edit(RecomendacionTag entity);

	public void remove(RecomendacionTag entity);
	

	public RecomendacionTag find(Object id);

	public List<RecomendacionTag> findAll();

	public List<RecomendacionTag> findRange(int[] range);

	public int count();

}
