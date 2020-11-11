package com.ezhevikina.task2;

public class TriangleMatrix {

  public int[][] rows(int count) {
    int[][] triangle = new int[count][];
    int val = 1;
    for (int i = 0; i < count; i++) {
      triangle[i] = new int[i + 1];
      for (int j = 0; j <= i; j++) {
        triangle[i][j] = val++;
      }
    }
    return triangle;
  }
}
