package me.csaproject.hangman.game;

import java.util.Scanner;

public class Utils {


  public static String catPrompt() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("What category do you want? (foods, movies, countries) ");

    return scanner.nextLine();
  }
}

