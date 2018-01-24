package com.softeam.formation.jpa.metier.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.softeam.formation.hibernate.metier.modele.Salle;

public class SalleDAO
{
	static EntityManagerFactory emf;

	public SalleDAO(EntityManagerFactory emf)
	{
		SalleDAO.emf = emf;
	}

	public long ajouter(Salle s)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(s);

		tx.commit();
		em.close();
		System.out.println("\n======= ai créé SALLE avec ID " + s.getSalle_id() + "\n");
		return s.getSalle_id();
	}

	public Salle lire(long id)
	{

		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Salle s = em.find(Salle.class, id);

		tx.commit();
		em.close();
		return s;
	}
}
