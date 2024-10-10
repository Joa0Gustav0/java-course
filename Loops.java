public class Loops {
  static void main(String[] args) {
    String[] favoriteFoods = {"Pizza", "Burger", "French-Fries", "Pineapple", "Grape", "Cheese"};

    //For Loop
    for (int i = 0; i < favoriteFoods.length; i++) {
      System.out.println("I love eating " + favoriteFoods[i] + "!");
    }

    //For-Each Loop
    for (String food : favoriteFoods) {
      System.out.println("I love eating " + food + "!");
    }

    //While Loop
    int index = 0;
    while (index < favoriteFoods.length) {
      System.out.println("I love eating " + favoriteFoods[index] + "!");
      index++;
    }

    //Break in Loop
    String targetFood = "French-Fries";
    for (String food : favoriteFoods) {
      if (food == targetFood) {
        System.out.println("I found the " + targetFood + "!");
        break;
      } else {
        System.out.println(targetFood + " is not here...");
      }
    }
  }
}
