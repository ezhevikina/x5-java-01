package com.ezhevikina.task1;

public class StringsArray {

  public static String[] sortStringsByLength(String[] strings) {
    if (strings != null) {
      String tmp;
      for (int i = strings.length - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
          if (strings[j].length() > strings[j + 1].length()) {
            tmp = strings[j];
            strings[j] = strings[j+1];
            strings[j + 1] = tmp;
          }
        }
      }
    }
    return strings;
  }
}
