package ant.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

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
	public RedirectView doInsertType(@ModelAttribute("Type") Type type) {
		typeService.save(type);
		return new RedirectView("productType-list");
	}
	
	@RequestMapping(value="/updateProductType")
	public RedirectView doUpdateType(@ModelAttribute("Type") Type type) {
		typeService.update(type);
		return new RedirectView("productType-list") ;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String doDeleteType(@PathVariable int id) {
		typeService.delete(id);
		return "redirect:productType-list" ;
	}
	
	
}
