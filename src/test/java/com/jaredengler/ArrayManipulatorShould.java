package com.jaredengler;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class ArrayManipulatorShould {

  ArrayManipulator arrayManipulator = new ArrayManipulator();

  @Test
  void returnsAnInt() {
    assertThat(arrayManipulator.manipulate(0, new int[0][0]), isA(int.class));
  }
}
