package com.ezhevikina.task1;

import com.ezhevikina.task3.ReversedStringsArray;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringsArrayTest {

  @Test
  public void emptyStringsArray() {
    String[] strings = {};
    String[] result = {};
    assertArrayEquals(result, StringsArray.sortStringsByLength(strings));
  }

  @Test
  public void oneStringArray() {
    String[] strings = {"one"};
    String[] result = {"one"};
    assertArrayEquals(result, ReversedStringsArray.reverseArray(strings));
  }

  @Test
  public void fiveStringsWithDifferentLength() {
    String[] strings = {"one", "no", "effect", "3344", "something"};
    String[] result = {"no", "one", "3344", "effect", "something"};
    assertArrayEquals(result, StringsArray.sortStringsByLength(strings));
  }

  @Test
  public void stringWithSameLengthShouldNotBeSorted() {
    String[] strings = {"six", "five", "four", "three", "two", "one"};
    String[] result = {"six", "two", "one", "five", "four", "three"};
    assertArrayEquals(result, StringsArray.sortStringsByLength(strings));
  }
}
