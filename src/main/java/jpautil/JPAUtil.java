package jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
 
	private static EntityManagerFactory factory;
	
	static {
		if (factory == null) {
			factory = Persistence
					.createEntityManagerFactory("app-engenheiro");
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	//metodo para pegar id da entidade
	public static Object getPrimaryKey(Object entity) {
		
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}
	
}

