package ant.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ant.com.spring.entities.Type;
import ant.com.spring.service.ProductTypeService;


@Controller
public class TypeController {
	
	@Autowired
	private ProductTypeService typeService;
	
	@RequestMapping(value="/productType-list")
	public String typeList(Model model) {
		model.addAttribute("listType", typeService.findAll());
		return "productType-list";
	}
	
	@RequestMapping(value="/productType-insert")
	public String insertProductType(Model model) {
		model.addAttribute("type", new Type());
		return "productType-insert";
	}
	
	@RequestMapping(value="/productType-update/{id}")
	public String updateProductType(@PathVariable int id, Model model) {
		Type type = typeService.findById(id);
		model.addAttribute("type", type);
		return "productType-update";
	}
	
	@RequestMapping(value="/insertProductType")
	public String doInsertType(@ModelAttribute("Type") Type type, Model model) {
		typeService.save(type);
		model.addAttribute("listType", typeService.findAll());
		return "productType-list";
	}
	
	@RequestMapping(value="/updateProductType", method=RequestMethod.POST)
	public String doUpdateType(@ModelAttribute("Type") Type type, Model model) {
		typeService.update(type);
		model.addAttribute("listType", typeService.findAll());
		return "productType-list";
	}
	
	@RequestMapping(value="/deleteProductType/{id}")
	public String doDeleteType(@PathVariable int id, Model model) {
		typeService.delete(id);
		model.addAttribute("listType", typeService.findAll());
		return "productType-list";
	}
	
}
