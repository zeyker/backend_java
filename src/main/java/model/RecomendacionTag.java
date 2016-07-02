package model;

import java.io.Serializable;
import javax.persistence.*;




@Entity
@Table(name="RecomendacionTag")
@NamedQuery(name="RecomendacionTag.findAll", query="SELECT a FROM RecomendacionTag a")
public class RecomendacionTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idRecomendacion", unique=true, nullable=false)
	private int recomendacionId;

	@Column(name="Texto", nullable=false, length=45)
	private String textito;
	@Column(name="rating_avg", nullable=true)
	private double valoracionPub;

	
	@Column(name="rating_sum", nullable=true)
	private int sumavalPub;
	@Column(name="rating_count", nullable=true)
	private int cantidavalPub;

	public RecomendacionTag() {
	}

	public int getPubId() {
		return this.recomendacionId;
	}

	public void setPubId(int publicacionId) {
		this.recomendacionId = publicacionId;
	}

	public String getnombrePub() {
		return this.textito;
	}

	public void setnombrePub(String nombrePub) {
		this.textito = nombrePub;
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
	
	

}

