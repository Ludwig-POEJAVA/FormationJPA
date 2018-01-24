package com.softeam.formation.hibernate.metier.modele;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Personne
{
	@Id
	@Column(name = "PERSONNE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long personne_id;
	private String email;
	private int age;
	@Embedded
	private Identite identite;

	public Personne()
	{
	}

	public Personne(String name, int age)
	{
		this.email = name;
		this.age = age;
	}

	public long getPersonne_id()
	{
		return personne_id;
	}

	public void setPersonne_id(long personne_id)
	{
		this.personne_id = personne_id;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public Identite getIdentite()
	{
		return identite;
	}

	public void setIdentite(Identite identite)
	{
		this.identite = identite;
	}

}
