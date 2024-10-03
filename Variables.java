//There are some available variables data types in Java.
/* 
  String - Stores "Text" datas;
  char - Stores single characters datas;
  int - Stores integer numbers. ex.: 2,5,86,27;
  float - Stores floating numbers. ex.: 1.35f, 67.48f, -8.9f;
  boolean - Stores boolean values (true, false)
*/ 
//Notice that only the String type keyword is capitalized.

public class Variables {
  public static void main(String[] args) {
    //For declaring a variable use the following pattern:
    //DataType Identifier = value;
    final String name = "Gustavo";
    //The keyword "final" ensures a variable of being a constant one.
    //Trying to assign a new value to it will result in error.
    System.out.println("Hello! My name is " + name + "!");

    int age = 18;
    System.out.println("I am " + age + " years old.");

    float height = 1.78f;
    System.out.println("My height is " + height + " meters.");

    
    //Multiple variables declaring:
    //Same Data Type Variables:
    String studentA = "Carlos", studentB = "Henrique", studentC = "David";
    System.out.println("Students: " + studentA + " " + studentB + " " + studentC + " ");

    //Same Value Variables;
    float sideA, sideB, sideC;
    sideC = sideB = sideA = 5.87f;
    System.out.println("Sizes: " + sideA + " " + sideB + " " + sideC);
  }
}
