package edu.cnm.deepdive;

public class Palindrome {

  public static boolean test(String candidate){
    String simpleCandidate = candidate.toLowerCase().replaceAll("[^a-z0-9]","" );
  //TODO Assign simpleCandidate from candidate, stripping out spaces & punctuation.
    return testSimple(simpleCandidate);
  }

  private static boolean testSimple(String candidate){
    boolean result = true;
    for (int i = 0, j = candidate.length() - 1 ; i < j; i++, j--){
      if(candidate.charAt(i) != candidate.charAt(j)) {
        result = false;
        break;
      }
    }
    return result;
  }

}
