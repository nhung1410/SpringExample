package ant.com.spring.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import ant.com.spring.dao.TypeDAO;
import ant.com.spring.entities.Product;
import ant.com.spring.entities.Type;
import ant.com.spring.model.MyFile;
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
		model.addAttribute("imgfile", new MyFile());
		model.addAttribute("product", new Product());
		return "product-insert";
	}
	

	@RequestMapping(value = "/product-update/{id}")
	public String updateProduct(@PathVariable int id, Model model) {
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		return "product-update";
	}

	@RequestMapping("/product-view/{id}")
	public String viewProduct(@PathVariable int id, Model model) {
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		return "product-view";
	}

	@RequestMapping(value = "/insertProduct")
	public RedirectView doInsertProduct(@ModelAttribute("Product") Product product, MyFile myFile, Model model) {
		if(product.getName().equals("")) {
			model.addAttribute("msgName", "Please enter product's name");
			return new RedirectView("insert-product");
		}
		else if(product.getPrice() == null) {
			model.addAttribute("msgPrice", "Please enter product's price");
			return new RedirectView("insert-product");
		}else if(product.getTypeId() == null) {
			model.addAttribute("msgType", "Please enter product's type");
			return new RedirectView("insert-product");
		}
		else if(product.getQuantity() == null) {
			model.addAttribute("msgQuantity", "Please enter product's quantity");
			return new RedirectView("insert-product");
		}else if(product.getImgMain().isEmpty()) {
			model.addAttribute("msgImg", "Please enter product's image");
			return new RedirectView("insert-product");
		}
		else {
		productService.save(product);
		try {
			MultipartFile multipartFile = myFile.getMultipartFile();
			String fileName = multipartFile.getOriginalFilename();
			File file = new File("/resources/imgUpload", fileName);
			multipartFile.transferTo(file);
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return new RedirectView("product-list");
		}
	}

	@RequestMapping(value = "/updateProduct")
	public RedirectView doUpdateProduct(@ModelAttribute("Product") Product product) {
		productService.update(product);
		return new RedirectView("product-list");
	}

	@RequestMapping(value = "/deleteProduct/{id}")
	public RedirectView doDeleteProduct(@PathVariable int id) {
		productService.delete(id);
		return new RedirectView("product-list");
	}
}
