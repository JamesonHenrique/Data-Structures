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
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public void inOrder() {
        inOrder(root);
    }
    public void preOrder() {
        preOrder(root);
    }
    public void postOrder() {
        postOrder(root);
    }
    public boolean search(int data) {
        return search(root, data);
    }
    private boolean search(TreeNode root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;

        } else if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
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
        System.out.println(bst.search(2));
        bst.inOrder();

    }
}
