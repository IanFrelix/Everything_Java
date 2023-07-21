import java.util.*;

public class climbingStairs {
    public static void main(String[] args) {
        // Notes
        // Looking at the problem and figuring a pattern for it,
        // you can stumble across the fact that this follows the fibonacci sequence.
        // The Fibonacci Sequence is when two previous numbers makes up the next number.

        // *Dynamic approach*
        // Depending on the number given, this will determine how many numbers
        // are in your fibonacci sequence
        // Best case scenario, Time complexity will be O(1) as you only go up one step
        // Average case scenario, Time complexity will be O(n) as you have more than one
        // step to go up
        // Worst case scenario, O(n), but the amount of steps is too large to determine
        // the combination
        // WARNING: This approach might take a while to calculate while handling large
        // numbers (runtime will be long)
        // This is a hybrid of two approaches as technically the fibonacci sequence
        // start with 1, 1, 2, 3, ...
        // The pure fibonacci approach does not use any array or arrayList, just
        // variables (space complexity is
        // lower).

        Scanner getNumberOfSteps = new Scanner(System.in);
        System.out.println("Please provide the number of steps.");
        int n = getNumberOfSteps.nextInt();
        ArrayList<Integer> fibonacciSequence = new ArrayList<Integer>();
        int i = 3;
        fibonacciSequence.add(1);
        fibonacciSequence.add(2);
        fibonacciSequence.add(3);

        if (3 == n) {
            System.out.println(i);
        }

        if (2 == n) {
            System.out.println(i - 1);
        }

        if (1 == n) {
            System.out.println(i - 2);
        }

        // Usually will only use a while loop if you don't know when to stop, i.e.
        // youare not given an n
        while (i != n) {
            fibonacciSequence.add(fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2));
            ++i;
        }

        System.out.println("Dynamic Approach (Mixture of a fibonacci approach): " + fibonacciSequence.get(i - 1));

        // *Optimal Approach (less usage of memory)*
        // A pure fibonacci sequence that doesn't use data structures

        if (1 == n) {
            System.out.println("1");
        }

        if (2 == n) {
            System.out.println(2);
        }

        int current = 0;
        int prev1 = 2;
        int prev2 = 1;

        for (int j = 3; j <= n; ++j) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        System.out.println("Optimal Approach (Pure fibonnacci Sequence): " + current);
    }
}
