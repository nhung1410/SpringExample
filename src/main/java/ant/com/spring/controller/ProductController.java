package ant.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import ant.com.spring.entities.Product;
import ant.com.spring.entities.Type;
import ant.com.spring.service.ProductService;
import ant.com.spring.service.ProductTypeService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	ProductTypeService typeService;

	@RequestMapping(value = "/list-product")
	public String productList(Model model) {
		model.addAttribute("productList", productService.findAll());
		return "product-list";
	}

	@RequestMapping(value = "/insert-product")
	public String insertProduct(Model model) {
		model.addAttribute("types", typeService.findAll());
		model.addAttribute("product", new Product());
		return "product-insert";
	}

	@RequestMapping(value = "/product-update")
	public String updateProduct(@RequestParam int id, Model model) {
		model.addAttribute("types", typeService.findAll());
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		return "product-update";
	}

	@RequestMapping("/product-view")
	public String viewProduct(@RequestParam int id, Model model) {
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		return "product-view";
	}

	@RequestMapping(value = "/insertProduct")
	public RedirectView doInsertProduct(@ModelAttribute("Product") Product product, @ModelAttribute("Type") Type type) {	
			productService.save(product);
			return new RedirectView("list-product") ;

	}

	@RequestMapping(value = "/updateProduct")
	public RedirectView doUpdateProduct(@ModelAttribute("Product") Product product) {
		productService.update(product);
		return new RedirectView("list-product") ;
	}

	@RequestMapping(value = "/deleteProduct")
	public String doDeleteProduct(@RequestParam int id) {
		productService.delete(id);
		return "redirect:list-product";
	}
}
