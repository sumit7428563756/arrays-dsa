import java.util.Arrays;
import java.util.Scanner;

//Count how many even numbers are present in an array?
// input :- 5 4 9 7 2
// output : - 4,2 are 2 even number
public class counteven {
    public static void main(String[] args) {
        Scanner n  = new Scanner(System.in);
        System.out.println("Enter 10 digits include even numbers");
        int[] arr = new int[10];

        for (int i = 0 ; i<10; i++){
            arr[i] = n.nextInt();
        }

        for (int i = 0 ; i<10; i++){
       if (arr[i]%2 == 0){
           System.out.println(arr[i]);
       }
        }
    }

}
