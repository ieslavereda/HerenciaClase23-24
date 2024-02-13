package org.example.ficheros.ejercicio1;

import java.io.*;
import java.lang.reflect.Array;

public class ListaSE<E> implements Serializable {

    private int size;
    private Nodo<E> head;
    private Nodo<E> tail;


    public ListaSE() {
        size = 0;
        head = null;
        tail = null;
    }
    public ListaSE(E[] nums) {

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

    public E removeHead() {

        if (head == null) return null;

        E num = head.info;
        head = head.getNext();
        size--;

        if(head==null) tail=null;

        return num;

    }

    public E removeTail() {

        if(size==0 || head==null || tail == null) return null;
        if(size == 1 || head == tail ) return removeHead();

        Nodo<E> j=head, i=head.next;

        while (i!=tail || i.next!=null){
            j=i;
            i=i.next;
        }

        j.next=null;
        tail = j;
        size--;

        return i.info;

    }

    public void addHead(E num) {

        Nodo<E> nodo = new Nodo<>(num);

        if (size == 0) {
            tail = nodo;
        } else {
            nodo.setNext(head);

        }
        head = nodo;
        size++;

    }

    public void addTail(E num) {

        Nodo<E> nodo = new Nodo<>(num);

        if (size == 0) {
            head = nodo;
        } else {
            tail.setNext(nodo);
        }

        tail = nodo;
        size++;
    }

    public boolean contains(E num){

        if(size==0) return false;

        boolean encontrado=false;
        Nodo aux = head;

        while (aux!=null && !encontrado){

            if(aux.info.equals(num))
                encontrado=true;

            aux=aux.next;
        }

        return encontrado;
    }

    public E get(int index){

        if(index<0) return null;
        if(index>=size) return null;

        Nodo<E> n = head;
        int i=0;

        while (i++<index)
            n=n.next;

        return n.info;

    }

    public E remove(int index){

        if(index<0) return null;
        if(index>=size) return null;
        if(index==0) return removeHead();
        if(index==size-1) return removeTail();

        Nodo<E> j=head, i=head.next;
        int k=1;

        while (k++<index){
            j=i;
            i=i.next;
        }

        j.next=i.next;
        size--;

        return i.info;
    }

    public void addAll(E[] nums){

        for(E num : nums) addTail(num);

    }

    public E[] getAsArray(Class clazz){


        E[] aux = (E[]) Array.newInstance(clazz, size);

        Nodo<E> nodo = head;
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

    public void guardar(String filename){


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){

//            oos.writeObject(this);

            oos.writeInt(size);
            oos.writeObject(head);
            oos.writeObject(tail);

        } catch (Exception e){
            e.printStackTrace();
        }


    }

    public void cargar(String filename){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){

//            ListaSE lista = (ListaSE) ois.readObject();
//            this.size = lista.size;
//            this.head = lista.head;
//            this.tail = lista.tail;

            this.size = ois.readInt();
            this.head = (Nodo)ois.readObject();
            this.tail = (Nodo)ois.readObject();

        } catch (Exception e){
            e.printStackTrace();
        }
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

    private class Nodo<E> implements Serializable {

        private E info;
        private Nodo next;

        public Nodo(E info) {
            this.info = info;
            this.next = null;
        }

        public Nodo<E> getNext() {
            return next;
        }

        public void setNext(Nodo<E> next) {
            this.next = next;
        }

        public E getInfo() {
            return info;
        }

        @Override
        public String toString() {
            return  info+"" ;
        }
    }
}
