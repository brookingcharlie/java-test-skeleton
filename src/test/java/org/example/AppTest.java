package org.example;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class AppTest {
    @Test
    public void printsGreetingToText() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        App.main(new String[] {});
        assertThat(out.toString(), is("Hello World!\n"));
    }

    @Test
    public void printsGreetingToMock() {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        App.main(new String[] {});
        verify(out).println("Hello World!");
    }
}
