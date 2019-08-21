package com.machula.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.machula.bank.entity.Todo;
import com.machula.bank.entity.User;
import com.machula.bank.service.UserService;

@Controller
public class MainController {

	@Autowired
	private UserService userService;

	/*
	 * @GetMapping("/main") public String main(Model model) {
	 * System.out.println("\nfindAll()"); List<Person> personList =
	 * service.findAll(); for (Person person : personList) {
	 * System.out.println(person.getName()); for (Phone phone :
	 * person.getPhoneList()) { System.out.println(phone.getPhone()); } } //
	 * service.findAll().forEach(it -> System.out.println(it));
	 * 
	 * model.addAttribute("personList", personList); String name = "machik";
	 * model.addAttribute("name", name); return "main"; }
	 */

	
	/*
	 * @GetMapping("/phone")
	 * 
	 * public void phone() { List<Phone> listPhone = phoneService.findAll(); for
	 * (Phone phone : listPhone) { System.out.println(phone.getPhone()); }
	 * 
	 * }
	 */

	@GetMapping("/test_user")
	public String users() {
		List<User> userList = userService.findAll();
		for (User user : userList) {
			System.out.println(user.getUsername());
			for (Todo todo : user.getTodoList())
				System.out.println(todo.getImportance() + ": " + todo.getText());
		}
		return "main";

	}

}
