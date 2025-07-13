
import java.util.Scanner;

// check if it is sorted in ascending order or not?
// input : - 2 5 9 4 6
//output : - wrong
// input : - 2 5 9 12 45
//output : - Right

// time complexity = O(n);
// space complexity = O(1);

public class ascendingarray {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int [] arr = new int[5];
        System.out.println("Enter Ascending order");
        for (int i = 0; i< 5; i++){
            arr[i] = n.nextInt();
        }
        boolean ascending = true;

        for (int i = 0; i < arr.length - 1 ; i++){
            if(arr[i] <= arr[i + 1]) {
                ascending = false;
                break;
            }
        }
          if(ascending){
              System.out.println("true it is ascending order");
          }else{
              System.out.println("Wrong it is not ascending order");
          }
        }
}
