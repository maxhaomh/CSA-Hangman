package game;

import java.util.Scanner;

public class Utils {


  public static String catPrompt() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("What category do you want? (foods, movies, countries) ");

    return scanner.nextLine();
  }
}


//  public String getRandomWord() {
//    String randomElement;
//
//    System.out.print("What category do you want? (foods, movies, countries) ");
//    ArrayList<String> list = new ArrayList<String>();
//    String choice = scanner.nextLine();
//
//    randomElement = "error";
//    System.out.println(list.size());
//    System.out.println(randomElement);
//    return null;
//  }