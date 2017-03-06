package com.yourself;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by charlotte on 28/02/17.
 */
public class SumTest {
    /**
     * Test your exercise
     */
    @Test
    public void testApp()
    {
        Sum  app = new Sum();

        assertEquals( 5, app.sum(2, 3) );
        assertEquals( 12, app.sum(5, 7) );
        assertEquals( 12, app.sum(6, 6) );
    }

}
