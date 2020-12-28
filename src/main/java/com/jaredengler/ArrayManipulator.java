package com.jaredengler;

public class ArrayManipulator {

  public static void main(String[] args) {
    System.out.println("Hello World");
  }

  public long manipulate(int n, int[][] js) {
    long[] numbers = new long[n];

    long max = -1;
    for (int i = 0; i < js.length; i++) {
      max = map(js[i][0], js[i][1], js[i][2], numbers, max);
    }

    return max;
  }

  long map(int a, int b, long k, long[] js, long max) {
    for (int i = a-1; i < b; i++) {
      long val = js[i] + k;
      if (val > max) max = val;
      js[i] = val;
    }
    return max;
  }

}
