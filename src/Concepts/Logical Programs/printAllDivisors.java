public class printAllDivisors {

  public static void main(String[] args) {

    int number = 36;

    for (int i = 1; i <= Math.sqrt(number); i++) {

      if (number % i == 0) {

        System.out.println(i);

        if (i != number / i) {
          System.out.println(number / i);
        }
      }
    }
  }
}
