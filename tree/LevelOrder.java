import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    private TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data=data;
        }
    }
    public void createBinaryTree(){
        TreeNode first=new TreeNode(9);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(4);
        TreeNode forth=new TreeNode(3);
        first.left=second;
        first.right=forth;
        second.left=third;
        root=first;
    }
    public void levelOrder(TreeNode root){
        if(root==null){
            return;
        }        
    
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
       
    }
    public static void main(String[] args) {
        LevelOrder bt=new LevelOrder();
        bt.createBinaryTree();
        bt.levelOrder(bt.root);
    }
    
}
