package ant.com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ant.com.spring.entities.Type;

@Repository(value = "TypeDAO")
@Transactional(rollbackFor = Exception.class)
public class TypeDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public void persist(final Type type) {
		try {
			
			entityManager.persist(type);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

	}

	public Type findById(final int id) {
		return entityManager.find(Type.class, id);
	}

	public void delete(final Type type) {
		entityManager.remove(type);
	}

	public List<Type> findAll() {

		List<Type> list = null;
		try {
			list = entityManager.createQuery(" from Type", Type.class).getResultList();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return list;

	}

}
