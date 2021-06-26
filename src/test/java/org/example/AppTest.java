package org.example;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    App a = new App();

    @Test
    public void runReverseTest1(){
        char[] charArrayInput = {'a', 'b', 'c', 'd', 'e'};
        char[] outPutToCompare = {'e','d','c','b','a'};

        Assert.assertArrayEquals(
                outPutToCompare,
                a.reverseTheArray(charArrayInput)
        );

    }

    @Test
    public void runReverseTest2(){
        char[] charArrayInput = {'a', 'b', 'c', 'd', 'e','f'};
        char[] outPutToCompare = {'f','e','d','c','b','a'};

        Assert.assertArrayEquals(
                outPutToCompare,
                a.reverseTheArray(charArrayInput)
        );
    }

    @Test
    public void printReverseTest1(){
        char[] charArrayInput = {'a', 'b', 'c', 'd', 'e'};
        a.printReverseArray(charArrayInput);

    }

    @Test
    public void printReverseTest2(){
        char[] charArrayInput = {'a', 'b', 'c', 'd', 'e','f'};
        a.printReverseArray(charArrayInput);
    }



}
