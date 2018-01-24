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

	public long ajouter(Projet p)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(p);

		tx.commit();
		em.close();
		System.out.println("======= ai créé PROJET avec ID " + p.getProjet_id());
		return p.getProjet_id();
	}

	public Projet lire()
	{
		return null;
	}
}
