/*
 * Problem:
 * Implement a method that checks if a given string is a single digit (0-9).
 * The method should return true if the string is a single digit,
 * and false otherwise. This includes checking for null or empty strings,
 * and ensuring that the string length is exactly one character.
 */

public class StringUtils {
  
  /**
   * This method checks if the input string is a single digit (0-9).
   * 
   * @param s The string to check
   * @return true if the string is a single digit, false otherwise
   */
  public static boolean isDigit(String s) {
    // Check if the string is not null (meaning it exists)
    // and has a length of exactly 1 character
    if (s != null && s.length() == 1) {
      // Get the first character of the string and check if it is a digit
      return Character.isDigit(s.charAt(0));
    }
    // If the string is null or not a single character, return false
    return false;
  }

  public static void main(String[] args) {
    // Test cases to demonstrate how the isDigit method works
    System.out.println(isDigit("5")); // true: '5' is a single digit
    System.out.println(isDigit("0")); // true: '0' is a single digit
    System.out.println(isDigit("9")); // true: '9' is a single digit
    System.out.println(isDigit("a")); // false: 'a' is not a digit
    System.out.println(isDigit("10
