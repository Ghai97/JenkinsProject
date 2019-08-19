package com.sapient.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsProjectApplicationTests {

	@Test
    public void contextLoads1() {
        assertEquals(1, 1);
    }
    
    @Test
    public void contextLoads2() {
        assertEquals(2, 2);
    }
    
    @Test
    public void contextLoads3() {
        assertEquals(3, 3);
    }
    
    @Test
    public void contextLoads4() {
        assertEquals(3, 3);
    }
    
    @Test
    public void contextLoads5() {
        assertEquals(3, 3);
    }
}
