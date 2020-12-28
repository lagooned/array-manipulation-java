package com.jaredengler;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class ArrayManipulatorShould {

  ArrayManipulator arrayManipulator = new ArrayManipulator();

  @Test
  void returnsAnInt() {
    assertThat(arrayManipulator.manipulate(0, new int[0][0]), isA(int.class));
  }

  @Test
  void mapAndMaxManipulatesArray() {
    int[] array = new int[]{0,0,0,0,0,0,0,0};
    arrayManipulator.mapAndMax(1, 7, 1, array);
    assertThat(array, is(new int[]{1,1,1,1,1,1,1,0}));
  }

  @Test
  void mapAndMaxFindsMax() {
    int[] array = new int[]{0,0,0,0,0,0,0,0};
    int max = arrayManipulator.mapAndMax(1, 7, 1, array);
    assertThat(array, is(new int[]{1,1,1,1,1,1,1,0}));
    assertThat(max, is(1));
  }

  @Test
  void manipulateReturnsCorrectValue() {
    int[][] input = new int[][] {
      new int[] {1,5,3},
      new int[] {4,8,7},
      new int[] {6,9,1},
    };
    int n = 10;

    assertThat(arrayManipulator.manipulate(n, input), is(10));
  }
}
