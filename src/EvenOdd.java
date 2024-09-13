import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable
        int value;

        //value input
        System.out.println("What is the value you want to determine if it is even or odd?");
        value = scan.nextInt();

        //determines if the value is even or odd and outputs the answer
        if (value % 2 == 0) {
            System.out.println("The number " + value + " is even!");
        } else {
            System.out.println("The number " + value + " is odd!");
        }
    }
}