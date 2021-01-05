package com.jaredengler;

public class ArrayManipulator {

  public static void main(String[] args) {
    int n = 10;
    int[][] queries = new int[][] {
      new int[] {1,5,3},
      new int[] {4,8,7},
      new int[] {6,9,1},
    };
    long output = (new ArrayManipulator()).manipulate(n, queries);
    System.out.println(output);
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

    long max = 0;
    for (int i = 0; i < n; i++) {
      ns[i + 1] = ns[i] + ns[i + 1];
      if (ns[i] > max) {
        max = ns[i];
      }
    }

    return max;
  }

}
