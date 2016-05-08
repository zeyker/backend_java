package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;



@Entity
@Table(name="Admin")
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idAdmin", unique=true, nullable=false)
	private int idAdmin;

	@Column(name="Nombre", nullable=false, length=45)
	private String nombreAdmin;

	@Column(name="Mail", nullable=false, length=45)
	private String mailAdmin;

	
	@Column(name="Contraseña", nullable=false, length=45)
	private String contraseñaAdmin;


	
	public Admin() {
	}

	public int getAdminId() {
		return this.idAdmin;
	}

	public void setAdminId(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getnombreAdmin() {
		return this.nombreAdmin;
	}

	public void setnombreAdmin(String nombreAdmin) {
		this.nombreAdmin = nombreAdmin;
	}

	public String getmailAdmin() {
		return this.mailAdmin;
	}

	public void setmailAdmin(String mailAdmin) {
		this.mailAdmin = mailAdmin;
	}

	

	public String getcontraseñaAdmin() {
		return this.contraseñaAdmin;
	}

	public void setcontraseñaAdmin(String contraseñaAdmin) {
		this.contraseñaAdmin = contraseñaAdmin;
	}



}