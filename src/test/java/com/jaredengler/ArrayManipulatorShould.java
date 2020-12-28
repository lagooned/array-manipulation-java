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
  void manipulateReturnsCorrectValueCase1() {
    int n = 5;
    int[][] input = new int[][] {
      new int[] {1,2,100},
      new int[] {2,5,100},
      new int[] {3,4,100},
    };
    assertThat(arrayManipulator.manipulate(n, input), is(200L));
  }

  @Test
  void manipulateReturnsCorrectValueCase2() {
    int n = 10;
    int[][] input = new int[][] {
      new int[] {1,5,3},
      new int[] {4,8,7},
      new int[] {6,9,1},
    };
    assertThat(arrayManipulator.manipulate(n, input), is(10L));
  }

}
