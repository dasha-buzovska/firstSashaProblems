package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14.07.2017.
 */
public class NumbersTest {
    @Test
    public void arabicToRoman() throws Exception {
        assertEquals("I", Numbers.arabicToRoman(1));
        assertEquals("V", Numbers.arabicToRoman(5));
        assertEquals("CL", Numbers.arabicToRoman(150));
    }

    @Test
    public void romanToArabic() throws Exception {
        assertEquals(2, Numbers.romanToArabic("II"));
        assertEquals(7, Numbers.romanToArabic("VII"));
        assertEquals(15, Numbers.romanToArabic("XV"));
        assertEquals(180, Numbers.romanToArabic("CLXXX"));
        assertEquals(500, Numbers.romanToArabic("D"));
    }

}