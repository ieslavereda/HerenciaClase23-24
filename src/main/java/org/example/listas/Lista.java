package org.example.listas;

public class Lista {

    private int size;
    private Nodo head;
    private Nodo tail;


    public Lista() {
        size = 0;
        head = null;
        tail = null;
    }

    public Nodo getHead() {
        return head;
    }

    public Nodo getTail() {
        return tail;
    }

    public Integer removeHead() {

        if (head == null) return null;

        int num = head.info;
        head = head.getNext();
        size--;

        if(head==null) tail=null;

        return num;

    }

    public Integer removeTail() {

        if(size==0 || head==null || tail == null) return null;
        if(size == 1 || head == tail ) return removeHead();

        Nodo j=head, i=head.next;

        while (i!=tail || i.next!=null){
            j=i;
            i=i.next;
        }

        j.next=null;
        tail = j;
        size--;

        return i.info;

    }

    public void addHead(int num) {

        Nodo nodo = new Nodo(num);

        if (size == 0) {
            tail = nodo;
        } else {
            nodo.setNext(head);

        }
        head = nodo;
        size++;

    }

    public void addTail(int num) {

        Nodo nodo = new Nodo(num);

        if (size == 0) {
            head = nodo;
        } else {
            tail.setNext(nodo);
        }

        tail = nodo;
        size++;
    }

    public boolean contains(int num){



    }

//    public int get(int index){
//
//    }
//
//    public int remove(int index){
//
//    }
//
//    public void addAll(int[] nums){
//
//    }
//
//    public int[] getAsArray(){
//
//    }
//
//    public void clear(){
//
//    }


    @Override
    public String toString() {

        Nodo n = head;
        String aux = "Size: " + size + "\nValues: ";

        while (n != null) {

            aux += n.getInfo() + " ";

            n = n.getNext();

        }

        return aux;

    }

    private class Nodo {
        private int info;
        private Nodo next;

        public Nodo(int info) {
            this.info = info;
            this.next = null;
        }

        public Nodo getNext() {
            return next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }

        public int getInfo() {
            return info;
        }

        @Override
        public String toString() {
            return  info+"" ;
        }
    }
}
