package ex3;

import java.util.ArrayList;
import java.util.List;

public class Multi_ArrayList<T> {
    public List<T> lista_criada;

    public Multi_ArrayList() {
        this.lista_criada = new ArrayList<>();
    }

    public void add(T element) {
    	lista_criada.add(element);
    }

    public boolean equals(Multi_ArrayList<T> lista) {
        return lista_criada.equals(lista.lista_criada);
    }

    public void addAll(Multi_ArrayList<T> lista) {
        lista_criada.addAll(lista.lista_criada);
    }
}