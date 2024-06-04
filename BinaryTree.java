import java.util.HashMap;
import java.util.Stack;

public class BinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        HashMap<TreeNode, Integer> profondeur = new HashMap<>();
        stack.push(root);
        profondeur.put(root, 1);
        int maxDepth = 0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int currentDepth = profondeur.get(node);
            maxDepth = Math.max(maxDepth, currentDepth);

            if (node.left != null) {
                stack.push(node.left);
                profondeur.put(node.left, currentDepth + 1);
            }
            if (node.right != null) {
                stack.push(node.right);
                profondeur.put(node.right, currentDepth + 1);
            }
        }

        return maxDepth;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
