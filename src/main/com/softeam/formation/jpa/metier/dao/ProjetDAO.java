package com.softeam.formation.jpa.metier.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManagerFactory;

import com.softeam.formation.hibernate.metier.modele.Projet;

public class ProjetDAO
{
	static EntityManagerFactory emf;

	public ProjetDAO(EntityManagerFactory emf)
	{
		ProjetDAO.emf = emf;
	}

	public int ajouter(Projet p)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(p);

		tx.commit();
		em.close();
		return 0;
	}

	public Projet lire()
	{
		return null;
	}
}
