package ant.com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ant.com.spring.dao.TypeDAO;
import ant.com.spring.entities.Type;

@Service
@Transactional
public class ProductTypeService {

	@Autowired
	private TypeDAO typeDAO;

	public List<Type> findAll() {
		return typeDAO.findAll();
	}

	public Type findById(final int id) {
		return typeDAO.findById(id);
	}

	public void save(final Type type) {

		typeDAO.persist(type);

	}

	public void update(final Type type) {
		try {
			Type typeDB = typeDAO.findById(type.getId());

			typeDB.setName(type.getName());
			typeDAO.persist(typeDB);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void delete(final int id) {
		try {
			Type type = typeDAO.findById(id);
			typeDAO.delete(type);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
