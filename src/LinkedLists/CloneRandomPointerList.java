package LinkedLists;

import java.util.HashMap;

/**
 * Created by anusha on 3/1/17.
 * Q. Clone a linkedlist where each node has 2 pointer: next and random.
 */

class RandomNode {

    String data;
    RandomNode next;
    RandomNode jump;

    public RandomNode(String data) {
        this.data = data;
        this.next = null;
        this.jump = null;
    }
}

public class CloneRandomPointerList {


    public static String jumpStringify(RandomNode head) {
        if (head == null) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            RandomNode current = head;
            while (current != null) {
                sb.append(current.jump.data);
                current = current.next;
            }
            return sb.toString();
        }
    }

    public static String nextStringify(RandomNode head) {
        if (head == null) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            RandomNode current = head;
            while (current != null) {
                sb.append(current.data);
                current = current.next;
            }
            return sb.toString();
        }
    }

    public static RandomNode cloneList(RandomNode head) {
        if (head == null) {
            return null;
        }
        HashMap<RandomNode, RandomNode> hm = new HashMap<>();
        RandomNode current = head;
        while(current != null) {
            RandomNode newNode = current;
            hm.put(current, newNode);
            current = current.next;
        }

        current = head;
        while(current != null) {
            RandomNode x = hm.get(current);
            x.next = hm.get(current.next);
            x.jump = hm.get(current.jump);
            current = current.next;
        }
        return hm.get(head);
    }

    public static void main(String[] args) {
        RandomNode a = new RandomNode("a");
        RandomNode b = new RandomNode("b");
        RandomNode c = new RandomNode("c");

        a.next = b;
        b.next = c;
        a.jump = c;
        b.jump = a;
        c.jump = b;

        RandomNode n = cloneList(a);

        System.out.println(nextStringify(a));
        System.out.println(jumpStringify(a));

        System.out.println(nextStringify(n));
        System.out.println(jumpStringify(n));


    }

}
