import java.util.Scanner;
import java.util.Arrays;

public class ArrayBubbleSort {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the array elements separated by space:");
    String number_in = sc.nextLine();
    String[] sort = number_in.split(" ");
    int[] unsorted = new int[sort.length];

    for(int p=0; p < sort.length; p++){
        unsorted[p] = Integer.parseInt(sort[p]);
    }
    
    for (int i = 0; i < unsorted.length - 1; i++) {
        for (int j = 0; j < unsorted.length - i - 1; j++) {
            if (unsorted[j + 1] > unsorted[j]) { 
                int temp = unsorted[j];
                unsorted[j] = unsorted[j + 1];
                unsorted[j + 1] = temp;
            }
        }
    }

    System.out.println(Arrays.toString(unsorted));
    sc.close();
    }
}