package com.guesstheword.service;

import java.util.Arrays;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class GameService {

	private String[] randomWords = {"father", "mother", "sister", "string", "hello", "light", "java"};

	Random random = new Random();
	
	@Override
	public String toString() {
		
		System.out.println(randomWords.length);
		return randomWords[random.nextInt(randomWords.length)];
	}
	
	
}
