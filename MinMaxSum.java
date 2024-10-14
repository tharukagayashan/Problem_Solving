import java.io.*;
import java.util.*;

public class MinMaxSum {

    public static void minMaxSum(List<Integer> arr) {
        long max = 0;
        long min = 0;
        long sum = 0;
        for (Integer i : arr) {
            sum += i;
            if (i >= max) {
                max = i;
            }

            if (min == 0L && i > min) {
                min = i;
            } else if (i < min) {
                min = i;
            }
        }

        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        MinMaxSum.minMaxSum(arr);

        bufferedReader.close();
    }
}
