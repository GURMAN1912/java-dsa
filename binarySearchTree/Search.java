public class Search {
    private TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data=data;
        }
    }
    public void insert(int value){
        insert(root,value);
    }
    public TreeNode insert(TreeNode root,int value){
        if(root==null){
            root=new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root.left=insert(root.left,value);
        }
        else{
            root.right=insert(root.right,value);
        }
        return root;
    }
    public TreeNode search(int key){
        return search(root,key);
    }
    public TreeNode search(TreeNode root,int key){
        if(root==null||root.data==key){
            return root;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }
    public void inorder(){
        inorder(root);
    }
    public void inorder( TreeNode root){
        if(root==null)
            return;
        inorder(root.left);        
        System.out.print(root.data+" ");
        inorder(root.right);        
    }
    
    public static void main(String[] args) {
        Search bst=new Search();
        bst.root=bst.insert(bst.root,6);
        bst.root=bst.insert(bst.root,4);
        bst.root=bst.insert(bst.root,2);
        bst.root=bst.insert(bst.root,5);
        bst.root=bst.insert(bst.root,8);
        bst.root=bst.insert(bst.root,7);
        bst.root=bst.insert(bst.root,9);
        bst.inorder(bst.root);
        System.out.println();
        System.out.println(bst.search(bst.root,5).data);
    }
    
}
