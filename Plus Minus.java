import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int positiveSum = 0, negativeSum = 0, zeroSum = 0;
        for (var element: arr) {
            if (element > 0) {
                positiveSum++;
            } else if (element < 0) {
                negativeSum++;
            } else {
                zeroSum++;
            }
        }
        int arrSize = arr.size();
        double positiveSumRatio = (double)(positiveSum) / arrSize;
        double negativeSumRatio = (double)(negativeSum) / arrSize;
        double zeroSumRatio = (double)(zeroSum) / arrSize;
        
        DecimalFormat df = new DecimalFormat("0.00000");
        
        System.out.println(df.format(positiveSumRatio));
        System.out.println(df.format(negativeSumRatio));
        System.out.println(df.format(zeroSumRatio));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
