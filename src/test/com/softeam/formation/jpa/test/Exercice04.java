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

		identites.add(new Identite("Baby", "Bébé", "BB"));
		identites.add(new Identite("Mister", "Rr", "MR"));
		identites.add(new Identite("Papy", "Pépé", "PP"));
		identites.add(new Identite("ABCDEFGH", "TUVWXYZ", "PP"));
		personnes.add(new Personne("nourisson_@famille.congelo", 1, identites.get(0)));
		personnes.add(new Personne("parent___@famille.congelo", 30, identites.get(1)));
		personnes.add(new Personne("EFFACE MOI", -5, identites.get(3)));
		personnes.add(new Personne("croulant@famille.congelo", 101, identites.get(2)));

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

		/* afficher avant modifications */
		System.out.println("\n\n\n");
		System.out.println("AVANT LES MDOFICATIONS");
		for (Personne p : personnes)
			System.out.println(p.toString());
		System.out.println("\n\n\n");

		/* Modifier */
		int last = personnes.size() - 1;
		personnes.get(last).setAge(667);
		System.out.println("MODIFIER");
		pDAO.modifier(personnes.get(last));

		/* enregistrer id */
		long last_ID = personnes.get(last).getPersonne_id();

		/* virer */
		System.out.println("\n");
		personnes.remove(last);

		/* ajouter */
		System.out.println("\n");
		System.out.println("AJOUTER");
		personnes.add(pDAO.lire(last_ID));

		System.out.println("\n");
		System.out.println("MODIFICATION : " + personnes.get(last).toString());

		System.out.println("\n");
		System.out.println("EFFACER");
		pDAO.supprimer(personnes.get(last - 1));

		personnes.clear();

		/* afficher apres modifications */
		System.out.println("\n");
		System.out.println("APRES LES MDOFICATIONS");
		for (Long p : p_id)
		{
			try
			{
				personnes.add(pDAO.lire(p));
				System.out.println(personnes.get(personnes.size() - 1).toString());
			}
			catch (Exception e)
			{
			}
		}
		System.out.println("\n\n");

		emf.close();
		logger.info("----Exercice 04----");
	}
}
