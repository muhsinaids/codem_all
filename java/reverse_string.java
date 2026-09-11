import java.util.Scanner;

public class reverse_string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.next();

        System.out.println("The string is: " + string);
 
        String reversed = "";

        for(int i=0;i<string.length();i++){
            reversed = string.charAt(i) + reversed;
        }
        System.out.println("Reversed string: " + reversed);
    }
}