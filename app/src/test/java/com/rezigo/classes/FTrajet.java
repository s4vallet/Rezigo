package com.rezigo.classes;
//import java.util.Date;

public class FTrajet extends Formulaire {

	
	private String activite;
	private String tailleBagage;
	private String description;
	private String destination;
	private int nbPlace;
	private Date date;
	private float plageHoraire;
	
	
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}

	public String getTailleBagage() {
		return tailleBagage;
	}
	public void setTailleBagage(String tailleBagage) {
		this.tailleBagage = tailleBagage;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public float getPlageHoraire() {
		return plageHoraire;
	}
	public void setPlageHoraire(float plageHoraire) {
		this.plageHoraire = plageHoraire;
	}
	
	
	
	
	
}
