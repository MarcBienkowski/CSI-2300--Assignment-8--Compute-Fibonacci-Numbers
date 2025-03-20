import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static int Fibonacci(int term){

        if (term > 0) { //positive integers
            if (term == 0){
                return term;
            } else if(term == 1){
                return 1;
            }
            return Fibonacci(term - 1) + Fibonacci(term - 2);


        } else { //negative integers
            if (term == 0){
                return term;
            } else if(term == 1){
                return 1;
            }
            return Fibonacci(term + 2) - Fibonacci(term + 1);
        }  
    }
    public static void main(String[] args) throws Exception {
        try{
            int input = Integer.parseInt(args[0]);
            System.out.println(Fibonacci(input));
        } catch(NumberFormatException e) {
            System.out.println("ERROR: Please enter a integer value");
        }
    }
} 
