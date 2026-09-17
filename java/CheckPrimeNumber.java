import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = sc.nextInt();
        boolean isprime = true;

        if(number>1){
            for( int i=2; i<= Math.sqrt(number); i++){
                if (number%2==0){
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime){
            System.out.println(number + " is a prime number.");
        }
        else{
            System.out.println(number + " is not a prime number.");
        }
        sc.close();
    }
}