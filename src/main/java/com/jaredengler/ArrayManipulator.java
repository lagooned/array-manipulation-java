package com.jaredengler;

public class ArrayManipulator {

  public static void main(String[] args) {
    System.out.println("Hello World");
  }

  public long manipulate(int n, int[][] js) {
    long[] ns = new long[n+1];

    for (int i = 0; i < js.length; i++) {
      int a = js[i][0];
      int b = js[i][1];
      int k = js[i][2];
      ns[a-1] = ns[a-1] + k;
      ns[b] = ns[b] - k;
    }

    for (int i = 0; i < n; i++) {
      ns[i + 1] = ns[i] + ns[i + 1];
    }

    long max = 0;
    for (int i = 0; i < n; i++) {
      if (ns[i] > max) {
        max = ns[i];
      }
    }

    return max;
  }

}
