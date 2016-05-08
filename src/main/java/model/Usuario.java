package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;



@Entity
@Table(name="Usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT a FROM Usuario a")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idUsuario", unique=true, nullable=false)
	private int idUsuario;

	@Column(name="Nombre", nullable=false, length=45)
	private String nombreUser;

	@Column(name="Mail", nullable=false, length=45)
	private String mailUser;

	
	@Column(name="Contraseña", nullable=false, length=45)
	private String contraseñaUser;


	
	public Usuario() {
	}

	public int getUserId() {
		return this.idUsuario;
	}

	public void setUserId(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getnombreUser() {
		return this.nombreUser;
	}

	public void setnombreUser(String nombreUser) {
		this.nombreUser = nombreUser;
	}

	public String getmailUser() {
		return this.mailUser;
	}

	public void setmailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	

	public String getcontraseñaUser() {
		return this.contraseñaUser;
	}

	public void setcontraseñaUser(String contraseñaUser) {
		this.contraseñaUser = contraseñaUser;
	}



}