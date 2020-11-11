package com.ezhevikina.task1;

import java.util.Arrays;
import java.util.Comparator;

public class StringsArray {

  public static String[] sortStringsByLength(String[] strings) {
    Arrays.sort(strings, Comparator.comparingInt(String::length));
    return strings;
  }
}
