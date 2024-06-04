package game;

import cache.WordsCache;
import service.FileReadService;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Game {
  private int maxTries;
  private int tries;
  private String word;
  private String build;
  private int incorrectGuesses;
  private int level;


  public Game(int Level, String cat, WordsCache cache) {
    this.maxTries = 0;
    this.tries = maxTries;
    this.word = cache.getRandomWord(cat);
    this.build = " ";
    this.incorrectGuesses = maxTries - tries;


  }

  public int calculateAllowedGuesses() {

    if (level == 1) {
      return 6;
    } else if (level == 2) {
      return 5;
    } else if (level == 3) {
      return 4;
    }
    return 0;
  }


  public void playGame() {
    Scanner Level = new Scanner(System.in);
    System.out.print("Enter the level: ");
    int level = Level.nextInt();
    if (level <= 1) {
      maxTries = 7;
      tries = maxTries;
    } else if (level == 2) {
      maxTries = 6;
      tries = maxTries;
    } else if (level >= 3) {
      maxTries = 5;
      tries = maxTries;
    }

    for (int j = 0; j < word.length(); j++) {
      build += "_ ";
    }

    for (int i = 0; i < maxTries; i++) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter letter");
      String letter = scanner.next().toLowerCase();
      if (letter.length() > 1) {
        System.out.println("One letter at a time");
        continue;
      }
      boolean letterFound = false;

      if (word.contains(letter)) {
        if (tries - 1 == 0) {
          System.out.print("YOU'RE HANGED. The word was: " + word);
        }

        else {
          for (int l = 0; l < word.length(); l++) {
            if (word.substring(l, l + 1).equals(letter)) {
              build = build.substring(0, l * 2) + letter + " " + build.substring(l * 2 + 2);
              letterFound = true;
            }
          }
          System.out.println(build);
          System.out.println("Good. You have " + (tries - 1) + " tries left!");

          if (build.equals(word + " ")) {
            System.out.print("YOU'VE WON!");
          }

        }
      }
      if (!letterFound) {
        if (tries - 1 == 0) {
          System.out.print("YOU'RE HANGED. The word was " + word);
        } else {
          System.out.println(build);
          System.out.println("WHOOPS! YOU HAVE " + (tries - 1) + " TRIES LEFT! ");
        }
      }
      tries--;
    }

  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getTries() {
    return tries;
  }

  public int getMaxTries() {
    return maxTries;
  }

  public int getIncorrectGuesses() {
    return incorrectGuesses;
  }

  public void setMaxTries(int a) {
    maxTries = a;
  }

  public int getLevel() {
    return level;
  }

}
