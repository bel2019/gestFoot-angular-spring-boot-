package com.gestFootBall.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User{
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		    private long id;
			private String nom;
			private String prenom;
			private String email;
			private String motDePasse;
			private String telephone;
			private String adresse;
			private String sexe;
			private String nationalite;
			private String pseudoname;
			private String villeResidence;
			private String sportPrefere;
			private String equipePrefere;
			private String positionDeJeu;
			private String dureeExperience;
			
			
	
	public User() {
				super();
				// TODO Auto-generated constructor stub
			}



	public User(long id, String nom, String prenom, String email, String motDePasse, String telephone,
					String adresse, String sexe, String nationalite, String pseudoname, String villeResidence,
					String sportPrefere, String equipePrefere, String positionDeJeu, String dureeExperience) {
				super();
				this.id = id;
				this.nom = nom;
				this.prenom = prenom;
				this.email = email;
				this.motDePasse = motDePasse;
				this.telephone = telephone;
				this.adresse = adresse;
				this.sexe = sexe;
				this.nationalite = nationalite;
				this.pseudoname = pseudoname;
				this.villeResidence = villeResidence;
				this.sportPrefere = sportPrefere;
				this.equipePrefere = equipePrefere;
				this.positionDeJeu = positionDeJeu;
				this.dureeExperience = dureeExperience;
			}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMotDePasse() {
		return motDePasse;
	}



	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getSexe() {
		return sexe;
	}



	public void setSexe(String sexe) {
		this.sexe = sexe;
	}



	public String getNationalite() {
		return nationalite;
	}



	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}



	public String getPseudoname() {
		return pseudoname;
	}



	public void setPseudoname(String pseudoname) {
		this.pseudoname = pseudoname;
	}



	public String getVilleResidence() {
		return villeResidence;
	}



	public void setVilleResidence(String villeResidence) {
		this.villeResidence = villeResidence;
	}



	public String getSportPrefere() {
		return sportPrefere;
	}



	public void setSportPrefere(String sportPrefere) {
		this.sportPrefere = sportPrefere;
	}



	public String getEquipePrefere() {
		return equipePrefere;
	}



	public void setEquipePrefere(String equipePrefere) {
		this.equipePrefere = equipePrefere;
	}



	public String getPositionDeJeu() {
		return positionDeJeu;
	}



	public void setPositionDeJeu(String positionDeJeu) {
		this.positionDeJeu = positionDeJeu;
	}



	public String getDureeExperience() {
		return dureeExperience;
	}



	public void setDureeExperience(String dureeExperience) {
		this.dureeExperience = dureeExperience;
	}



	public User orElseThrow(Object object) {
				// TODO Auto-generated method stub
				return null;
			}
		
			
			
}
