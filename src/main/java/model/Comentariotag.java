package model;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the actor database table.
 * 
 */
@Entity
@Table(name="Comentariotag")
@NamedQuery(name="Comentariotag.findAll", query="SELECT a FROM Comentariotag a")
public class Comentariotag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idComentariotag", nullable=false,unique=true)
	private int cometagId;
	
	@Column(name="idTag",  nullable=false)
	private int idputag;
	
	@Column(name="idComentario",  nullable=false)
	private int comentId;
	
	
	

	
	

	public Comentariotag() {
	}

	public int getcometagId() {
		return this.cometagId;
	}
	
	public void setcometagId(int cometagId) {
		this.cometagId = cometagId;
	}
	public int getPublicacionId() {
		return this.idputag;
	}

	public void setPublicacionId(int idputag) {
		this.idputag = idputag;
	}
	public int getcomentId() {
		return this.comentId;
	}

	public void setcomentId(int comentId) {
		this.comentId = comentId;
	}
	


	
	



	

	

	

}