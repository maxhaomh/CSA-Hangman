package me.csaproject.hangman.inject;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import me.csaproject.hangman.game.GameFactory;

public class GameModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new FactoryModuleBuilder().build(GameFactory.class));
  }
}
