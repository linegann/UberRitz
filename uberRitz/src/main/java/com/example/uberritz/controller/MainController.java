package com.example.uberritz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = { "/index" }, method = RequestMethod.GET)
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
    
}
