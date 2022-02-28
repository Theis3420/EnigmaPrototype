package enigmaprototype;

import java.util.Scanner;

public class EnigmaPrototype {
  char[] letters = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};
  int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};

  public int letterEncryption(char letter) {
    for (int i = 0; i < letters.length; i++) {
      if (letters[i] == letter) {
        return numbers[i];
      }
    }
    return -1;
  }
  public char numberDecryption(int number) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == number) {
        return letters[i];
      }
    }
    return '/';
  }
  public void test() {
    Scanner in = new Scanner(System.in);

    System.out.print("Write a Letter: ");
    char userCharInput = in.nextLine().charAt(0);
    System.out.println("Your letter was encrypted as: " + letterEncryption(userCharInput));

    System.out.print("Write a Number: ");
    int userIntInput = in.nextInt();
    System.out.println("Your number was decrypted as: " + numberDecryption(userIntInput));
  }
  public void execute() {
    test();
  }
  public static void main(String[] args) {
    new EnigmaPrototype().execute();
  }
}
