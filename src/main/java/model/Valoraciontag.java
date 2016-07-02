package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the actor database table.
 * 
 */
@Entity
@Table(name="Valoraciontag")
@NamedQuery(name="Valoraciontag.findAll", query="SELECT a FROM Valoraciontag a")
public class Valoraciontag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idvaloraciontag", nullable=false,unique=true)
	private int valoracionId;
	
	@Column(name="idRecomendacion",  nullable=false)
	private int idputag;
	
	@Column(name="iduser",  nullable=false)
	private int userId;
	
	@Column(name="rating",  nullable=false)
	private int rating;
	
	

	
	

	public Valoraciontag() {
	}

	public int getValoracionId() {
		return this.valoracionId;
	}
	
	public void setValoracionId(int valoracionId) {
		this.valoracionId = valoracionId;
	}
	public int getPublicacionId() {
		return this.idputag;
	}

	public void setPublicacionId(int idputag) {
		this.idputag = idputag;
	}
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	


	
	public int getValoracion() {
		return this.rating;
	}

	public void setValoracion(int val) {
		this.rating = val;
	}
	


	
	



	

	

	

}