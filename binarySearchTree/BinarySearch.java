public class BinarySearch {
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
    public void inorder( TreeNode root){
        if(root==null)
            return;
        inorder(root.left);        
        System.out.print(root.data+" ");
        inorder(root.right);        
    }
    public static void main(String[] args) {
        BinarySearch bst=new BinarySearch();
        bst.root=bst.insert(null, 5);
        bst.root=bst.insert(bst.root, 3);
        bst.root=bst.insert(bst.root, 7);
        bst.root=bst.insert(bst.root, 4);
        bst.root=bst.insert(bst.root, 8);
        bst.inorder(bst.root);
    }


}
