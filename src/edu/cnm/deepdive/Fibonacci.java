package edu.cnm.deepdive;

public class Fibonacci {

  public static long fibonacci(int n) {
    if(n <= 0){
      return 0;
    }
    if(n == 1){
      return 1;
    }
    long prev = 0;
    long curr = 1;
    for(int i = 2; i <= n; i++){
      long temp = prev + curr;
      prev = curr;
      curr = temp;

    }
    return curr;

  }

  public static void main(String[] args) {
    System.out.println(fibonacci(10));
  }
}
