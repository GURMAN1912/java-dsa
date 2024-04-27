import java.util.Stack;

public class Postorder {
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
    public void postOrder(TreeNode root){
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void postOrderIterative(TreeNode root){
        TreeNode current=root;
        Stack <TreeNode> stack =new Stack<>();
        while (!stack.isEmpty()||current!=null) {
            if(current!=null)
            {
                stack.push(current);
                current=current.left;
            }
            else{
                TreeNode temp=stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                    System.out.print(temp.data+" ");
                    while(!stack.isEmpty()&&temp==stack.peek().right){
                        temp=stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }
                else{
                    current=temp;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        Postorder tree=new Postorder();
        tree.createBinaryTree();
        tree.postOrder(tree.root);
        System.out.println();
        tree.postOrderIterative(tree.root);
    }
    
}
