public class FizzBuzz {
  // Fix the logic in the solution so that all 3 test cases pass.
  public String fizzBuzzString(String str) {
    try {
      if (str.startsWith("f") && str.endsWith("b"))
        return "FizzBuzz";
      if (str.startsWith("f"))
        return "Fizz";
      if (str.endsWith("b"))
        return "Buzz";

      return str; // Returns original string if no conversion possible
    } catch (NullPointerException e) {
      return null;
    }
  }
}