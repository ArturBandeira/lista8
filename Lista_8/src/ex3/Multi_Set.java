package ex3;

import java.util.HashSet;
import java.util.Set;

public class Multi_Set<T>{
	public Set<T> itens;
	public Multi_Set(){
		this.itens = new HashSet<>();
	}
	public void add (T element) {
		itens.add(element);
	}
	public boolean equals (Multi_Set<T> ms) {
		return itens.equals(ms.itens);
	}
	public void addAll(Multi_Set<T> ms) {
        this.itens.addAll(ms.itens);
    }
}