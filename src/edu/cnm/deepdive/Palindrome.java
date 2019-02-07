package edu.cnm.deepdive;

public class Palindrome {

  public static boolean test(String candidate){
    String simpleCandidate = candidate.toLowerCase().replaceAll("[^a-z0-9]","" );
  //TODO Assign simpleCandidate from candidate, stripping out spaces & punctuation.
    return testSimple(simpleCandidate);
  }

  private static boolean testSimple(String candidate){
    return (candidate.length() <= 1)
    || (candidate.charAt(0) == candidate.charAt(candidate.length() - 1)
    && testSimple(candidate.substring(1, candidate.length() - 1)));

  }

}
