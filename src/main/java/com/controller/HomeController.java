package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Match;
import com.service.matchService;

@Controller
public class HomeController {

	@Autowired
	public matchService service;

	@RequestMapping("/")
	public String onStart(Model model) {

		List<Match> list = service.save();
		model.addAttribute("data", list);
		return "views/index.jsp";
	}
}
