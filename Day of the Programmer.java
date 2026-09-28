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
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
        int noOfDays = 243; // No of days till Aug in Non-Leap year
        
        if (year == 1918) {
            return "26.09.1918";
        }
        // Check if the given year to be considered Julian or Gregorian
        if (year < 1918) { // Apply Julian Leap Year Logic
            if (year % 4 == 0) {
                noOfDays++; // if leap year add one day more
            }
        } else { // Apply Gregorian Leap year logic
            // Check if the given year is leap year
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                noOfDays++; // if leap year add one day more
            }
        }
        
        
        
        int day = 256 - noOfDays;
        
        return day + ".09." + year;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
