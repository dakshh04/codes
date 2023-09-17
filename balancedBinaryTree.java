public class balancedBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    static int isBalanced(Node root){
        if(root==null){
            return -1;
        }
        int lh = isBalanced(root.left);
        if(lh == -1) return -1;

        int rh = isBalanced(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh - rh) > 1) return -1;
        else return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 3, -1, -1, 5, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node  root = tree.buildTree(nodes);
        System.out.println(isBalanced(root));
    }
}
