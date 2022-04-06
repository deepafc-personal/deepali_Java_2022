//package practise;
//
//
//public class LinkedList {
//    static Node head;
//    static class Node{
//        int data;
//        int next_node;
//
//        Node(int d){
//            data = d;
//            next_node = Integer.parseInt(null);
//        }
//    }
//
//    Node reverse(Node node){
//        Node prev_node = null;
//        Node curre_node = node;
//        Node next_node = null;
//        while (curre_node != null){
//            next_node = curre_node.next_node;
//            curre_node.next_node = prev_node;
//            prev_node = curre_node;
//            curre_node = next_node;
//        }
//        node = prev_node;
//        return node;
//    }
//    void printList(Node node){
//        while (node != null){
//            System.out.print(node.data + " ");
//            node = node.next_node;
//        }
//    }
//
//    public static void main(String[] args){
//        LinkedList list = new LinkedList();
//        list.head = new Node(20);
//        list.head.next_node = new Node(40);
//        list.head.next_node.next_node = new Node(60);
//        list.head.next_node.next_node.next_node = new Node(80);
//
//        System.out.println("Origial Linked List ");
//        list.printList(head);
//        head = list.reverse(head);
//        System.out.println(" ");
//        System.out.println(" Reverse Linked List");
//        list.printList(head);
//    }
//
//}
