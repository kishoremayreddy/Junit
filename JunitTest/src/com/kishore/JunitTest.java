package com.kishore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	public  void test() {
		Testing test=new Testing();
		int output= test.sqaure(5);
		assertEquals(25, output);
	}

}
