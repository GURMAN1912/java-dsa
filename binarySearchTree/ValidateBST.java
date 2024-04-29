public class ValidateBST {
    private TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data=data;
        }
    }
    public TreeNode insert(TreeNode root,int value){
        if(root==null)
        {

            root=new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root.left=insert(root.left, value);
        }
        else{
            root.right=insert(root.right,value);
        }
        return root;
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
    public Boolean isValid(TreeNode root,long max,long min){
        if(root==null){
            return true;
        }
        if(root.data<=min||root.data>=max){
            return false;
        }
        boolean left=isValid(root.left, root.data, min);
        if(left){
            boolean right=isValid(root.right, max, root.data);
            return right;
        }
        return false;
    }
    public static void main(String[] args) {
        ValidateBST bst=new ValidateBST();
        bst.createBinaryTree();
        
        System.out.println(bst.isValid(bst.root,Integer.MAX_VALUE,Integer.MIN_VALUE));
    }
}
