package me.csaproject.hangman;

import com.google.inject.Inject;
import com.google.inject.Injector;
import me.csaproject.hangman.cache.WordsCache;
import me.csaproject.hangman.game.Game;
import me.csaproject.hangman.game.Utils;
import me.csaproject.hangman.inject.BinderModule;
import me.csaproject.hangman.service.FileReadService;

import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    new Hangman().setup();


//    String cat = Utils.catPrompt();
//
//    Game game = new Game(1 , cat, wordsCache);
//    new HangmanGraphics(game);
//    game.playGame();

  }





}


