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
	
	@Column(name="rating",  nullable=false)
	private int valoracion;
	
	@Column(name="idUsuario",  nullable=false)
	private int userId;
	
	@Column(name="Fecha", nullable=false)
	private Timestamp fecha;
	
	@Column(name="Texto", nullable=false, length=45)
	private String texto;
	
	@Column(name="idPublicacion",  nullable=false)
	private int publicacionId;
	
	
	

	public Valoracion() {
	}

	public int getValoracionId() {
		return this.valoracionId;
	}

	public void setValoracionId(int valId) {
		this.valoracionId = valId;
	}
	
	public int getValoracion() {
		return this.valoracion;
	}

	public void setValoracion(int val) {
		this.valoracion = val;
	}
	
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int uId) {
		this.userId = uId;
	}
	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp date) {
		this.fecha = date;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String com) {
		this.texto = com;
	}
	public int getPublicacionId() {
		return this.publicacionId;
	}

	public void setPublicacionId(int pubId) {
		this.publicacionId = pubId;
	}
	
	



	

	

	

}