

import java.util.Arrays;
import java.util.Scanner;

//find the maximum number in an integer array?
// example : - [5 4 3 7 9 5 ]
//output : - 9 is max;

public class arrays {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter 10 digits " );
        int [] arr = new int[10];


        for (int i = 0; i<10; i++){
            arr[i] = n.nextInt();
        }

        int max = arr[0];
        System.out.println("greatest number is ");
        for (int i = 0; i< arr.length;i++){
           if (arr[i] > max){
               max = arr[i];
           }
    }
        System.out.println(max);
    }
}
