package practise;

import javax.lang.model.element.NestingKind;
import java.util.LinkedList;

public class ReverseLinkedList {
    Node head;
    private int size;
    void LL(){
        size =0;
    }
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList(){
        Node curreNode = head;
        while (curreNode!= null){
            System.out.println(curreNode.data + " ->");
            curreNode = curreNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if (head == null){
            System.out.println("Empty list nothing to deleted");
            return;
        }
        head = this.head.next;
        size--;

    }
    public void removeLast(){
        if (head == null){
            System.out.println("Empty list nothing to deleted");
            return;
        }
        size--;
        if (head.next == null){
            head= null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;

    }
    public int getSize(){
        return size;
    }
    public void addMiddle(int index, String data){
        if (index >size || index <0){
            System.out.println("Invalid Index value");
            return;
        }
        size++;

        Node newNode = new Node(data);
        if (head == null || index ==0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for (int i = 1; i< size; i++){
            if (i == index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = newNode;
                break;
            }
            currNode = currNode.next;
        }


    }
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.addFirst("this");
        list.addLast("Last");
        list.add(3, "Linked");
        System.out.println("Original List " + list);
        System.out.println("Element at 0 " + list.get(0));
        System.out.println("List Size " + list.size());

        ReverseLinkedList lis2 = new ReverseLinkedList();
        lis2.addFirst("this");


    }
}
