import java.util.Scanner;

public class SumOfDigitsOfNumbers{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        System.out.println("The number is;" + number);
        int digit; int sum_digits = 0;

        while(number>0){
            digit = number%10;
            sum_digits = sum_digits + digit;
            number = Math.floorDiv(number, 10);
        }
        System.out.println("The Sum of Digits is:" +  sum_digits);
    }
}