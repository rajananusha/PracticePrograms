package LinkedLists;

/**
 * Created by anusha on 3/1/17.
 * Q. Delete a node from a linkedlist when given access only to that node.
 */
public class DeleteNode {

    public static void deleteNode(MyLinkedListNode node){
        MyLinkedListNode current = node;
        current.setData(current.next.data);
        current.next = current.next.next;
    }

    public static String stringify(MyLinkedListNode head){
        if(head == null) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            MyLinkedListNode current = head;
            while(current!=null){
                sb.append(current.getData());
                current = current.getNext();
            }
            return sb.toString();
        }
    }

    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode("1");
        myLinkedList.addNode("2");
        myLinkedList.addNode("3");

        MyLinkedListNode node = new MyLinkedListNode("4");
        myLinkedList.addNode(node);

        myLinkedList.addNode("5");
        myLinkedList.addNode("6");
        myLinkedList.addNode("7");
        myLinkedList.addNode("8");
        myLinkedList.addNode("9");


        System.out.println(stringify(myLinkedList.getHead()));

        deleteNode(node);

        System.out.println(stringify(myLinkedList.getHead()));
    }

}
