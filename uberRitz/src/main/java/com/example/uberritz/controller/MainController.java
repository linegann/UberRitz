package com.example.uberritz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@CrossOrigin
public class MainController {

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {

		return "index";
	}

	@RequestMapping(value = { "/midisoir" }, method = RequestMethod.GET)
	public String midisoir(Model model) {

		return "midisoir";
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String login(Model model) {

		return "login";
	}

	@RequestMapping(value = { "/queue" }, method = RequestMethod.GET)
	public String queue(Model model) {

		return "queue";
	}

	@RequestMapping(value = { "/menumidi" }, method = RequestMethod.GET)
	public String menumidi(Model model) {

		return "menumidi";
	}

	@RequestMapping(value = { "/menusoir" }, method = RequestMethod.GET)
	public String menusoir(Model model) {

		return "menusoir";
	}
    
}
