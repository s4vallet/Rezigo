package com.rezigo.classes;

import java.util.Date;
import java.util.Vector;


public class Profil {

	private Voiture voiture;
	private FProfil fProfil;
	private Vector<Trajet> propose;
	private Vector<Trajet> rejoint;
	
	
	
	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public FProfil getfProfil() {
		return fProfil;
	}

	public void setfProfil(FProfil fProfil) {
		this.fProfil = fProfil;
	}

	public Vector<Trajet> getPropose() {
		return propose;
	}

	public void setPropose(Vector<Trajet> propose) {
		this.propose = propose;
	}

	public Vector<Trajet> getRejoint() {
		return rejoint;
	}

	public void setRejoint(Vector<Trajet> rejoint) {
		this.rejoint = rejoint;
	}

	
	
	public void creerTrajet(String destination, Date date, Float plageHoraire, String tailleBagage, int nbPlace, String description){
		
	}
	
	public void creerTrajet(String destination, Date date, Float plageHoraire, String tailleBagage, int nbPlace){
		creerTrajet(destination, date, plageHoraire,  tailleBagage, nbPlace, "");
	}
	
	public void selectionTrajet(Trajet trajet){
		
	}
	
	public void creerVoiture(String marque, String modele, String carburant, int consomation, String description){
		
	}
	
	public void creerVoiture(String marque, String modele, String carburant, int consomation){
		creerVoiture(marque, modele, carburant, consomation, "");
	}
}
