package com.guesstheword.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class GameService {

	private String randomlyChoosenWord = null;

	private String[] randomWords = { "father", "mother", "sister", "string", "hello", "light", "java" };

	private char[] allCharactersOfTheWord;

	Random random = new Random();

	public GameService() {

		randomlyChoosenWord = randomWords[random.nextInt(randomWords.length)];
		allCharactersOfTheWord = new char[randomlyChoosenWord.length()];
	}

	@Override
	public String toString() {

		System.out.println("Randomely Choosen Word : " + randomlyChoosenWord);
		
		String ret = "";

		for (char c : allCharactersOfTheWord) {

			if (c == '\u0000') {

				ret = ret + "_";
			} else {

				ret = ret + c;
			}
			ret = ret + " ";

		}

		return ret;
	}

	public void addGuess(char guessedChar) {

		

		for (int i = 0; i < randomlyChoosenWord.length(); i++) {

			if (guessedChar == randomlyChoosenWord.charAt(i)) {

				allCharactersOfTheWord[i] = guessedChar;
			}
		}
	}

}
