package com.company;import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 30.06.2017.
 */
public class EratosphenTest {
    @Test
    public void eratosphen() throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        assertEquals(list, Eratosphen.eratosphen(10));
    }

}