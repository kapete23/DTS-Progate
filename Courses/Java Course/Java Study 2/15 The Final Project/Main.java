class Main {
  public static void main(String[] args) {
    // Assign a list of numbers into the numbers variable
    int[] numbers = {1, 4, 6, 9, 13, 16};
    
    int oddSum = 0;
    int evenSum = 0;
    
    // Calculate the sum of odd numbers and the sum of even numbers
    for (int number: numbers) {
      if (number % 2 == 0) {
        evenSum += number;
      }else {
        oddSum += number;
      }
    }
    
    // ---- If you want to use the normal for loop ----            
    // for (int i = 0; i < numbers.length; i++) {            
    //   if (numbers[i] % 2 == 0) {            
    //     evenSum += numbers[i];            
    //   } else {            
    //     oddSum += numbers[i];            
    //   }            
    // }

    System.out.println("The sum of odd numbers: " + oddSum);
    System.out.println("The sum of even numbers: " + evenSum);
  }
}
