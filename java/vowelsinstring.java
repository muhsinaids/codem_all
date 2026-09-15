import java.util.Scanner;

public class vowelsinstring {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:");
        String str = sc.nextLine();

        char[] vowels = {'a','e','i','o','u'};
        int inc = 0;

        for(int i=0; i<str.length();i++){
            char c = Character.toLowerCase(str.charAt(i));
            for(char v : vowels){
                if(c == v){
                    inc++;
                }
            }
        }
        System.out.println("Number of vowels in the string: " + inc);
        sc.close();
    }
}
