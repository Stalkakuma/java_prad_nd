package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        // Write your program here
        int reverseNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverseNumber);
    }
}
