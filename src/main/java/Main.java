import cache.WordsCache;
import game.Game;
import game.Utils;
import service.FileReadService;

import java.io.*;

public class Main {


  private static FileReadService fileReadService;

  private static WordsCache wordsCache;

  public static void main(String[] args) throws IOException {

    fileReadService = new FileReadService(new WordsCache());
    wordsCache = new WordsCache();

    fileReadService.readFile("countries.txt");
    fileReadService.readFile("foods.txt");
    fileReadService.readFile("movies.txt");

    String cat = Utils.catPrompt();

    Game game = new Game(1 , cat, wordsCache);
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


