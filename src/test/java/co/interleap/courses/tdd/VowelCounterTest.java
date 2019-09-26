package co.interleap.courses.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {
    @Test
    public void shouldCountZeroWithAnEmptyString(){
        assertEquals(0, new VowelCounter().count(""));
    }
}