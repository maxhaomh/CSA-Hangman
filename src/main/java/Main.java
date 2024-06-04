import java.util.*;
import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
public class Main {



  // private static ArrayList<> wordLists = new ArrayList<>();
private static ArrayList <String> countries = new ArrayList<String>();
  private static ArrayList <String> foods= new ArrayList<String> ();
private static ArrayList <String> movies = new ArrayList <String> ();
  
public static void main(String[] args) throws IOException { 
// Button.createWindow();
readFile("Countries.txt", 0);
readFile("Foods.txt", 1);
readFile("Movies.txt", 2);

     Game game = new Game(1, countries, foods, movies);
     new HangmanGraphics(game);
    game.getRandomWord();
     game.playGame();   

// yo are you there 


/*JFrame frame = new JFrame("Circle and Line Example");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(WIDTH, HEIGHT);

      CircleAndLineExample panel = new CircleAndLineExample();
      frame.add(panel);

      frame.setVisible(true);*/
  }

private static void readFile(String fileName, int index) throws IOException  {
  ArrayList<String> list = new ArrayList<String>();
    FileReader in = new FileReader(fileName);
    BufferedReader br = new BufferedReader(in);
    while (br.readLine() != null) {
    list.add(br.readLine());
  }
  if (index == 0) {
    countries = list;
  }
  if (index == 1) {
    foods = list;
  }
  if (index == 2) {
    movies = list;
  }
  in.close();
  }

}


