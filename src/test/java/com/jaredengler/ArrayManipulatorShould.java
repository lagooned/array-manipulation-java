package com.jaredengler;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class ArrayManipulatorShould {

  ArrayManipulator arrayManipulator = new ArrayManipulator();

  @Test
  void returnsAnInt() {
    assertThat(arrayManipulator.manipulate(0, new int[0][0]), isA(long.class));
  }

  @Test
  void mapAndMaxManipulatesArray() {
    long[] array = new long[]{0,0,0,0,0,0,0,0};
    arrayManipulator.map(1, 7, 1L, array, -1);
    assertThat(array, is(new long[]{1,1,1,1,1,1,1,0}));
  }

  @Test
  void manipulateReturnsCorrectValue() {
    int[][] input = new int[][] {
      new int[] {1,5,3},
      new int[] {4,8,7},
      new int[] {6,9,1},
    };
    int n = 10;

    assertThat(arrayManipulator.manipulate(n, input), is(10L));
  }
}
