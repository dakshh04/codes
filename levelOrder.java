import java.util.Queue;

// level order traversal of a binary tree
public class levelOrder {
    public static void levelOrdertraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Node curr = q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data + " ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
}
