package ant.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String homepage() {
//		return "index";
		return "dashboard";
	}
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping("/login-form")
	public String showLoginForm() {
		return "login";
	}

	@RequestMapping("/login")
	public RedirectView login(@RequestParam("us") String us,@RequestParam("pw") String pw, RedirectAttributes redirectAttributes, ModelMap model) {
		if(us.equals("nhung")&&pw.equals("a")) {
			redirectAttributes.addAttribute("us", us);
			redirectAttributes.addAttribute("pw", pw);
			return new RedirectView("info");
		}
		else if(us.equals("admin")&&pw.equals("a")) {
			return new RedirectView("admin-page");
		}
		else {
			return new RedirectView("login-form");
		}
	}
	

}
