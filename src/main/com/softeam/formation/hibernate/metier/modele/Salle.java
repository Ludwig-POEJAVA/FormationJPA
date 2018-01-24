package com.softeam.formation.hibernate.metier.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_SALLE")
public class Salle
{
	@Id
	@Column(name = "SALLE_ID")
	private long salle_id;
	private String name;
	private int nbPlaces;

	public Salle(String name, int nbPlaces)
	{
		this.name = name;
		this.nbPlaces = nbPlaces;
	}

	public long getSalle_id()
	{
		return salle_id;
	}

	public void setSalle_id(long salle_id)
	{
		this.salle_id = salle_id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getNbPlaces()
	{
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces)
	{
		this.nbPlaces = nbPlaces;
	}

}
