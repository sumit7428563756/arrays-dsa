import java.util.Scanner;

// Take 5 integers from user input and print them in reverse order?
//ex :- user input = 5 4 8 9 6
// output :- 6 9 8 4 5
public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Enter 5 digits ");
        int[] arr = new int[5];

        for (int i = 0; i < 5;i++){
            arr[i] = n.nextInt();
        }

        System.out.println("Reverse digits are  ");
        for (int i = 4; i>=0 ; i--){
            System.out.print(arr[i] + "  ");
        }

    }
}