package com.softeam.formation.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Exercice01
{
	public static void main(String[] Args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");

		System.out.println("ca plante juste avant cette ligne");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		// String query = "SELECT * FROM test";
		// String query = "insert 'abcdefghi' into table";
		String query = "INSERT INTO TEST VALUES('Exercice 01')";
		Query q = em.createNativeQuery(query);
		int upd = q.executeUpdate();
		System.out.println(upd);

		tx.commit();

		em.close();
	}
}
