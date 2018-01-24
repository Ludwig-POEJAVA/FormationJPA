package com.softeam.formation.jpa.metier.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.softeam.formation.hibernate.metier.modele.Personne;

public class PersonneDAO
{
	static EntityManagerFactory emf;

	public PersonneDAO(EntityManagerFactory emf)
	{
		SalleDAO.emf = emf;
	}

	public boolean modifier(Personne p)
	{
		return false;
	}

	public boolean supprimer(Personne p)
	{
		return false;
	}

	public long ajouter(Personne p)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(p);

		tx.commit();
		em.close();
		return 0 / 0; // TODO
	}

	public Personne lire(long id)
	{

		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Personne p = em.find(Personne.class, id);

		tx.commit();
		em.close();
		return p;
	}
}
