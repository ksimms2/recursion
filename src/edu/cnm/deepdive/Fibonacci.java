package edu.cnm.deepdive;

public class Fibonacci {

  public static long fibonacci(int n) {
    if(n <= 0){
      return 0;
    }
    if(n == 1){
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);

  }
}
