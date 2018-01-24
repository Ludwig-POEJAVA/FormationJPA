package com.softeam.formation.jpa.metier.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.softeam.formation.hibernate.metier.modele.Reunion;

public class ReunionDAO
{
	EntityManagerFactory emf;

	public ReunionDAO(EntityManagerFactory emf)
	{
		this.emf = emf;
	}

	public long ajouter(Reunion r)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(r);

		tx.commit();
		em.close();
		return r.getReunion_id();
	}

	public Reunion lire(long id)
	{
		EntityManager em = emf.createEntityManager();
		Reunion r = em.find(Reunion.class, id);
		em.close();
		return r;
	}
}
