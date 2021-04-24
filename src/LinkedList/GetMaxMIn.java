package LinkedList;

public class GetMaxMIn {

    static CreatLinkedList creatLinkedList = new CreatLinkedList();

    public static void main(String[] args){
            Node root = null;

            root = creatLinkedList.insert(233, root);
            root = creatLinkedList.insert(128, root);
            root = creatLinkedList.insert(455, root);
            root = creatLinkedList.insert(9, root);
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            Node current = root;
            while(current!= null){
                if(current.i < min){
                    min = current.i;
                }

                if(current.i > max){
                    max = current.i;
                }
                current = current.nxt;
            }

            System.out.println("Min"+ min + "----"+ "Max" + max);
        }

    }




