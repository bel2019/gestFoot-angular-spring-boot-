package com.gestFootBall.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Reservation {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String typeDeMatch;
	private String niveauDuMatch;
	private String VisibiliteDuMatch;
	private String dateDuMatch;
	private String choixDuTerrain;
	
	
	
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Reservation(long id, String typeDeMatch, String niveauDuMatch, String visibiliteDuMatch, String dateDuMatch,
			String choixDuTerrain) {
		super();
		this.id = id;
		this.typeDeMatch = typeDeMatch;
		this.niveauDuMatch = niveauDuMatch;
		this.VisibiliteDuMatch = visibiliteDuMatch;
		this.dateDuMatch = dateDuMatch;
		this.choixDuTerrain = choixDuTerrain;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getTypeDeMatch() {
		return typeDeMatch;
	}
	public void setTypeDeMatch(String typeDeMatch) {
		this.typeDeMatch = typeDeMatch;
	}
	public String getNiveauDuMatch() {
		return niveauDuMatch;
	}
	public void setNiveauDuMatch(String niveauDuMatch) {
		this.niveauDuMatch = niveauDuMatch;
	}
	public String getVisibiliteDuMatch() {
		return VisibiliteDuMatch;
	}
	public void setVisibiliteDuMatch(String visibiliteDuMatch) {
		this.VisibiliteDuMatch = visibiliteDuMatch;
	}
	public String getDateDuMatch() {
		return dateDuMatch;
	}
	public void setDateDuMatch(String dateDuMatch) {
		this.dateDuMatch = dateDuMatch;
	}
	public String getChoixDuTerrain() {
		return choixDuTerrain;
	}
	public void setChoixDuTerrain(String choixDuTerrain) {
		this.choixDuTerrain = choixDuTerrain;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", typeDeMatch=" + typeDeMatch + ", niveauDuMatch=" + niveauDuMatch
				+ ", VisibiliteDuMatch=" + VisibiliteDuMatch + ", dateDuMatch=" + dateDuMatch + ", choixDuTerrain="
				+ choixDuTerrain + "]";
	}
	

	
	
	
	
	
	
}
