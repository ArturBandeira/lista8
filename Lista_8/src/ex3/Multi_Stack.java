package ex3;

import java.util.Stack;

public class Multi_Stack<T>{
    public Stack<T> itens;

    public Multi_Stack() {
        itens= new Stack<>();
    }

    public void add(T element) {
        itens.push(element);
    }

    public boolean equals(Multi_Stack<T> ms) {
        return itens.equals(ms.itens);
    }

    public void addAll(Multi_Stack<T> ms) {
        itens.addAll(ms.itens);
    }

}