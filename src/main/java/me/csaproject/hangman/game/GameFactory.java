package me.csaproject.hangman.game;

public interface GameFactory {

  Game create(int i, String category);
}
