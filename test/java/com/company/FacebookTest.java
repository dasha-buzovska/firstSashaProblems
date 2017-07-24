package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 30.06.2017.
 */
public class FacebookTest {
    @Test
    public void compressNumber() throws Exception {
        assertEquals("1.4K", Facebook.compressNumber(1457));
        assertEquals("2K", Facebook.compressNumber(2006));
        assertEquals("17K", Facebook.compressNumber(17965));
        assertEquals("678K", Facebook.compressNumber(678154));
        assertEquals("1.4K", Facebook.compressNumber(1457));
        assertEquals("1.4M", Facebook.compressNumber(1457000));
        assertEquals("14M", Facebook.compressNumber(14570000));
        assertEquals("1.2B", Facebook.compressNumber(1240000000));
    }

    @Test
    public void toOrdinary() throws Exception {
        assertEquals("1st", Facebook.toOrdinary(1));
        assertEquals("2nd", Facebook.toOrdinary(2));
        assertEquals("411th", Facebook.toOrdinary(411));
        assertEquals("73rd", Facebook.toOrdinary(73));
    }

}