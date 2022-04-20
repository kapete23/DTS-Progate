class Main {
  public static void main(String[] args) {
    String[] names = {"Bob", "Kate", "John"};
    Double[] numbers = {9.8, 3.1459, 1.999, 0.18};
    
    // Get the elements of names using an enhanced for loop, and print "My name is ____"
    for (String name: names) {
      System.out.println("My name is " + name);
    }

    System.out.println();

    // Untuk tipe data double
    for (Double number: numbers) {
      System.out.println(number);
    }
    
  }
}