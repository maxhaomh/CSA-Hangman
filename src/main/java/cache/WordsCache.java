package cache;

import java.util.ArrayList;
import java.util.HashMap;

public class WordsCache {


  private final HashMap<String, ArrayList<String>> wordsCache;

  public WordsCache() {
    wordsCache = new HashMap<>();
  }

  public void addList(String key, ArrayList<String> words) {
    wordsCache.put(key, words);
  }

  public ArrayList<String> getList(String key) {
    return wordsCache.get(key);
  }

  public String getRandomWord(String key) {
    ArrayList<String> list = wordsCache.get(key);
    int randomIndex = (int) (Math.random() * list.size());
    return list.get(randomIndex);
  }


}
