package su22b1.sof3021.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
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
		String hoTen = (name.isPresent() == false ||
			name.get().length() == 0) ? "IT16309" :
			name.get();

		model.addAttribute("message", hoTen);
//		model.addAttribute("message", name);
		return "hello";
	}
}
