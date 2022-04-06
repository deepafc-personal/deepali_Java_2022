package practise;

public class Node {
    public Object next;
    int data;
    Node left , right;

    public Node(int item){
        data = item;
        left= right = null;
    }
}
class BinaryTree {

    Node root;
    public int max_depth(Node root){

        if (root==null)
            return 0;
        int left_depth = max_depth(root.left);
        int right_depth = max_depth(root.right);
        int bigger = Math.max(left_depth, right_depth);
        return bigger+1;
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(55);
        tree.root.left = new Node(21);
        tree.root.right = new Node(80);
        tree.root.left.right = new Node(9);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(12);
        tree.root.left.left = new Node(9);
        System.out.println("Max depth of the Binary tree is " + tree.max_depth(tree.root));
    }

}


