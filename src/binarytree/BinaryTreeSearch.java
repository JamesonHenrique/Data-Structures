package binarytree;

public class BinaryTreeSearch {
    TreeNode root;

    public class TreeNode {
        int data;
        TreeNode left;
       TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
    public void insert(int data) {
        root = insert(root, data);
    }
    public TreeNode insert( TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public void inOrder(TreeNode left, TreeNode right) {
        if (left == null) {
            return;
        }
        inOrder(left.left, right);
        System.out.print(left.data + " ");
        inOrder(left.right, right);
    }
    public void inOrder() {
        inOrder(root, root);
    }
    public void preOrder(TreeNode left, TreeNode right) {
        if (left == null) {
            return;
        }
        System.out.print(left.data + " ");
        preOrder(left.left, right);
        preOrder(left.right, right);
    }
    public void preOrder() {
        preOrder(root, root);
    }
    public void postOrder(TreeNode left, TreeNode right) {
        if (left == null) {
            return;
        }
        postOrder(left.left, right);
        postOrder(left.right, right);
        System.out.print(left.data + " ");
    }
    public void postOrder() {
        postOrder(root, root);
    }
    public void display() {
        display(root, 0);
    }

    private void display(TreeNode root, int i) {
        if (root == null) {
            return;
        }
        display(root.right, i + 1);
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        System.out.println(root.data);
        display(root.left, i + 1);
    }

    public static void main(String[] args) {
        BinaryTreeSearch bst = new BinaryTreeSearch();
        bst.insert(10);
        bst.insert(6);
        bst.insert(14);
        bst.insert(5);
        bst.insert(8);
        bst.insert(11);
        bst.insert(18);
        bst.display();
    }
}
