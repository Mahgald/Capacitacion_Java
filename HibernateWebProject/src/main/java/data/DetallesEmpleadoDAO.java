package data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.HibernateUtils;
import model.DetallesEmpleado;

public class DetallesEmpleadoDAO {
	
	public static void altaDetalleEmpleado(DetallesEmpleado detemple){
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		sess.save(detemple);
		
		
		sess.getTransaction().commit();
		sess.close();
	}
	
	public static void bajaEmpleado(DetallesEmpleado detemple)
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		sess.beginTransaction();		
		sess.delete(detemple);		
		sess.getTransaction().commit();
		sess.close();
	}
	
	public static void modificarDetalleDeEmpleado(DetallesEmpleado detemple)
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		sess.beginTransaction();		
		sess.update(detemple);
		sess.getTransaction().commit();		
		sess.close();		
	}
	
}
