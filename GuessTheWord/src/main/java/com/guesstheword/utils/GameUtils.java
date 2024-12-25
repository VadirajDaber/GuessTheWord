package com.guesstheword.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.guesstheword.service.GameService;

@Component
public class GameUtils {
	

	@Autowired
	ConfigurableApplicationContext applicationContext;

	private int maxTries = 5;
	
	public int reduceTry() {
		
		maxTries = maxTries - 1;
		return maxTries;
	}
	
	public int getTriesRemaining() {
		
		return maxTries;
	}
	
	
	public void resetTries() {
		
		maxTries = 5;
	}
	
	public GameService reload() {
		
		GameService gameService = applicationContext.getBean(GameService.class);
		
		return gameService;
		
		
	}
}
