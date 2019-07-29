package com.aceinthedeck.tests;

import com.aceinthedeck.StepPattern;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StepPatternTest {

    @Test
    public void patternTest3(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        StepPattern.print(3);
        String output = new String(outputStream.toByteArray());
        Assert.assertEquals(output, "*\n**\n***\n");
    }
}
