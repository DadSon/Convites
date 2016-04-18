package br.edu.ifpb.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.edu.ifpb.entidade.Convidado;
import br.edu.ifpb.hibernate.HibernateUtil;

public class ConvidadoDAO extends GenericDAO<Integer, Convidado>{

	private static ConvidadoDAO instance;

	public static ConvidadoDAO getInstance() {	

		instance = new ConvidadoDAO();	

		return instance;

	}

	@Override
	public Convidado find(Convidado entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Convidado> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public Convidado getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Convidado convidado = null;

		try {
			session.beginTransaction();
			convidado = (Convidado) session.get(Convidado.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {

			session.close();

		}

		return convidado;
	}

	public Convidado getByTitulo(Integer titulo) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Convidado convidado = null;
		
		try {
					
			Query query = session.createQuery("from Convidado where tituloVotacao_pessoa = :titulo");
			query.setParameter("titulo", titulo);
			
			convidado = (Convidado) query.uniqueResult();
	        
		} catch (HibernateException hibernateException) {
			
			session.getTransaction().rollback();
			
		} finally {
		
			session.close();
		}
		System.out.println("Aqui");
		return convidado;

	}

}