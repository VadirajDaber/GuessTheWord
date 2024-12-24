package com.guesstheword.utils;

import org.springframework.stereotype.Component;

@Component
public class GameUtils {

	private int maxTries = 5;
	
	public int reduceTry() {
		
		maxTries = maxTries - 1;
		return maxTries;
	}
	
	public int getTriesRemaining() {
		
		return maxTries;
	}
}
