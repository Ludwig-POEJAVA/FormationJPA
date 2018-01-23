package com.softeam.formation.jpa.test;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softeam.formation.hibernate.metier.modele.Adresse;

public class Exercice02
{
	private static Logger logger = LoggerFactory.getLogger(Exercice01.class);

	public static void main(String[] args)
	{
		ArrayList<Adresse> adresses = new ArrayList<Adresse>();
		adresses.add(new Adresse("a", "b", "c", "56000", "Morbihan Indépendant"));
		adresses.add(new Adresse("d", "e", "f", "29000", "Humideland"));
		adresses.add(new Adresse("a", "h", "i", "22000", "Pluiville"));
		adresses.add(new Adresse("j", null, "k", "22000", "Pluiville"));
		adresses.add(new Adresse("k", "m", null, "22000", "Pluiville"));
		adresses.add(new Adresse("n", "o", "p", null, "Pluiville"));

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		for (Adresse a : adresses)
		{
			em.persist(a);
		}

		tx.commit();
		em.close();
		emf.close();

		logger.info("----Exercice 02----");
	}

}
