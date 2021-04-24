package LinkedList;

public class SerachNode {
    static CreatLinkedList creatLinkedList = new CreatLinkedList();
    public static void main(String[] args) {
        Node root = null;

        root = creatLinkedList.insert(233, root);
        root = creatLinkedList.insert(128, root);
        root = creatLinkedList.insert(8, root);
        root = creatLinkedList.insert(9, root);
        boolean exist = isNodeExist(128, root);
        System.out.println(exist);
    }

    public static boolean isNodeExist(int val, Node head){
       /* boolean isExist = false;
        if(head == null)
            return isExist;

        if(head.nxt == null && head.i == val){
            isExist = true;
        }else{
            while(head!=null){
                if(head.i == val){
                    isExist = true;
                }
                head = head.nxt;
            }
            return isExist ;
        }
        return isExist ;*/
        if(head == null)
            return false;

        if(head.nxt == null && head.i == val){
            return true;
        }else{
            while(head!=null){
                if(head.i == val){
                    return true;
                }
                head = head.nxt;
            }
            return false ;
        }
    }
}
