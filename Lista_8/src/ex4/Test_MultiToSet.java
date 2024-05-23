package ex4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Test_MultiToSet {
	@Test
    public void testAdd() {
        Collection<Integer> collection = new ArrayList<>();
        Set<Integer> setAdapter = new MultiToSet<>(collection);        
        setAdapter.add(1);
        setAdapter.add(2);
        setAdapter.add(2);   
        assertEquals(new HashSet<>(Arrays.asList(1, 2)), setAdapter);
    }
    @Test
    public void testEquals() {
    	Collection<Integer> c1 = new ArrayList<>(Arrays.asList(1,1,2,2));
    	Set<Integer> s1 = new MultiToSet<>(c1);
    	Collection<Integer> c2 = new ArrayList<>(Arrays.asList(1,2));
    	Set<Integer> s2 = new MultiToSet<>(c2);
    	assertTrue(s1.equals(s2));
    }
    @Test
    public void testAddAll() {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2));        
        Set<Integer> setAdapter = new MultiToSet<>(collection);
        setAdapter.addAll(Arrays.asList(2, 3, 4));      
        assertEquals(new HashSet<>(Arrays.asList(1, 2, 3, 4)), setAdapter);
    }
    @Test
    public void testSize() {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 2));
        
        Set<Integer> setAdapter = new MultiToSet<>(collection);
        
        assertEquals(2, setAdapter.size());
    }
}