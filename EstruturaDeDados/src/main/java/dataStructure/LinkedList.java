package dataStructure;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        String data;
        Node next;

        Node(String Data){
            this.data = data;
        }
    }

    public LinkedList(String data){
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead(){
        if (this.head == null){
            System.out.println("Lista vazia");
        } else {
            System.out.println("Head: " + head.data);
        }
    }

    public void getTail(){
        if (this.tail == null){
            System.out.println("Lista vazia");
        } else {
            System.out.println("tail: " + tail.data);
        }
    }

    public void getLength(){
        System.out.println("Length: " + this.length);
    }

    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList("Elemento 1");
        list.getHead();
        list.getTail();
        list.getLength();
    }
}
