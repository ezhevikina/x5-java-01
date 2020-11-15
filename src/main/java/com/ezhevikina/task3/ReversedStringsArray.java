package com.ezhevikina.task3;

public class ReversedStringsArray {

  public static String[] reverseArray(String[] array) {
    if (array == null || array.length < 2) {
      return array;
    }

    String tmp;
    for (int i = 0,  j = array.length - 1; i <=  (array.length - 1) / 2; i++, j--) {
      tmp = array[i];
      array[i] = array[j];
      array[j] = tmp;
    }
    return array;
  }
}
