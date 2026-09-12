import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int temp = number;
        int reverse = 0; int digit;
        
        while(number>0){
            digit = number%10;
            reverse = reverse*10 + digit;
            number = Math.floorDiv(number, 10);
        }

        System.out.println("The reverse of the number is: " + reverse);

        if(temp == reverse){
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }
    }
}
