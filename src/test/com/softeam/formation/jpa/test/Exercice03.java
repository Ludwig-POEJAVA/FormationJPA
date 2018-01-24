package com.softeam.formation.jpa.test;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softeam.formation.hibernate.metier.modele.Projet;
import com.softeam.formation.hibernate.metier.modele.Reunion;
import com.softeam.formation.hibernate.metier.modele.Salle;
import com.softeam.formation.jpa.metier.dao.ProjetDAO;
import com.softeam.formation.jpa.metier.dao.ReunionDAO;
import com.softeam.formation.jpa.metier.dao.SalleDAO;

public class Exercice03
{
	private static Logger logger = LoggerFactory.getLogger(Exercice01.class);

	public static void main(String[] args)
	{
		ArrayList<Projet> projets = new ArrayList<Projet>();
		ArrayList<Reunion> reunions = new ArrayList<Reunion>();
		ArrayList<Salle> salles = new ArrayList<Salle>();

		projets.add(new Projet("projet 001"));
		projets.add(new Projet("projet 011"));
		projets.add(new Projet("projet 101"));

		salles.add(new Salle("salle R2D2", 22));
		salles.add(new Salle("salle 007", 700));
		salles.add(new Salle("salle Mary Poppins", 1960));

		reunions.add(new Reunion("Réunion r01", 100022, salles.get(0), projets.get(1), new Date(), null));
		reunions.add(new Reunion("Réunion r02", 200700, salles.get(1), projets.get(1), new Date(), null));
		reunions.add(new Reunion("Réunion r03", 301960, salles.get(2), projets.get(2), new Date(), null));

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");

		ProjetDAO pDAO = new ProjetDAO(emf);
		SalleDAO sDAO = new SalleDAO(emf);
		ReunionDAO rDAO = new ReunionDAO(emf);

		for (Projet p : projets)
			pDAO.ajouter(p);

		for (Salle s : salles)
			sDAO.ajouter(s);

		for (Reunion r : reunions)
			rDAO.ajouter(r);

		emf.close();

		logger.info("----Exercice 03----");

	}
}
