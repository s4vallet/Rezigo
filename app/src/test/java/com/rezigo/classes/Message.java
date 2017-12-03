package com.rezigo.classes;

public class Message {
	
	private String texte;
	private Profil profil;

	public Message(String texte, Profil profil) {
		this.texte = texte;
		this.profil = profil;
	}

	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}

	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
	}
	
	
	
}
