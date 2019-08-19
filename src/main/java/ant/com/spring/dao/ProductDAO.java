package ant.com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ant.com.spring.entities.Product;

@Repository(value="productDAO")
@Transactional(rollbackFor = Exception.class)
public class ProductDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public void persist(final Product product) {
		try {
			
			entityManager.persist(product);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

	}

	public Product findById(final int id) {
		return entityManager.find(Product.class, id);
	}

	public void delete(final Product product) {
		entityManager.remove(product);
	}

	public List<Product> findAll() {

		List<Product> list = null;
		try {
			list = entityManager.createQuery(" from Product", Product.class).getResultList();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return list;

	}
}
