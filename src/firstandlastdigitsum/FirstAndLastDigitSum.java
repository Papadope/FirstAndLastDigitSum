package firstandlastdigitsum;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(11));

    }

    public static int sumFirstAndLastDigit(int number) {
 
    if (number < 0) {
        return -1;
    }
 
    int first = 0, last = number % 10;
 
    while (number > 0) {
        first = number;
        number /= 10;
    }
 
    return first + last;
}
}
