
//search for a particular element in an array?
//explain :- input = [2 4 9 12 46 3 ]
//find : - 12
//output :- if find print found else not found

// Time complexity = O(1) else O(n);
// because if it find target it stops at target and loop get the end so time complexity is O(1);
// otherwise if it not found loop complete all its rotation so then time complexity is O(n);
// Space complexity = O(1); it dont remain any space.

import java.util.Arrays;
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter 6 digits ");
        int [] arr = new int[6];

        for (int i = 0; i< arr.length; i++) {
            arr[i] = n.nextInt();
        }
        boolean isFound = false;

        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == 6){
                isFound = true;
                break;
            }
        }
        if (isFound){
            System.out.println(" 6 is found");
        }else{
            System.out.println(" 6 is not found");
        }
    }

}
