package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    TreeNode root;

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}
    public BinaryTree() {
        root = null;
    }

    public void createSampleTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public void interativePreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }

    }
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
;
    }
    public void interativeInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }

    }
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }
    public void interativePostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }

    }
    public void levelOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }
    public void maximumValue() {
        if (root == null) {
            return;
        }
       Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.data > max) {
                max = temp.data;
            }
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
        System.out.println("Maximum value in the tree is: " + max);
    }
    public int recursiveMaximumValue(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
int result = root.data;
int left = recursiveMaximumValue(root.left);
int right = recursiveMaximumValue(root.right);
if (left > result) {
    result = left;

}
if (right > result) {
    result = right;
}
return result;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createSampleTree();
        binaryTree.preOrder(binaryTree.root);
        System.out.println("");
        binaryTree.interativePreOrder(binaryTree.root);
        System.out.println("");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("");
        binaryTree.interativeInOrder(binaryTree.root);
        System.out.println("");
        binaryTree.postOrder(binaryTree.root);
        System.out.println("");
        binaryTree.interativePostOrder(binaryTree.root);
        System.out.println("");
        binaryTree.levelOrder(binaryTree.root);
        System.out.println("");
        binaryTree.maximumValue();

        System.out.println(binaryTree.recursiveMaximumValue(binaryTree.root));

    }
}
