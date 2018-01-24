package com.softeam.formation.jpa.metier.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManagerFactory;

import com.softeam.formation.hibernate.metier.modele.Projet;

public class ProjetDAO
{
	EntityManagerFactory emf;

	public ProjetDAO(EntityManagerFactory emf)
	{
		this.emf = emf;
	}

	public long ajouter(Projet p)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(p);

		tx.commit();
		em.close();
		return p.getProjet_id();
	}

	public Projet lire(long id)
	{
		EntityManager em = emf.createEntityManager();
		Projet p = em.find(Projet.class, id);
		em.close();
		return p;
	}
}
