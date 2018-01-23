package com.softeam.formation.jpa.metier.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.softeam.formation.hibernate.metier.modele.Salle;

public class SalleDAO
{
	EntityManagerFactory emf;

	public SalleDAO(EntityManagerFactory emf)
	{
		this.emf = emf;
	}

	public int ajouter(Salle s)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(s);

		tx.commit();
		em.close();
		return 0;
	}

	public Salle lire()
	{
		return null;
	}
}
