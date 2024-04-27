// import javax.swing.tree.TreeNode;

import java.util.Stack;

public class Inorder {
    private TreeNode root;
    private class TreeNode 
    {
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
    public void inorder( TreeNode root){
        if(root==null)
            return;
        inorder(root.left);        
        System.out.print(root.data+" ");
        inorder(root.right);        
    }
    public void inorderIterative(TreeNode root){
        if(root==null){
            return;
        }
        Stack <TreeNode> stack=new Stack<>();
        TreeNode temp=root;
        while(!stack.isEmpty()||temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else{
                temp=stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }
    public static void main(String[] args) {
        Inorder tree=new Inorder();
        tree.createBinaryTree();
        tree.inorder(tree.root);
        System.out.println();
        tree.inorderIterative(tree.root);
    }
    
}
