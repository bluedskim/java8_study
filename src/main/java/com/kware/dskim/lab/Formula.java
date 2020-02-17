package com.kware.dskim.lab;

interface Formula {
  double calculate(int a);

  default double sqrt(int a) {
    return Math.sqrt(a);
  }
}