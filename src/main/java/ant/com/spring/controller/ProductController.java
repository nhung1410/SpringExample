package ant.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ant.com.spring.entities.Product;
import ant.com.spring.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	@RequestMapping(value="/list-product")
	public String productList(Model model) {
		model.addAttribute("product-list", productService.findAll());
		return "product-list";
	}
	
	@RequestMapping(value="/insert-product")
	public String insertProduct() {
		return "product-insert";
	}
	
	@RequestMapping(value="/product-update")
	public String updateProduct() {
		return "product-update";
	}
	
	@RequestMapping("/product-view/{id}")
	public String viewProduct(@PathVariable int id, Model model) {
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		return "product-view";		
	}
}
