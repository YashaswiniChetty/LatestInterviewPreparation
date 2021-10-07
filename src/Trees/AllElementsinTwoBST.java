package Trees;

import java.util.ArrayList;
import java.util.List;

public class AllElementsinTwoBST {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        inorder(root1, list1);
        inorder(root1, list2);
        return mergeList(list1, list2);

    }

    private void inorder(TreeNode node, List<Integer> list){
        if(node==null){
            return;
        }
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right, list);
    }

    private List<Integer> mergeList(List<Integer> list1, List<Integer> list2){
        int i=0,j=0;
        List<Integer> finalList= new ArrayList<>();
        while(i<list1.size()&& j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                finalList.add(list1.get(i++));
            }else{
                finalList.add(list2.get(j++));
            }
        }
        while(i<list1.size())
            finalList.add(list1.get(i));
        while(j<list2.size())
            finalList.add(list2.get(j));

        return finalList;
    }
}
