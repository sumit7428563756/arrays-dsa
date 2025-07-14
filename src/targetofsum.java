
//check if any two elements add up to the target sum?
// input :- [2 4 6 5 7 8 10]
// traget :- 15
//output :- 5+10 = 15, 8+7 = 15,
// time complexity = O(n^2);
// space complexity = O(1);

import java.util.Scanner;

public class targetofsum {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter 8 digits ");
        int [] arr = new int[8];

        for (int i = 0; i< arr.length ; i++){
            arr[i] = n.nextInt();
        }
        int i = 0;
        System.out.print("Enter target value to sum of 2 nums ");
        int target = n.nextInt();

        boolean isPair = false;

        for(i = 0; i< arr.length;i++){
            for (int j = i + 1; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                    isPair = true;
                }
            }
        }
        if (!isPair) {
            System.out.println("No such pair found");
        }
    }
}
