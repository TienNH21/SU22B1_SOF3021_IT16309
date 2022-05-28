package su22b1.sof3021.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import su22b1.sof3021.beans.AccountModel;

@Controller
@RequestMapping("/admin/accounts")
public class AccountController {
	@GetMapping("create")
	public String create(@ModelAttribute("account") AccountModel account) 
	{
		return "admin/accounts/create";
	}
	
	@PostMapping("store")
	public String store(AccountModel model) 
	{
		return "redirect:admin/accounts/create";
	}
	
	@GetMapping("delete")
	public String delete() 
	{
		return "redirect:admin/accounts/create";
	}
}
