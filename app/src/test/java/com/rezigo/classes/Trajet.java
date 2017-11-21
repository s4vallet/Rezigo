package com.rezigo.classes;


import java.util.Vector;

public class Trajet {

	
	private Vector<Profil> client;
	private Profil conducteur;
	private Vector<Message> chat;
	private FTrajet fTrajet;

	public Trajet(Profil conducteur, FTrajet fTrajet) {
		this.conducteur = conducteur;
		this.fTrajet = fTrajet;
		chat.add(new Message(fTrajet.getDescription(), conducteur));
	}



	public int addClient(Profil client){
		if (fTrajet.getNbPlace()> 0){
			this.client.add(client);
			fTrajet.setNbPlace(fTrajet.getNbPlace()-1);
			chat.add(new Message(client.getfProfil().getPseudo() + "à rejoint le trajet", client));
			return 0;
		} else{
			return 1;// prochainement code erreur
		}
	}

	public Vector<Profil> getClient() {
		return client;
	}
	public void setClient(Vector<Profil> client) {
		this.client = client;
	}

	public Profil getConducteur() {
		return conducteur;
	}
	public void setConducteur(Profil conducteur) {
		this.conducteur = conducteur;
	}

	public Vector<Message> getChat() {
		return chat;
	}
	public void setChat(Vector<Message> chat) {
		this.chat = chat;
	}

	public FTrajet getfTrajet() {
		return fTrajet;
	}
	public void setfTrajet(FTrajet fTrajet) {
		this.fTrajet = fTrajet;
	}
	
	
	
	
}
