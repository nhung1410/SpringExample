package ant.com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ant.com.spring.dao.ProductDAO;
import ant.com.spring.entities.Product;

@Service
@Transactional
public class ProductService {
	 @Autowired
	  private ProductDAO productDAO;
	  public List<Product> findAll() {
	    return productDAO.findAll();
	  }
	  public Product findById(final int id) {
	    return productDAO.findById(id);
	  }
	  public void save(final Product product) {
	    // check if product exist -> throw exception
	    productDAO.persist(product);
	  }
	  public void update(final Product product) {
	    // if productDB = null -> throw Exception
	    Product productDB = productDAO.findById(product.getId());
	    productDB.setName(product.getName());
	    productDB.setPrice(product.getPrice());
	    productDB.setQuantity(product.getQuantity());
	    productDB.setTypeId(product.getTypeId());
	    productDB.setImg(product.getImg());
	    productDB.setSale(product.getSale());
	    productDAO.persist(productDB);
	  }
	  public void delete(final int id) {
	    Product product = productDAO.findById(id);
	    if (product != null) {
	      productDAO.delete(product);
	    }
	  }
}
