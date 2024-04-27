import java.util.Stack;

public class Preorder {
    private TreeNode root;
    private class  TreeNode {
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
    public void preOrderIterative(TreeNode root){
        if(root==null){
            return;
        }
        Stack <TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Preorder tree=new Preorder();
        tree.createBinaryTree();
        tree.preOrder(tree.root);
        System.out.println();
        tree.preOrderIterative(tree.root);
        
    }
}
