package ant.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ant.com.spring.service.ProductTypeService;

@Controller
public class ProductTypeController {
	/*
	 * @Autowired private ProductTypeService typeService;
	 */
	
	@RequestMapping(value="/productType-list")
	public String typeList() {
		return "admin/productType/productType-list";
	}
}
