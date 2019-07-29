package ant.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

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
