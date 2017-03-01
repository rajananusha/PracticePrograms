package LinkedLists;

/**
 * Created by anusha on 2/28/17.
 * Q. Write a program to print the Kth to Last element in a linkedlist
 */
public class KthToLast {

    public static String getKthToLast(MyLinkedListNode head, int k){
        MyLinkedListNode pointer1 = head;
        MyLinkedListNode pointer2 = head;
        int count = 0;
        while(count < k-1){
            pointer2 = pointer2.getNext();
            count++;
        }
        while(pointer2.getNext() != null){
            pointer1 = pointer1.getNext();
            pointer2 = pointer2.getNext();
        }
        return pointer1.getData();
    }

    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode("1");
        myLinkedList.addNode("2");
        myLinkedList.addNode("3");
        myLinkedList.addNode("4");
        myLinkedList.addNode("5");
        myLinkedList.addNode("6");
        myLinkedList.addNode("7");
        myLinkedList.addNode("8");
        myLinkedList.addNode("9");

        System.out.println(getKthToLast(myLinkedList.getHead(), 3));
    }
}
