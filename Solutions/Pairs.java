import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pairs {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        int result = 0;
        Set<Integer> list = convertArrayToSet(arr);

        for(int i = 0; i < arr.length; i++) {
            if(list.contains(arr[i]+k))
                result++;
        }
        
        return result;
    }

    public static Set<Integer> convertArrayToSet(int[] arr)
    {
        Set<Integer> mySet = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            mySet.add(arr[i]);
        }

        return mySet;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
