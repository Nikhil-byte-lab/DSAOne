// Definition for a binary tree node.
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Mirror {
    // Function to convert the binary tree into its mirror.
    void mirror(Node root) {
        if (root == null) {
            return; // Base case: if the node is null, do nothing
        }

        // Recursively mirror the left and right subtrees
        mirror(root.left);
        mirror(root.right);

        // Swap the left and right children
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
