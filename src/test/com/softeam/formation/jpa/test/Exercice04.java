package com.softeam.formation.jpa.test;

import java.util.ArrayList;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softeam.formation.hibernate.metier.modele.Identite;
import com.softeam.formation.hibernate.metier.modele.Personne;
import com.softeam.formation.jpa.metier.dao.PersonneDAO;

public class Exercice04
{
	private static Logger logger = LoggerFactory.getLogger(Exercice01.class);

	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		ArrayList<Personne> personnes = new ArrayList<Personne>();
		ArrayList<Identite> identites = new ArrayList<Identite>();

		ArrayList<Long> p_id = new ArrayList<Long>();

		identites.add(new Identite("NOM", "PRENOM", "INI"));
		personnes.add(new Personne("nom.prenom@domain.tld", 55, identites.get(0)));

		identites.add(new Identite("Baby", "Bébé", "BB"));
		identites.add(new Identite("Mister", "Rr", "MR"));
		identites.add(new Identite("Papy", "Pépé", "PP"));
		personnes.add(new Personne("nourisson_@famille.congelo", 1, identites.get(1)));
		personnes.add(new Personne("parent___@famille.congelo", 30, identites.get(2)));
		personnes.add(new Personne("croulant@famille.congelo", 101, identites.get(3)));

		PersonneDAO pDAO = new PersonneDAO(emf);

		for (Personne p : personnes)
		{
			System.out.println(p);
			p_id.add(pDAO.ajouter(p));
		}

		personnes.clear();
		// retrouver les projets depuis la BDD (par exemple)
		for (Long p : p_id)
		{
			personnes.add(pDAO.lire(p));

			System.out.println("\nread from BDD  " + personnes.get(personnes.size() - 1).toString() + "\n");
		}

		emf.close();
		logger.info("----Exercice 04----");
	}
}
