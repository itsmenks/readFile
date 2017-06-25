package com.test.readFile;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ReadFileTest {

    @InjectMocks
    ReadFile testReadFile;

    @Test
    public void test0() {
        Assert.assertNotNull(testReadFile);
  
    }
    @Test
    public void test1() {
    
        Assert.assertEquals(testReadFile.ShowFile("data.xls"), 0);
  
    }
    @Test
    public void test2() {
     
        Assert.assertEquals(testReadFile.ShowFile("data1.xls"), 1);
    }
}
