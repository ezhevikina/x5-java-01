package com.ezhevikina.task3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReversedStringsArrayTest {
  @Test
  public void nullArray() {
    String[] strings = null;
    assertArrayEquals(null, ReversedStringsArray.reverseArray(strings));
  }

  @Test
  public void emptyStringsArray() {
    String[] strings = {};
    String[] result = {};
    assertArrayEquals(result, ReversedStringsArray.reverseArray(strings));
  }

  @Test
  public void oneStringArray() {
    String[] strings = {"one"};
    String[] result = {"one"};
    assertArrayEquals(result, ReversedStringsArray.reverseArray(strings));
  }

  @Test
  public void arrayOfOddAmountOfStrings() {
    String[] strings = {"five", "four", "three", "two", "one"};
    String[] result = {"one", "two", "three", "four", "five"};
    assertArrayEquals(result, ReversedStringsArray.reverseArray(strings));
  }

  @Test
  public void arrayOfEvenAmountOfStrings() {
    String[] strings = {"six", "five", "four", "three", "two", "one"};
    String[] result = {"one", "two", "three", "four", "five", "six"};
    assertArrayEquals(result, ReversedStringsArray.reverseArray(strings));
  }
}
