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
	private String name;
	private int nbPlaces;

	public Salle(String name, int nbPlaces)
	{
		this.name = name;
		this.nbPlaces = nbPlaces;
	}

	public String getName()
	{
		return name;
	}

	public int getSalle_id()
	{
		return nbPlaces;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setSalle_id(int nbPlaces)
	{
		this.nbPlaces = nbPlaces;
	}
}
