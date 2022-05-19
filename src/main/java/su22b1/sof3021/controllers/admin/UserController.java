package su22b1.sof3021.controllers.admin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import su22b1.sof3021.beans.User;

@Controller
@RequestMapping("/admin/users")
public class UserController {
	@GetMapping("create")
	public String create(@ModelAttribute("user") User user)
	{
		return "admin/users/create";
	}
	
	@PostMapping("store")
	public String store(
		@Valid @ModelAttribute("user") User user,
		BindingResult result
	) {
		if (result.hasErrors() == true) {
			System.out.println("Form ko hợp lệ");
		} else {
			System.out.println("Form hợp lệ");
		}
		return "admin/users/create";
	}
}
