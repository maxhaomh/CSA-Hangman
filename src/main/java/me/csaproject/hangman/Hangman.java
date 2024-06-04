package me.csaproject.hangman;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import lombok.Getter;
import me.csaproject.hangman.cache.WordsCache;
import me.csaproject.hangman.game.Game;
import me.csaproject.hangman.game.GameFactory;
import me.csaproject.hangman.game.Utils;
import me.csaproject.hangman.inject.BinderModule;
import me.csaproject.hangman.inject.GameModule;
import me.csaproject.hangman.service.FileReadService;

import java.io.IOException;

@Getter
public class Hangman {

  @Inject
  private FileReadService fileReadService;
  @Inject
  private WordsCache wordsCache;

  @Inject
  GameFactory gameFactory;


  public void setup() throws IOException {

    Injector injector = Guice.createInjector(new BinderModule(this), new GameModule());
    injector.injectMembers(this);


    fileReadService.readFile("countries.txt");
    fileReadService.readFile("foods.txt");
    fileReadService.readFile("movies.txt");


    start();
  }


  public void start() {

    String category = Utils.catPrompt();

    Game game = gameFactory.create(1, category);
    game.playGame();



  }

}
