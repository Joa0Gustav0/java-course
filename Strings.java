public class Strings {
  public static void main(String[] args) {
    String modelString = "Hey there! I am learning about strings in Java.";

    int stringLength = modelString.length();
    System.out.println("The model string contains " + stringLength + " characters.");

    int targetWordPosition = modelString.indexOf("strings");
    System.out.println("In the model string, the word \"strings\" matches in the " + targetWordPosition + "th position.");

    //Concatenation
    String phraseOne = "Hello, World!";
    String phraseTwo = "I love Java!";

    //Common Way:
    String endPhrase = phraseOne + " " + phraseTwo;
    System.out.println(endPhrase);

    //Using the 'concat()'' method (It is a RETURNING method!):
    phraseOne = phraseOne.concat(phraseTwo);
    System.out.println(phraseOne);
  }
}