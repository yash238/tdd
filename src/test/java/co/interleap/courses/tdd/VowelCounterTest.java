package co.interleap.courses.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {
    @Test
    public void shouldCountZeroWithAnEmptyString(){
        assertEquals(0, new VowelCounter().count(""));
    }

    @Test
    public void shouldCountSingleVowel(){
        assertEquals(1,new VowelCounter().count("u"));
    }

    @Test
    public void shouldCountAllVowel(){
        assertEquals(5,new VowelCounter().count("aeiou"));
    }

    @Test
    public void shouldCountVowelInString(){
        assertEquals(10,new VowelCounter().count("Hello all my name is Yash Kalia"));
    }
}