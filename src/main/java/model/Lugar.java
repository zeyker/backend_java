package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;




@Entity
@Table(name="Lugar")
@NamedQuery(name="Lugar.findAll", query="SELECT a FROM Lugar a")
public class Lugar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idPublicacion", unique=true, nullable=false)
	private int publicacionId;

	@Column(name="Nombre", nullable=false, length=45)
	private String nombrePub;

	@Column(name="Descripcion", nullable=false, length=45)
	private String descripcionPub;

	@Column(name="rating_avg", nullable=true)
	private double valoracionPub;

	@Column(name="Codigo", nullable=false, length=45)
	private String codigoPub;


	@Column(name="tipoLugar", nullable=false)
	private int TipoPublicacionPub;


	@Column(name="lat", nullable=false)
	private BigDecimal latPub;
	

	@Column(name="lon", nullable=false)
	private BigDecimal lonPub;
	
	@Column(name="rating_sum", nullable=false)
	private int sumavalPub;
	@Column(name="rating_count", nullable=false)
	private int cantidavalPub;
	
	@Column(name="pago", nullable=false, length=45)
	private String pagoPub;

	public Lugar() {
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
	
	public String getpagoPub() {
		return this.pagoPub;
	}
	
	
	public void setpagoPub(String pagoPub) {
		this.pagoPub = pagoPub;
	}

	

	public double getvaloracionPub() {
		return this.valoracionPub;
	}

	public void setvaloracionPub(double valoracionPub) {
		this.valoracionPub = valoracionPub;
	}
	
	
	public int getsumaPub() {
		return this.sumavalPub;
	}

	public void setsumaPub(int sumavalPub) {
		this.sumavalPub = sumavalPub;
	}
	
	
	public int getcantidad() {
		return this.cantidavalPub;
	}
	
	public void setcantidad(int cantidavalPub) {
		this.cantidavalPub = cantidavalPub;
	}
	
	
	public int getTipoPublicacionPub() {
		return this.TipoPublicacionPub;
	}
	public void setTipoPublicacionPub(int TipoPublicacionPub) {
		this.TipoPublicacionPub = TipoPublicacionPub;
	}
	
	
	public String getcodigoPub() {
		return this.codigoPub;
	}

	public void setcodigoPub(String codigoPub) {
		this.codigoPub = codigoPub;
	}

	
	public BigDecimal getlatPub() {
		return this.latPub;
	}

	public void setlatPub(BigDecimal latPub) {
		this.latPub = latPub;
	}
	public BigDecimal getlonPub() {
		return this.lonPub;
	}

	public void setlonPub(BigDecimal lonPub) {
		this.lonPub = lonPub;
	}


}