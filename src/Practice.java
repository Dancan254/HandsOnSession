import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        //first project
        //simple calculator
        //take two numbers, perform operation of choice
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();
        //choose operations
        System.out.println("Choose operation(/, *, +, -, %)");
        input.nextLine();
        //read the operation
        String operation = input.nextLine();
        System.out.println("Lemme perform the operations relaaaaaaax........");
        //check the decision
        if (operation.equals("+")){
            //sum
            int sum = number1 + number2;
            System.out.println("Your sum is " + sum);
        } else if (operation.equals("*") ) {
            //product
            int product = number1 * number2;
            System.out.println("YOUr product is " + product);
        } else if (operation.equals("/")) {
            //division
            int quotient = number2/number1; //10 //67
            System.out.println("YOUr quotient is " + quotient);
        } else if (operation.equals("-")) {
            //subt
            int difference = number1 - number2;
            System.out.println("YOUr difference is " + difference);
        } else if (operation.equals("%")) {
            //mod
            int modulus = number1 % number2;
            System.out.println("YOUr modulus is " + modulus);
        }else {
            System.out.println("Operation not found");
        }

        //todo
        //implement switch and other operations you think are fit

        //projo two
        ///fizz buzz -
        /*
        range 1 -100
         *if divisible by 3 number == fizz
         * by 5 number ==buzz
         * both number == fizzbuzz
         */

        //projo3
        //even odd, prime checker
        //checks if the numbers are either of the conditions above

    }
}
