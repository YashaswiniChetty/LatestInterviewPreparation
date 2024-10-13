package Trees;

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&& q==null){
            return true;
        }

      /*  if(p!=null && q!=null){
            if(p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right,q.right)){
                return true;
            }
        }
        return false;*/
      if((p==null && q!=null)||( p!=null && q==null )){
          return false;

      }
      if(p.val!=q.val){
          return false;
      }
      return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);



    }
}
