package ant.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {
	@RequestMapping("/login-form")
	public String showLoginForm() {
		return "user/login";
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

	@RequestMapping("/info")
	public String showInfoUser(@RequestParam("us") String us,@RequestParam("pw") String pw, Model model) {
		model.addAttribute("us",us);
		model.addAttribute("pw", pw);
		return "user/info";
	}
	
	
	@RequestMapping("/admin-page")
	public String showAdminPage( Model model) {
		return "admin/dashboard";
	}
	
	@RequestMapping("/register-form")
	public String showSignUpForm() {
		return "user/register";
	}
	@RequestMapping("/register")
	public String SignUp() {
		return "user/login-form";
	}
	
	
}
