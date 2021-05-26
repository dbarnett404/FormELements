import java.util.Scanner;
//Always have a Main class
public class Main {
    //Always have a main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number (integer)");

        //Define two variables
        int num1 = sc.nextInt();

        System.out.println("Enter second number (integer)");
        int num2 = sc.nextInt();

        //Use the calculator class
        //Make an instance of the class
        //Calculator is the class - it's the definition of the class
        //calc is called the object - it's an instance of a class
        Calculator calc = new Calculator();

        //Prints out the sum of two numbers
        //Uses the method in the Calculator class
        System.out.println(num1 + " + " + num2 + " = " + calc.addTwoNumbers(num1, num2));

        System.out.println(num1 + " - " + num2 + " = " + calc.subtractTwoNumbers(num1, num2));

    }
}
