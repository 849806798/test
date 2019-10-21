package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

	@Test
	public void contextLoads() throws Exception {


	}

	public void test() {
        int num = 1;
        String str = String.format("%04d", num);
    }
}
