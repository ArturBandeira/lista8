package ex4;

import java.util.*;

public class MultiToSet<T> implements Set<T> {
    public final Collection<T> colecao;

    public MultiToSet(Collection<T> colecao) {
        this.colecao = colecao;
    }
    private Set<T> ViraSet() {
        return new HashSet<>(colecao);
    }
    @Override
    public int size() {
        return ViraSet().size();
    }
    @Override
    public boolean isEmpty() {
        return ViraSet().isEmpty();
    }
    @Override
    public boolean contains(Object o) {
        return ViraSet().contains(o);
    }
    @Override
    public Iterator<T> iterator() {
        return ViraSet().iterator();
    }
    @Override
    public Object[] toArray() {
        return ViraSet().toArray();
    }
    @Override
    public <X> X[] toArray(X[] a) {
        return ViraSet().toArray(a);
    }
    @Override
    public boolean add(T t) {
        if (!contains(t)) {
            colecao.add(t);
            return true;
        }
        return false;
    }
    @Override
    public boolean remove(Object a) {
        return colecao.remove(a);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return ViraSet().containsAll(c);
    }
    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean modified = false;
        for (T element : c) {
            if (add(element)) {
                modified = true;
            }
        }
        return modified;
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        return colecao.retainAll(c);
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        return colecao.removeAll(c);
    }
    @Override
    public void clear() {
        colecao.clear();
    }
    @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        MultiToSet<?> copia_a = (MultiToSet<?>) a;
        return ViraSet().equals(copia_a.ViraSet());
    }
}