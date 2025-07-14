
//calculate the sum of all elements in an arrays?
// input :- [2 4 4 3 1 6]
// output :- 20;
// time complexity = O(n);
// space complexity = O(1);

import java.util.Scanner;

public class sumofarrays {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter 6 digits");
        int [] arr = new int[6];

        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = n.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Total sum of all digits are " + sum);
    }
}
