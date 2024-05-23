package ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_multiconjuntos {
	 @Test
	    public void testMulti_ArrayListAdd() {
	        Multi_ArrayList<Integer> ma = new Multi_ArrayList<>();
	        ma.add(1);
	        assertTrue(ma.lista_criada.contains(1));
	    }
	    @Test
	    public void testMulti_ArrayListEquals() {
	    	Multi_ArrayList<Integer> ma1 = new Multi_ArrayList<>();
	    	Multi_ArrayList<Integer> ma2 = new Multi_ArrayList<>();
	        ma1.add(1);
	        ma1.add(2);
	        ma2.add(1);
	        ma2.add(2);
	        assertTrue(ma1.equals(ma2));
	    }
	    @Test
	    public void testMulti_ArrayListAddAll() {
	    	Multi_ArrayList<Integer> ma1 = new Multi_ArrayList<>();
	    	Multi_ArrayList<Integer> ma2 = new Multi_ArrayList<>();
	        ma1.add(1);
	        ma1.add(2);
	        ma2.add(3);
	        ma1.addAll(ma2);
	        assertTrue(ma1.lista_criada.contains(1));
	        assertTrue(ma1.lista_criada.contains(2));
	        assertTrue(ma1.lista_criada.contains(3));
	    }
	    @Test
	    public void testMulti_SetAdd() {
	        Multi_Set<Integer> ms = new Multi_Set<>();
	        ms.add(1);
	        assertTrue(ms.itens.contains(1));
	    }
	    @Test
	    public void testMulti_SetEquals() {
	        Multi_Set<Integer> ms1 = new Multi_Set<>();
	        Multi_Set<Integer> ms2 = new Multi_Set<>();
	        ms1.add(1);
	        ms1.add(2);
	        ms2.add(1);
	        ms2.add(2);
	        assertTrue(ms1.equals(ms2));
	    }
	    @Test
	    public void testMulti_SetAddAll() {
	    	Multi_Set<Integer> ms1 = new Multi_Set<>();
	    	Multi_Set<Integer> ms2 = new Multi_Set<>();
	        ms1.add(1);
	        ms1.add(2);
	        ms2.add(3);
	        ms1.addAll(ms2);
	        assertTrue(ms1.itens.contains(1));
	        assertTrue(ms1.itens.contains(2));
	        assertTrue(ms1.itens.contains(3));
	    }
	    @Test
	    public void testMulti_LinkedListAdd() {
	        Multi_LinkedList<Integer> ml = new Multi_LinkedList<>();
	        ml.add(1);
	        assertTrue(ml.itens.contains(1));
	    }
	    @Test
	    public void testMulti_LinkedListEquals() {
	        Multi_LinkedList<Integer> ml1 = new Multi_LinkedList<>();
	        Multi_LinkedList<Integer> ml2 = new Multi_LinkedList<>();
	        ml1.add(1);
	        ml1.add(2);
	        ml2.add(1);
	        ml2.add(2);
	        assertTrue(ml1.equals(ml2));
	    }
	    @Test
	    public void testMulti_LinkedListAddAll() {
	    	Multi_LinkedList<Integer> ml1 = new Multi_LinkedList<>();
	    	Multi_LinkedList<Integer> ml2 = new Multi_LinkedList<>();
	        ml1.add(1);
	        ml1.add(2);
	        ml2.add(3);
	        ml1.addAll(ml2);
	        assertTrue(ml1.itens.contains(1));
	        assertTrue(ml1.itens.contains(2));
	        assertTrue(ml1.itens.contains(3));
	    }
	    @Test
	    public void testMulti_StackAdd() {
	        Multi_Stack<Integer> ms = new Multi_Stack<>();
	        ms.add(1);
	        assertTrue(ms.itens.contains(1));
	    }
	    @Test
	    public void testMulti_StackEquals() {
	    	Multi_Stack<Integer> ms1 = new Multi_Stack<>();
	    	Multi_Stack<Integer> ms2 = new Multi_Stack<>();
	        ms1.add(1);
	        ms1.add(2);
	        ms2.add(1);
	        ms2.add(2);
	        assertTrue(ms1.equals(ms2));
	    }
	    @Test
	    public void testMulti_StackAddAll() {
	    	Multi_Stack<Integer> ms1 = new Multi_Stack<>();
	    	Multi_Stack<Integer> ms2 = new Multi_Stack<>();
	        ms1.add(1);
	        ms1.add(2);
	        ms2.add(3);
	        ms1.addAll(ms2);
	        assertTrue(ms1.itens.contains(1));
	        assertTrue(ms1.itens.contains(2));
	        assertTrue(ms1.itens.contains(3));
	    }
}
