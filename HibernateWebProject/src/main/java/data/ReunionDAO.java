package data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.HibernateUtils;
import model.Reunion;

public class ReunionDAO {

	public static void altaReunion(Reunion meeting){
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		Long id = (Long) sess.save(meeting);
		meeting.setId(id);
		
		sess.getTransaction().commit();
		sess.close();
	}
	
	public static void bajaReunion(Reunion meeting)
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		sess.beginTransaction();		
		sess.delete(meeting);		
		sess.getTransaction().commit();
		sess.close();
	}
	
	public static void modificarReunion(Reunion meeting)
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		sess.beginTransaction();		
		sess.update(meeting);
		sess.getTransaction().commit();		
		sess.close();		
	}
	
	public static List<Reunion> listarReunion()
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		List<Reunion> lista =sess.createQuery("from Reunion").list();
		sess.close();
		
		return lista;		
	}
	public static Reunion obtenerUnReunion(long id)
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		Reunion meeting = sess.get(Reunion.class, id);		
		sess.close();
		
		return meeting;
		
	}
}
