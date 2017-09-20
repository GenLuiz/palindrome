package com.test.main;

import java.util.Scanner;

import com.test.classes.PalindromesCheck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromesCheck checker = new PalindromesCheck();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira uma palavra:");
		String word = sc.nextLine();
		
		Boolean response = checker.checkPalindromes(word);
		
		if(response)
			System.out.println("A palavra inserida É palíndromo");
		else
			System.out.println("A palavra inserida NÃO É palíndromo");
	}
}
