package ant.com.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import ant.com.spring.entities.Type;
import ant.com.spring.service.ProductTypeService;

@Controller
public class TypeController {

	@Autowired
	private ProductTypeService typeService;

	@RequestMapping(value = "/productType-list")
	public String typeList(Model model) {
		model.addAttribute("listType", typeService.findAll());
		return "productType-list";
	}

	@RequestMapping(value = "/productType-insert")
	public String insertProductType(Model model) {
		model.addAttribute("type", new Type());
		return "productType-insert";
	}

	@RequestMapping(value = "/productType-update")
	public String updateProductType(@RequestParam int id, Model model) {
		Type type = typeService.findById(id);
		model.addAttribute("type", type);
		return "productType-update";
	}

	@RequestMapping(value = "/insertProductType")
	public String doInsertType(@ModelAttribute("Type") Type type, Model model) {
		if (!type.getName().isEmpty()) {
			typeService.save(type);
			return "redirect:productType-list";

		}
		model.addAttribute("message","Please enter product type's name");
		return "redirect:productType-insert";
		
	}

	@RequestMapping(value = "/updateProductType")
	public String doUpdateType(@ModelAttribute("Type") Type type) {
		typeService.update(type);
		return "redirect:productType-list";
	}

	@RequestMapping(value = "/deleteProductType", method = RequestMethod.GET)
	public String doDeleteType(@RequestParam int id) {
		typeService.delete(id);
		return "redirect:productType-list";
	}

}
