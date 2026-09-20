import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("The first number after swapping : " + num1);
        System.out.println("The second number after swapping : " + num2);
        
        sc.close();
    }
}
