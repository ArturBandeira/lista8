package ex3;

import java.util.LinkedList;

public class Multi_LinkedList<T>{
    public LinkedList<T> itens;

    public Multi_LinkedList() {
    	itens = new LinkedList<>();
    }

    public void add(T element) {
    	itens.add(element);
    }

    public boolean equals(Multi_LinkedList<T> ll) {
        return itens.equals(ll.itens);
    }

    public void addAll(Multi_LinkedList<T> ll) {
    	itens.addAll(ll.itens);
    }
}