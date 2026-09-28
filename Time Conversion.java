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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String hour = s.split(":")[0];
        String amOrPm = s.substring(s.length() - 2);
        
        String newString = "";
        
        if (amOrPm.equals("AM")) {
            if (hour.equals("12")) {
                newString = "00"+s.substring(2, s.length()-2);
                System.out.println(newString);
            } else {
                newString = s.substring(0, s.length()-2);
                System.out.println(newString);
            }
        } else {
            int hourNum = Integer.parseInt(hour);
            if(hourNum < 12) {
                hourNum = hourNum + 12;
            }
            newString = hourNum+s.substring(2, s.length()-2);
            System.out.println(newString);
            
        }
        return newString;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
