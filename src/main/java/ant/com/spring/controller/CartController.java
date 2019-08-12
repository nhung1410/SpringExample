package ant.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {

	@RequestMapping(value="shopping-cart")
	public String shoppingCart() {
		return "cart";
	}
}
