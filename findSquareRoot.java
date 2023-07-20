import java.util.*;

public class findSquareRoot {
    public static void main(String[] args) {
        // Getting the square root of a given number
        // You cannot use built in methods and functions to get the square root such as
        // pow(x, 0.5)

        // *Brute force approach*
        // iterate a variable from 0 all the way to the potential sqrt(x)
        // In the case that x cannot be squared as a whole number,
        // Create a condition that checks if the variable times itself is greater than x
        // Then subtract by 1
        // Runtime is of O(n)
        // Best case scenario, x is 0
        // Average case scenario, you will find the number that is equal to x when
        // squared
        // Worst case scenario, you will find a number that is not equal to x when
        // squared
        // WARNING: This approach is not optimal if given test cases where x is a large
        // number

        // Code below is the brute force approach manage to pass only 15 test cases out
        // of 1017

        int i = 0;
        Scanner getInteger = new Scanner(System.in);
        System.out.println("Please provide an integer to be square rooted.");
        int userInteger = getInteger.nextInt();

        while (i * i != userInteger && i * i < userInteger) {
            ++i;
            System.out.println(i);
        }

        if (i * i == userInteger) {
            System.out.println(i);
        }

        if (i * i > userInteger) {
            System.out.println(--i + " We did a minus 1 on it.");

        }

        // *Optimal Approach*
        // Use a binary search that finds the square root of x
        // Depending on the middle term number determines if the number is the right
        // number,
        // need to search in the lower half of the list or upper half of the list.
        // Best case scenario, the first number searched is the square root of x
        // Average case scenario, same as the best case scenario in terms of time
        // complexity
        // Worst case scenario, the last possible number to search for is the square
        // root of x
        // Time complexity is O(logn)

        int r = x;
        int res = 0;
        int l = 1;

        while (l <= r) {
            int m = l + ((r - l) / 2);

            if (m <= x / m) {
                l = m + 1;
                res = m;
            } else {
                r = m - 1;
            }

        }
    }
}
