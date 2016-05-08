package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;



@Entity
@Table(name="Publicación")
@NamedQuery(name="Publicacion.findAll", query="SELECT a FROM Publicacion a")
public class Publicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idPublicacion", unique=true, nullable=false)
	private int publicacionId;

	@Column(name="Nombre", nullable=false, length=45)
	private String nombrePub;

	@Column(name="Descripcion", nullable=false, length=45)
	private String descripcionPub;

	@Column(name="Valoracion", nullable=false)
	private int valoracionPub;

	@Column(name="Codigo", nullable=false, length=45)
	private String codigoPub;


	@Column(name="TipoPublicacion", nullable=false)
	private int TipoPublicacionPub;

	@Column(name="Admin_idAdmin",  nullable=false)
	private int Admin_idAdmin;

	public Publicacion() {
	}

	public int getPubId() {
		return this.publicacionId;
	}

	public void setPubId(int publicacionId) {
		this.publicacionId = publicacionId;
	}

	public String getnombrePub() {
		return this.nombrePub;
	}

	public void setnombrePub(String nombrePub) {
		this.nombrePub = nombrePub;
	}

	public String getdescripcionPub() {
		return this.descripcionPub;
	}

	public void setdescripcionPub(String descripcionPub) {
		this.descripcionPub = descripcionPub;
	}
	public int getvaloracionPub() {
		return this.valoracionPub;
	}

	public void setvaloracionPub(int valoracionPub) {
		this.valoracionPub = valoracionPub;
	}
	public int getTipoPublicacionPub() {
		return this.TipoPublicacionPub;
	}

	public void setTipoPublicacionPub(int TipoPublicacionPub) {
		this.TipoPublicacionPub = TipoPublicacionPub;
	}
	public int getAdmin_idAdmin() {
		return this.Admin_idAdmin;
	}

	public void Admin_idAdmin(int Admin_idAdmin) {
		this.Admin_idAdmin = Admin_idAdmin;
	}
	public String getcodigoPub() {
		return this.codigoPub;
	}

	public void setcodigoPub(String codigoPub) {
		this.codigoPub = codigoPub;
	}



}