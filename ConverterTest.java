package com.example.unitcoverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ConverterTest {
    @Test
    public void pounds_to_kg_conversion_isCorrect() {
        assertEquals(0.453592, Converter.toLbs(1),0.1);
    }
    }


