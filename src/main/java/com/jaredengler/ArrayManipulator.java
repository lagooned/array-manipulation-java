package com.jaredengler;

public class ArrayManipulator {

  public static void main(String[] args) {
    System.out.println("Hello World");
  }

  public int manipulate(int n, int[][] js) {
    int[] numbers = new int[n];
    for (int i = 0; i < js.length; i++) numbers[i] = 0;

    int max = 0;
    for (int i = 0; i < js.length; i++) {
      max = mapAndMax(js[i][0], js[i][1], js[i][2], numbers);
    }

    return max;
  }

  int mapAndMax(int a, int b, int k, int[] js) {
    int currentMax = 0;
    for (int i = 0; i < js.length; i++) {
      if (i >= a - 1 && i <= b - 1) {
        js[i] = js[i] + k;
      }
      if (currentMax < js[i]) {
        currentMax = js[i];
      }
    }
    return currentMax;
  }

}
