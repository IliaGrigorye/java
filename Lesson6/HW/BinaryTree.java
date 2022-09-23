package Lesson6.HW;

public class BinaryTree {

    static class Node {
        int data;
        Node left, right;
    };

    static String str;

    static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return (node);
    }

    static void treeToString(Node root) {
        if (root == null)
            return;

        str += (Character.valueOf((char) (root.data + '0')));

        if (root.left == null && root.right == null)
            return;

        str += ('(');
        treeToString(root.left);
        str += (')');

        if (root.right != null) {
            str += ('(');
            treeToString(root.right);
            str += (')');
        }
    }

    public static void main(String[] args) {

        Node root = newNode(1);
        root.left = newNode(3);
        root.right = newNode(9);
        root.left.left = newNode(7);
        root.left.right = newNode(6);
        root.right.right = newNode(2);
        str = "";
        treeToString(root);
        System.out.println(str);
    }
}
