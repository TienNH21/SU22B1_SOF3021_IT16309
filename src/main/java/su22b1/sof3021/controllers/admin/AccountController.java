package su22b1.sof3021.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import su22b1.sof3021.beans.AccountModel;
import su22b1.sof3021.entities.Account;
import su22b1.sof3021.repositories.AccountRepository;

@Controller
@RequestMapping("/admin/accounts")
public class AccountController {
	@Autowired
	private AccountRepository accountRepo;
	
	@GetMapping("create")
	public String create(@ModelAttribute("account") AccountModel account) 
	{
		return "admin/accounts/create";
	}
	
	@PostMapping("store")
	public String store(AccountModel model) 
	{
		Account acc = new Account();
		acc.setFullname( model.getFullname() );
		acc.setUsername( model.getUsername() );
		acc.setEmail( model.getEmail() );
		acc.setPassword( model.getPassword() );
		acc.setPhoto( model.getPhoto() );
		acc.setAdmin( model.getAdmin() );
		
		this.accountRepo.save(acc);
		
		return "redirect:/admin/accounts/index";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Account account) 
	{
		System.out.println(account.getEmail());
		// Account a = this.accountRepo.getById(id);
		this.accountRepo.delete(account);
		return "redirect:/admin/accounts/index";
	}

	@GetMapping("index")
	public String index(
		Model model,
		@RequestParam(name="page", defaultValue="0") int page,
		@RequestParam(name="size", defaultValue="10") int size
	) {
		Pageable pageable = PageRequest.of(page, size);
		Page<Account> p = this.accountRepo.findAll(pageable);
		model.addAttribute("data", p);
		return "admin/accounts/index";
	}
}
