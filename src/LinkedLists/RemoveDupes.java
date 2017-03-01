package LinkedLists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by anusha on 2/8/17.
 * Write Code to remove duplicates from an unsorted linked list.
 *
 */
public class RemoveDupes {

    public static MyLinkedListNode deDupe(MyLinkedListNode head){

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
        return output.getHead();
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
        myLinkedList.addNode("F");
        myLinkedList.addNode("O");
        myLinkedList.addNode("L");
        myLinkedList.addNode("L");
        myLinkedList.addNode("O");
        myLinkedList.addNode("W");

        System.out.println(stringify(myLinkedList.getHead()));
        MyLinkedListNode output = deDupe(myLinkedList.getHead());
        System.out.println(stringify(output));
    }

}
