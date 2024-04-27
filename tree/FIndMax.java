public class FIndMax {
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
        TreeNode first=new TreeNode(3);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(5);
        TreeNode forth=new TreeNode(3);
        first.left=second;
        first.right=forth;
        second.left=third;
        root=first;
    }
    public int findMax(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result= root.data;
        int left=findMax(root.left);
        int right=findMax(root.right);
        if(left>result){
            result=left;
        }
        if (right>result) {
            result=right;            
        }
        return result;
    }
    public static void main(String[] args) {
        FIndMax bt=new FIndMax();
        bt.createBinaryTree();
        System.out.println(bt.findMax(bt.root));
    }
}
