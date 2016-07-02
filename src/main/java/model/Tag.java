package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the actor database table.
 * 
 */
@Entity
@Table(name="Tag")
@NamedQuery(name="Tag.findAll", query="SELECT a FROM Tag a")
public class Tag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idTag", nullable=false,unique=true)
	private int tagId;
	
	@Column(name="Texto",  nullable=true)
	private String texto;
	


	
	

	public Tag() {
	}

	public int getTagId() {
		return this.tagId;
	}
	
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	public String getTag() {
		return this.texto;
	}

	public void setTag(String texto) {
		this.texto = texto;
	}	


	
	



	

	

	

}