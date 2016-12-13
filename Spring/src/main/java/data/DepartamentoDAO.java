package data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.Departamento;

public class DepartamentoDAO implements IDepartamentoDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public List<Departamento> ListarDepartamentos() {
		Session session = sessionFactory.openSession();
		List<Departamento> listaDeptos = session.createQuery("from Departamento").list();
		session.close();
		return listaDeptos;
	}

}
