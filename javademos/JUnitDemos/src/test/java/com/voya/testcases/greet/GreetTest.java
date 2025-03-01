package com.voya.testcases.greet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreetTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Testing null")
	void testNull() {
		List<String> mylist = null;
		assertNull(mylist);
	}
	@Test
	@DisplayName("Testing null")
	void testNotNull() {
	List<String> mylist = new ArrayList<>();
	assertNotNull(mylist);//test case will succeed
	//assertNull(mylist);//test case will fail
	}
	@Test
	@DisplayName("Testing String refernces")
	void testSame() {
		
		String username = "priya";
		//String nusername = new String("priya");// Reference created in memory pool
		String nusername = "priya";
		assertSame(username,nusername,"refernce are not same");
		
	}

}
