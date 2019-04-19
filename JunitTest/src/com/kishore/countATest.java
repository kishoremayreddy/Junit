package com.kishore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		Testing test=new Testing();
		int output= test.countA("kishoreaa");
		assertEquals(2, output);
	}

}
