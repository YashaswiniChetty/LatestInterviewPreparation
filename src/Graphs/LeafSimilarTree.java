package Graphs;

public class LeafSimilarTree {
   /* public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        getLeafNode(root1, list1);
        getLeafNode(root2, list2);
        if(list1.size()!=list2.size()){
            return false;
        }
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)!=list2.get(i)){
                return false;
            }

        }
        return true;
    }

    private  void getLeafNode(TreeNode node, List list){
        if(node==null){
            return;
        }
        if(node.left==null&& node.right==null){
            list.add(node.val);
            return;
        }
        getLeafNode(node.left, list);
        getLeafNode(node.right, list);
    }*/
}
