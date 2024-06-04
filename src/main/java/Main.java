import cache.WordsCache;
import service.FileReadService;

import java.util.*;
import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
public class Main {


  private static FileReadService fileReadService;

  private static WordsCache wordsCache;

  public static void main(String[] args) throws IOException {

    fileReadService = new FileReadService(new WordsCache());
    wordsCache = new WordsCache();

    fileReadService.readFile("countries.txt");
    fileReadService.readFile("foods.txt");
    fileReadService.readFile("movies.txt");

    Game game = new Game(1 , wordsCache);
    new HangmanGraphics(game);
    game.getRandomWord();
    game.playGame();

/*JFrame frame = new JFrame("Circle and Line Example");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(WIDTH, HEIGHT);

      CircleAndLineExample panel = new CircleAndLineExample();
      frame.add(panel);

      frame.setVisible(true);*/
  }

}


