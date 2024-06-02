

public class Dictionary {
    private boolean[] exist;
    private int[] data;
    private int count;
    private int size;

    public Dictionary(int size) {
        this.size = size;
        this.exist = new boolean[size + 1];
        this.data = new int[size + 1];
        this.count = 0;
    }

    public void insert(int x) {
        if (x < 1 || x > size) {
            throw new IllegalArgumentException("Element out of bounds");
        }
        if (!exist[x]) {
            exist[x] = true;
            data[count] = x;
            count++;
        }
    }

    public void delete(int x) {
      
        if (exist[x]) {
            exist[x] = false;
            for (int i = 0; i < count; i++) {
                if (data[i] == x) {
                    data[i] = data[count - 1];
                    count--;
                    break;
                }
            }
        }
    }

    public boolean search(int x) {
        return exist[x];
    }

    public static void main(String[] args) {
        Dictionary dict = new Dictionary(10);
        dict.insert(3);
        dict.insert(5);
        dict.insert(7);
        System.out.println(dict.search(3)); 
        System.out.println(dict.search(4)); 
        dict.delete(5);
        System.out.println(dict.search(5));
    }
}


import java.util.Stack;

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

public class BinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<HashMap<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>(root, 1));
        int maxDepth = 0;

        while (!stack.isEmpty()) {
            HashMap<TreeNode, Integer> current = stack.pop();
            TreeNode node = current.getKey();
            int depth = current.getValue();

            if (node != null) {
                maxDepth = Math.max(maxDepth, depth);
                stack.push(new HashMap<>(node.left, depth + 1));
                stack.push(new HashMap<>(node.right, depth + 1));
            }
        }

        return maxDepth;
    }
}
