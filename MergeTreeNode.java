// Q. given 2 trees, merge them in ascending order
// https://onlinegdb.com/fG_bK1QCA8

import java.util.*;

class MergeTreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for the first tree (comma-separated):"); // FIRST TREE
        String[] values1 = scanner.nextLine().split(",");

        TreeNode root1 = buildBST(values1);

        System.out.println("Enter values for the second tree (comma-separated):"); // SECOND TREE
        String[] values2 = scanner.nextLine().split(",");

        TreeNode root2 = buildBST(values2);

        List<Integer> mergedList = mergeTrees(root1, root2); // MERGE THE TREE

        System.out.println("Merged and sorted list of values:");
        for (int value : mergedList) {
            System.out.print(value + " ");
        }
    }

    private static TreeNode buildBST(String[] values) {
        TreeNode root = null;

        for (String value : values) { // WHAT THIS FOR LOOP WILL DO.. 
            int num = Integer.parseInt(value);
            root = insertIntoBST(root, num);
        }

        return root;
    }

    private static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val); // BST CREATION 
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val); // LEFT NODE -> WITH LESS VALUE 
        } else {
            root.right = insertIntoBST(root.right, val); // RIGHT NODE WILL HAVE THE GREATER VALUE
        }

        return root;
    }

    private static List<Integer> mergeTrees(TreeNode root1, TreeNode root2) {
        List<Integer> mergedList = new ArrayList<>(); // ARRAY LIST IS CREATED FOR 2 TREE

        inorderTraversal(root1, mergedList);
        inorderTraversal(root2, mergedList);

        Collections.sort(mergedList); // SORT FUNCTION 

        return mergedList; // SORTED TREE
    }

    private static void inorderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return; // INORDER TRAVERSAL -> LEFT ->ROOT -> RIGHT 
        }

        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);
    }
}
