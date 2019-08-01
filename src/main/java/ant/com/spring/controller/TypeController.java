package ant.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ant.com.spring.entities.Type;
import ant.com.spring.service.ProductTypeService;


@Controller
public class TypeController {
	
	@Autowired
	private ProductTypeService typeService;
	
	@RequestMapping(value="/productType-list")
	public String typeList(Model model) {
		model.addAttribute("listType", typeService.findAll());
		return "admin/productType/productType-list";
	}
	
	@RequestMapping(value="/productType-insert")
	public String insertProductType(Model model) {
		model.addAttribute("type", new Type());
		return "admin/productType/productType-insert";
	}
	
	@RequestMapping(value="/productType-update")
	public String updateProductType() {
		return "admin/productType/productType-update";
	}
	
	@RequestMapping(value="/insertProductType")
	public String doInsertType(@ModelAttribute("Type") Type type, Model model) {
		typeService.save(type);
		model.addAttribute("listType", typeService.findAll());
		return "admin/productType/productType-list";
	}
	
}
