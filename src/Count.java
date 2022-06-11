import java.util.Scanner;


public class Count {
        public static void main(String[] args) {
        System.out.println("Enter the array");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < (arr.length-1); j++) {
                if (arr[i] == arr[j + 1]) {
                    counter = counter + 1;
                    System.out.println(arr[i] + ":" + counter);
                }
            }
        }
    }
}