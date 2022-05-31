package com.KidsGames;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("Let's play a game of Rock, Paper, Scissors"); 
	    Scanner scan = new Scanner(System.in);
	  
	    String[] options = {"Rock", "Paper", "Scissors"};

	    Random rando = new Random();
	    int num = rando.nextInt(options.length);
	    String compOption = options[num];
	    String answer = scan.nextLine();
	    
	    if(answer.equals(compOption)){
	      System.out.println("Computer option: " + compOption + ".  We Tied");
	    } else if (answer.equals("Rock")){
	        if(compOption.equals("Scissors")){ System.out.println("Computer option: " + compOption + ". You Win");} 
	        else {System.out.println("Computer option: " + compOption + ". You Lose");}
	    } else if(answer.equals("Paper")){
	        if(compOption.equals("Rock")){
	          System.out.println("Computer option: " + compOption + ". You Win");
	        } else {System.out.println("Computer option: " + compOption + ". You Lose"); }
	    } else if (answer.equals("Scissors")){
	      if(compOption.equals("Paper")){
	        System.out.println("Computer option: " + compOption + ". You Win");
	      } else {System.out.println("Computer option: " + compOption + ". You Lose");}
	    } else {
	      System.out.println("Please Enter one of the following answers: Rock, Paper, Scissors");
	    }

	}

}
