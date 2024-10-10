public class Recursion {
  static void main(String[] args) {
    System.out.println("The sum is " + sumUntil(3) + "!!!");
    System.out.println("The ranged sum is " + sumFromUntil(3, 5) + "!!!");
  }

  static int sumUntil(int maximumNumber) {
    if (maximumNumber > 0) {
      return maximumNumber + sumUntil(maximumNumber - 1);
    } else {
      return maximumNumber;
    }

  }

  static int sumFromUntil(int minimumNumber, int maximumNumber) {
    if (maximumNumber > minimumNumber) {
      return maximumNumber + sumFromUntil(minimumNumber, maximumNumber - 1);
    } else {
      return maximumNumber;
    }

  }
}