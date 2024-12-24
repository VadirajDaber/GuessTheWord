package com.guesstheword.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.guesstheword.service.GameService;
import com.guesstheword.utils.GameUtils;


@Controller
public class GameController {

	@Autowired
	private GameService gameService;
	
	@Autowired
	private GameUtils gameUtils;
	
	@GetMapping("/")
	public String showGameHomePage(Model model, @RequestParam(value = "guessedChar" ,required = false ) String guessedChar) {
	
		
		String randomWord = gameService.toString();
		
		
		if(guessedChar!=null) {
			
			boolean isGuessCorrect = gameService.addGuess(guessedChar.charAt(0));
			randomWord = gameService.toString();
			if(isGuessCorrect == false) {
				
				 gameUtils.reduceTry();
			}
		}
		
		model.addAttribute("randomWord", randomWord);
		model.addAttribute("triesLeft", gameUtils.getTriesRemaining());
		
		return "game-home-page";
	}
}
