package LinkedLists;

import java.util.HashSet;

/**
 * Created by anusha on 2/8/17.
 * Write Code to remove duplicates from an unsorted linked list.
 *
 */
public class RemoveDupes {

    public static MyLinkedList deDupe(MyLinkedListNode head){

        MyLinkedList output = new MyLinkedList();
        HashSet<String> hs = new HashSet<>();

        MyLinkedListNode current = head;
        while(current!=null){
            String str = current.getData();
            if(hs.contains(str)){
                //do nothing
            } else {
                hs.add(str);
                output.addNode(str);
            }
            current = current.getNext();

        }
        return output;
    }

    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode("F");
        myLinkedList.addNode("O");
        myLinkedList.addNode("L");
        myLinkedList.addNode("L");
        myLinkedList.addNode("O");
        myLinkedList.addNode("W");

        System.out.println(myLinkedList.stringify());
        MyLinkedList output = deDupe(myLinkedList.getHead());
        System.out.println(output.stringify());
    }

}
