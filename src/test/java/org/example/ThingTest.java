package org.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ThingTest {
    @Test
    public void returnsOne() {
        Thing thing = new Thing();
        assertThat(thing.getNumber(), is(1));
    }
}
