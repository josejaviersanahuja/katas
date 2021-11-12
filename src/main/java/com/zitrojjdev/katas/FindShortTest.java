package com.zitrojjdev.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Javatlacati on 01/03/2017.
 */
public class FindShortTest {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, FindShort.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, FindShort.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, FindShort.findShort("Let's travel abroad shall we"));
    }

}