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
    public Lista(int[] nums) {

        this();
        addAll(nums);

    }

//    public Nodo getHead() {
//        return head;
//    }
//
//    public Nodo getTail() {
//        return tail;
//    }

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

        if(size==0) return false;

        boolean encontrado=false;
        Nodo aux = head;

        while (aux!=null && !encontrado){

            if(aux.info==num)
                encontrado=true;

            aux=aux.next;
        }

        return encontrado;
    }

    public Integer get(int index){

        if(index<0) return null;
        if(index>=size) return null;

        Nodo n = head;
        int i=0;

        while (i++<index)
            n=n.next;

        return n.info;

    }

    public Integer remove(int index){

        if(index<0) return null;
        if(index>=size) return null;
        if(index==0) return removeHead();
        if(index==size-1) return removeTail();

        Nodo j=head, i=head.next;
        int k=1;

        while (k++<index){
            j=i;
            i=i.next;
        }

        j.next=i.next;
        size--;

        return i.info;
    }

    public void addAll(int[] nums){

        for(int num : nums) addTail(num);

    }

    public int[] getAsArray(){

        int[] aux = new int[size];

        Nodo nodo = head;
        int i=0;

        while (nodo!=null) {
            aux[i++] = nodo.info;

            nodo=nodo.next;
        }

        return aux;
    }

    public void clear(){

        tail=null;
        head=null;
        size=0;

    }


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
