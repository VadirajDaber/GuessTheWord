package com.guesstheword.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.guesstheword.service.GameService;


@Controller
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping("/")
	public String showGameHomePage(Model model) {
		
		String randomWord = gameService.toString();
		model.addAttribute("randomWord", randomWord);
		return "game-home-page";
	}
}
