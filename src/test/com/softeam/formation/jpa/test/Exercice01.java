package com.softeam.formation.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercice01
{
	private static Logger logger = LoggerFactory.getLogger(Exercice01.class);

	public static void main(String[] Args)
	{
		System.out.println("#########################################################################");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		System.out.println("#########################################################################");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		String query = "INSERT INTO TEST VALUES('Exercice 01 :(')";

		Query q = em.createNativeQuery(query);
		int upd = q.executeUpdate();
		System.out.println("***-> upd = " + upd);

		tx.commit();
		em.close();
		emf.close();

		logger.info("----Exercice 01----");
		logger.info(query);
		logger.warn("résultats : " + upd);
	}
}
