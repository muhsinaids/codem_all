import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an armstrong number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;
        while(temp>0){
            temp = Math.floorDiv(temp, 10);
            count = count + 1;

        }

        int armstrong_number = 0;
        int copy_number = number;
        while(copy_number>0){
            int digit = copy_number%10;
            armstrong_number = (int) Math.pow(digit, count);
            copy_number = Math.floorDiv(copy_number, 10);

        System.out.println("Digit count: " + count);
        System.out.println("Computed sum: " + armstrong_number);

        if (armstrong_number == number){
            System.out.println(number + " is an armstrong number ");
        }
        else{
            System.out.println(number + " is not an armstrong number ");
        }
        sc.close();
        }
    }
}