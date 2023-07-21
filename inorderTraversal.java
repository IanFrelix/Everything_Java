import java.util.*;

public class inorderTraversal {
    public static void main(String[] args) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output_arr = new ArrayList<>();

        if (root == null) {
            System.out.println(output_arr);
        }

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            output_arr.add(current.val);
            current = current.right;
        }
        System.out.println(output_arr);
    }
}
