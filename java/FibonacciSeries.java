import java.util.Scanner;

public class FibonacciSeries {
    public static void fibonacci(int number){

        if(number <= 0){
            System.out.println("Enter a positive number.");
            return;
        }

        int num1 = 0;
        int num2 = 1;

        if(number >= 1){
            System.out.print(num1 + " ");
        }
        if(number >= 2){
            System.out.print(num2 + " ");
        }

        for(int i=2; i < number; i++){
            int sum = num1+num2;
            num1 = num2;
            num2 = sum;
            System.out.print(num2 + " ");
        }
    System.out.println();
    }    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int user_number = sc.nextInt();

        fibonacci(user_number);
        sc.close();
    }
}
