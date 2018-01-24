package com.softeam.formation.hibernate.metier.modele;

import javax.persistence.Embeddable;

@Embeddable
public class Identite
{
	private String nom;
	private String prenom;
	private String initiales;

	public Identite()
	{
	}

	public Identite(String nom, String prenom, String initiales)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.initiales = initiales;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getPrenom()
	{
		return prenom;
	}

	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	public String getInitiales()
	{
		return initiales;
	}

	public void setInitiales(String initiales)
	{
		this.initiales = initiales;
	}

	public String toString()
	{
		return "<IDENTITE>" + "{nomn : " + nom + " , " + "prenom : " + prenom + "}";
	}
}
