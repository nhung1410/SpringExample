package ant.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@RequestMapping(value="/list-product")
	public String productList() {
		return "admin/product/product-list";
	}
	
	@RequestMapping(value="/insert-product")
	public String insertProduct() {
		return "admin/product/product-insert";
	}
}
