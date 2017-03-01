package LinkedLists;

/**
 * Created by anusha on 2/8/17.
 */
class MyLinkedListNode {

    String data;
    MyLinkedListNode next;

    public MyLinkedListNode(String data) {
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }
}

public class MyLinkedList {

    MyLinkedListNode head = null;

    public MyLinkedListNode getHead() {
        return head;
    }

    public void addNode(String data){
        if(head == null) {
            head = new MyLinkedListNode(data);
        } else {
            MyLinkedListNode newNode = new MyLinkedListNode(data);
            MyLinkedListNode current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void addNode(MyLinkedListNode node){
        if(head == null) {
            head = node;
        } else {
            MyLinkedListNode newNode = node;
            MyLinkedListNode current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

}
