package com.aceinthedeck.tests;


import com.aceinthedeck.PyramidPattern;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PyramidPatternTest {

    @Test
    public void patternTest3(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        PyramidPattern.print(3);
        String output = new String(outputStream.toByteArray());
        Assert.assertEquals(output, "  *\n ***\n*****\n");
    }
}
