package com.softeam.formation.hibernate.metier.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_PROJET")
public class Projet
{
	@Id
	@Column(name = "PROJET_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long projet_id;
	private String name;

	public Projet(String name)
	{
		this.name = name;
	}

	public Projet()
	{
	}

	public long getProjet_id()
	{
		return projet_id;
	}

	public void setProjet_id(long projet_id)
	{
		this.projet_id = projet_id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
