package com.captton.clase11.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
	private static SessionFactory instanciaDeSession = crearSession();

	private static SessionFactory crearSession()
	{
		SessionFactory sf = null;

		//CREAR LA SESSION FACTORY
		Configuration config = new Configuration().configure();

		sf = config.buildSessionFactory();
		return sf;
	}
	
	public static SessionFactory getSessionFactory()
	{
		return instanciaDeSession;
	}
}
