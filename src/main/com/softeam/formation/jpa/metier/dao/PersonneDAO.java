package com.softeam.formation.jpa.metier.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.softeam.formation.hibernate.metier.modele.Personne;

public class PersonneDAO
{
	EntityManagerFactory emf;

	public PersonneDAO(EntityManagerFactory emf)
	{
		this.emf = emf;
	}

	public void modifier(Personne p)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.remove(em.merge(p));

		tx.commit();
		em.close();
	}

	public void supprimer(Personne p)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.merge(p);

		tx.commit();
		em.close();
	}

	public long ajouter(Personne p)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(p);

		tx.commit();
		em.close();
		return p.getPersonne_id(); // TODO
	}

	public Personne lire(long id)
	{
		EntityManager em = emf.createEntityManager();
		Personne p = em.find(Personne.class, id);
		em.close();
		return p;
	}
}
