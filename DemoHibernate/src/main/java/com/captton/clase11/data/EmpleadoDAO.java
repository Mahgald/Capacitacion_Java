package com.captton.clase11.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.captton.clase11.hibernate.HibernateUtil;
import com.captton.clase11.model.Empleado;

public class EmpleadoDAO
{
	
	public static void altaEmpleado(Empleado emple)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();		
		Session sess = sf.openSession();	
		sess.beginTransaction();
		
		Long id = (Long) sess.save(emple);
		emple.setId(id);
		
		sess.getTransaction().commit();
		sess.close();
		
	}
	
	public static void bajaEmpleado(Empleado emple)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session sess = sf.openSession();	
		
		sess.beginTransaction();		
		sess.delete(emple);		
		sess.getTransaction().commit();
		sess.close();
	}
	
	public static void modificarEmpleado(Empleado emple)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session sess = sf.openSession();	
		
		sess.beginTransaction();		
		sess.update(emple);
		sess.getTransaction().commit();		
		sess.close();		
	}
	
	public static List<Empleado> listarEmpleado()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session sess = sf.openSession();	
		
		List<Empleado> lista =sess.createQuery("from Empleado").list();
		sess.close();
		
		return lista;		
	}
	public static Empleado obtenerUnEmpleado(long id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session sess = sf.openSession();	
		
		Empleado emple = sess.get(Empleado.class, id);		
		sess.close();
		
		return emple;
		
	}

}
