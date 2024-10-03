//Type Casting is the process of data type coersion for Primitive Type Variables. 
//There are two (2) kinds if Type Casting: Widening and Narrowing.

class TypeCasting {
  public static void main(String[] args) {
    //Widening is the process of converting a small data type to a bigger one. It's done automatically.
    float lifeTimeInMonths = 18f * 12f + 0.3f;
    double doubleVariable = lifeTimeInMonths;
    System.out.println(doubleVariable);

    //Narrowing is the process of converting a wide data type to a small one. It's done manually.
    float price = 87.55f;
    int integerPrice = (int) price;
    System.out.println("The price is $" + integerPrice);
  } 
}