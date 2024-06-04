package service;

import cache.WordsCache;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadService {

  private final WordsCache wordsCache;

  public FileReadService(WordsCache wordsCache) {
    this.wordsCache = wordsCache;
  }

  public void readFile(String fileName) throws IOException {
    ArrayList<String> list = new ArrayList<String>();
    FileReader in = new FileReader(fileName);
    BufferedReader br = new BufferedReader(in);
    while (br.readLine() != null) {
      list.add(br.readLine());
    }
    wordsCache.addList(fileName, list);
    in.close();
  }
}
