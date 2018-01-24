package com.softeam.formation.jpa.metier.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.softeam.formation.hibernate.metier.modele.Reunion;

public class ReunionDAO
{
	static EntityManagerFactory emf;

	public ReunionDAO(EntityManagerFactory emf)
	{
		this.emf = emf;
	}

	public static int ajouter(Reunion r)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(r);

		tx.commit();
		em.close();
		return 0;
	}

	public Reunion lire()
	{
		return null;
	}
}
