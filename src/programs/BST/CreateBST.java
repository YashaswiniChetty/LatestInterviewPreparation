package programs.BST;

public class CreateBST {

    TreeNode root=null;

    public static void main(String[] args) {

        int[] arr={9,10,8,5,13,4,2,17,12,7,3};
        CreateBST createBST=new CreateBST();
        createBST.createBST(arr);
        inorderBST(createBST.root); //left root right
        System.out.println();
        preOrder(createBST.root); //root left right
        System.out.println();
        postOrder(createBST.root); //left right root
        System.out.println();
        System.out.println("count:=" +createBST.countNodes(createBST.root));
    }

    private static void inorderBST(TreeNode root) {
        if(root==null)
            return;
        inorderBST(root.left);
        System.out.print(root.val+" ");
        inorderBST(root.right);
    }

    private int countNodes(TreeNode root){
        if(root==null)
            return 0;
        return 1+countNodes(root.left) +countNodes(root.right);
    }

    private static void preOrder(TreeNode root) {
        if(root==null)
            return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void postOrder(TreeNode root) {
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    private  void createBST(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            insertNode(arr[i]);
        }
    }

    private void insertNode(int val){
        if(this.root==null){
            this.root=new TreeNode(val);
            return;
        }
        TreeNode ptr=this.root;
        TreeNode tail=null;

        while (ptr!=null){
            if(val< ptr.val){
                //I have to go left
                tail=ptr;
                ptr=ptr.left;
            }
            else{
                tail=ptr;
                ptr=ptr.right;
            }
        }

        if(tail!=null){
            TreeNode t=new TreeNode(val);
            if(t.val<tail.val)
                tail.left=t;
            else
                tail.right=t;
        }
    }
}
