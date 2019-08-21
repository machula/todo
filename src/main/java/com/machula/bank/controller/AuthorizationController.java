package com.machula.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.machula.bank.entity.Todo;
import com.machula.bank.entity.User;
import com.machula.bank.service.UserService;

@Controller
public class AuthorizationController {
	@Autowired
	private UserService userService;

	@GetMapping("/main")
	public String main() {
		return "main";
	}

	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}

	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}

	@PostMapping("/registration")
	public String addUser(@RequestParam String username, @RequestParam String password, Model model) {
		System.out.println(username + ' ' + password);
		User userDB = userService.findByUsername(username);
		if(userDB != null) {
			System.out.println(username + " is exists");
			model.addAttribute("errorRegistration", "User exists");
			return "registration";
		}
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.getTodoList().add(new Todo(user, "IMPORTANT", "your first todo"));
		userService.save(user);
		
		return "redirect:/login";
	}
}
