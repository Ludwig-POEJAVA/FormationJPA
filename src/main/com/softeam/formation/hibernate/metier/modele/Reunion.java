package com.softeam.formation.hibernate.metier.modele;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_REUNION")
public class Reunion
{
	@Id
	@Column(name = "REUNION_ID")
	private long reunion_id;
	private String name;
	private Date dateDebut;
	private Date dateFin;

	@ManyToOne
	@JoinColumn(name = "SALLE_ID_fk")
	private Salle salle;
	@ManyToOne
	@JoinColumn(name = "PROJET_ID_fk")
	private Projet projet;

	public Reunion(String name, long id, Salle salle, Projet projet, Date debut, Date fin)
	{
		this.name = name;
		this.reunion_id = id;
		this.salle = salle;
		this.projet = projet;
		this.dateDebut = debut;
		this.dateFin = fin;
	}

	public String getName()
	{
		return name;
	}

	public long getReunion_id()
	{
		return reunion_id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setReunion_id(long reunion_id)
	{
		this.reunion_id = reunion_id;
	}

	public Date getDatedebut()
	{
		return dateDebut;
	}

	public void setDatedebut(Date datedebut)
	{
		this.dateDebut = datedebut;
	}

	public Date getDateFin()
	{
		return dateFin;
	}

	public void setDateFin(Date dateFin)
	{
		this.dateFin = dateFin;
	}
}
