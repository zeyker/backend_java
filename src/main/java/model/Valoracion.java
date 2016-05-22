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
@Table(name="Valoracion")
@NamedQuery(name="Valoracion.findAll", query="SELECT a FROM Valoracion a")
public class Valoracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idvaloracion", nullable=false,unique=true)
	private int valoracionId;
	
	@Column(name="idUsuario",  nullable=false)
	private int userId;
	
	@Column(name="idPublicacion",  nullable=false)
	private int publicacionId;
	
	@Column(name="rating",  nullable=false)
	private int valoracion;

	public Valoracion() {
	}

	public int getValoracionId() {
		return this.valoracionId;
	}

	public void setValoracionId(int valId) {
		this.valoracionId = valId;
	}
	
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int valId) {
		this.userId = valId;
	}
	
	public int getPublicacionId() {
		return this.publicacionId;
	}

	public void setPublicacionId(int valId) {
		this.publicacionId = valId;
	}
	
	public int getValoracion() {
		return this.valoracion;
	}

	public void setValoracion(int valId) {
		this.valoracion = valId;
	}

	

	

	

}