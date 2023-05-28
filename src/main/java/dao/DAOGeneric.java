package dao;

import java.sql.Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import jpautil.JPAUtil;

public class DAOGeneric<E> {

	private JPAUtil jpaUtil;
	private EntityManager entityManager;
	
	private Connection connection;

	public void salvar(E entidade) {

		EntityManager entityManager = JPAUtil.getEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(entidade);

		entityTransaction.commit();

		entityManager.close();

	}

	public void delete(E entidade) {

		EntityManager entityManager = JPAUtil.getEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		// deleta por id especifica
		Object id = JPAUtil.getPrimaryKey(entidade);
		entityManager.createQuery("delete from " + entidade.getClass().getCanonicalName() + " where id = " + id)
				.executeUpdate();

		entityTransaction.commit();

		entityManager.close();

	}
	
}
