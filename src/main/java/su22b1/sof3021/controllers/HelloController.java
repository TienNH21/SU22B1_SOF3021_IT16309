package su22b1.sof3021.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import su22b1.sof3021.beans.User;
import su22b1.sof3021.demo_config_bean.UserDaoInterface;

@Controller
public class HelloController {
	@Autowired
	private User user;
	
	@Autowired
	@Qualifier("user_dao_sqlserver")
	private UserDaoInterface userDao;
	
	@GetMapping("/hello")
	public String hello(
		Model model,
//		@RequestParam(
//			name="ho_ten",
//			defaultValue="IT16309"
//		) String name
		
		@RequestParam(
			name="ho_ten",
			defaultValue="IT16309"
		) Optional<String> name
	) {
		System.out.println("HelloController@hello");
		String hoTen = (name.isPresent() == false ||
			name.get().length() == 0) ? "IT16309" :
			name.get();

		model.addAttribute("message", hoTen);
//		model.addAttribute("message", name);
		return "hello";
	}

	@GetMapping("demo-bean")
	@ResponseBody
	public String demoBean()
	{
		this.user.setHoTen("TienNH21");
		this.userDao.insert();
		this.userDao.update();
		this.userDao.delete();
		this.userDao.all();
		return "Hello, " + this.user.getHoTen();
	}
}
