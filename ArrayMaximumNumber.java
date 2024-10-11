import java.util.Scanner;


public class ArrayMaximumNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.print("Input Index " + i + " : ");
            arr[i] = sc.nextInt();

        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (max <= arr[i]) {

                max = arr[i];

            }

        }

        sc.close();

        System.out.println("Maximum number of the array : " + max);

    }

}
