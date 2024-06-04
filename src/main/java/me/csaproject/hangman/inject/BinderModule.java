package me.csaproject.hangman.inject;

import com.google.inject.AbstractModule;
import me.csaproject.hangman.Hangman;

public class BinderModule extends AbstractModule {
  private final Hangman hangman;

  public BinderModule(Hangman hangman) {
    this.hangman = hangman;
  }

  @Override
  protected void configure() {
    bind(Hangman.class).toInstance(hangman);
  }

}
