package com.softeam.formation.hibernate.metier.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "T_ADRESSE")
public class Adresse
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	// @NotNull
	private String ligne1;
	private String ligne2;
	private String ligne3;
	// @NotNull
	private String codePostal;
	// @NotNull
	private String ville;

	public Adresse(String ligne1, String ligne2, String ligne3, String codePostal, String ville)
	{
		this.ligne1 = ligne1;
		this.ligne2 = ligne2;
		this.ligne3 = ligne3;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	/*
	 * METHODES : GETTERS / SETTERS
	 */

	/**
	 * @return the id
	 */
	public long getId()
	{
		return id;
	}

	/**
	 * @return the ligne1
	 */
	public String getLigne1()
	{
		return ligne1;
	}

	/**
	 * @return the ligne2
	 */
	public String getLigne2()
	{
		return ligne2;
	}

	/**
	 * @return the ligne3
	 */
	public String getLigne3()
	{
		return ligne3;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal()
	{
		return codePostal;
	}

	/**
	 * @return the ville
	 */
	public String getVille()
	{
		return ville;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id)
	{
		this.id = id;
	}

	/**
	 * @param ligne1
	 *            the ligne1 to set
	 */
	public void setLigne1(String ligne1)
	{
		this.ligne1 = ligne1;
	}

	/**
	 * @param ligne2
	 *            the ligne2 to set
	 */
	public void setLigne2(String ligne2)
	{
		this.ligne2 = ligne2;
	}

	/**
	 * @param ligne3
	 *            the ligne3 to set
	 */
	public void setLigne3(String ligne3)
	{
		this.ligne3 = ligne3;
	}

	/**
	 * @param codePostal
	 *            the codePostal to set
	 */
	public void setCodePostal(String codePostal)
	{
		this.codePostal = codePostal;
	}

	/**
	 * @param ville
	 *            the ville to set
	 */
	public void setVille(String ville)
	{
		this.ville = ville;
	}
}
