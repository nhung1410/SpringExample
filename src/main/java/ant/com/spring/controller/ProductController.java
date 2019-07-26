package ant.com.spring.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ant.com.spring.entities.Product;
import ant.com.spring.entities.Type;

@Controller
public class ProductController {
	
	@ModelAttribute("type")
	public List<Type> getType(){
		List<Type> ListType = new ArrayList<Type>();
		ListType.add(new Type("Loai 1"));
		ListType.add(new Type( "Loai 2"));
		ListType.add(new Type( "Loai 3"));
		return ListType;
	}
	
	@RequestMapping("insert-product")
	public String addProduct(ModelMap model) {
		model.addAttribute("product", new Product());
		return "admin/product/insert";
		
	}
	
	@RequestMapping("/view-product")
	public String viewProductList(@ModelAttribute("product") Product product, ModelMap model) {
		model.addAttribute("product", product);
		return "admin/product/index";
	}
	
	
}
