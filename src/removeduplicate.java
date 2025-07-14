//remove duplicate from a sorted array?
//input : - [2 4 6 8 10 10 12]
//output :- 10 is duplicate and remove


import java.util.Scanner;

public class removeduplicate {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter 8 digits add duplicates ");
        int[] arr = new int[8];

        for (int i = 0; i< arr.length; i++){
            arr[i] = n.nextInt();
        }

        int i = 0;

        for (int j = 1;j<arr.length;j++){
            if (arr[j] != arr[i] ){
             i++;
             arr[i] = arr[j];
            }
        }


        System.out.println("Array after removing duplicates:");
        for (int k = 0; k <= i;k++){
            System.out.print(arr[k] + " ");
        }

    }
}
