
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
       System.out.println("Choose an option:A,B,C");

       printAnyString("Hi you are the best program, the program has some options such as:A,B and C");
        printAnyString("Please type any option");
        String option= leer.nextLine();
        switch(option.toLowerCase()){
            case "a":
                printAnyString("Now you are in sum program, it is necessary to read two numbers");
                printAnyString("Type the first number");
                int number= leer.nextInt();
                printAnyString("Type the second number");
                int number2= leer.nextInt();
                int sumResult = sumNumbers(number,number2);
                printAnyString("The result of sum is " + sumResult);
                break;
            case "b":
                printAnyString("Now you are in String Program");
                String phrase=leer.nextLine();
                printPhrase("Here is your phrase printed: " + phrase);
                break;
            case "c":
                printAnyString("Now you are in a cosine program, read a number and it makes the cosine of that number");
                int numcos = leer.nextInt();
                double cosResult=cosNumber(numcos);
                printAnyString("The cosine of that number is " + cosResult);
                break;
        }


    }
    public static void printAnyString(String message){
        System.out.println(message);
    }
    public static int sumNumbers(int number,int number2){
        return number+number2;
    }
    public static void printPhrase(String phrase){
        System.out.println(phrase);
    }
    public static double cosNumber(int numcos){
        double angleRadians = Math.toRadians(numcos);
    double cos=Math.cos(angleRadians);
    return cos;
    }
}
