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
		entityManager.persist(type);
	}

	public Type findById(final int id) {
		return entityManager.find(Type.class, id);
	}

	public void delete(final Type type) {
		entityManager.remove(type);
	}

	public List<Type> findAll() {
		return entityManager.createQuery("FROM type", Type.class).getResultList();
	}

}
