import java.util.*;

public class addBinary {
    public static void main(String[] args) {

        // What is the additions to binary number (rules)
        // 0 + 1 = 1
        // 1 + 0 = 1
        // 1 + 1 = 0 (technically 10 but the 1 gets carried over)
        // 0 + 0 = 0

        // Three base cases if a is null, if b is null, and if both is null
        // Best case scenario one of the three base cases gets triggered
        // Average case scenario we would have to do additon on both a and b with
        // minimal carrys
        // Worst case scenario each iteration has a carry

        addingProcess("111", "101");

    }

    public static void addingProcess(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i) - '0';
            if (j >= 0)
                sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        if (carry != 0) {
            sb.append(carry);
        }
        System.out.println(sb.reverse().toString());
    }
}