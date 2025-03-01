package com.student.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exception.InvalidNumberException;
import com.voya.training.StudentDetails;

class StudentDetailsTest {
	StudentDetails studentDetails = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all the testcases");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		studentDetails = new StudentDetails ();
		System.out.println("called before each testcase");
	}

	@AfterEach
	void tearDown() throws Exception {
		studentDetails = null;
		System.out.println("called after each testcase");
	}

	@Test
	void testTotalMarks() {
		int actual = studentDetails.totalMarks(79, 90, 85);
		assertEquals(254,actual);
	}
//	@Test
//	@DisplayName("Testing negative marks")
//	@Tag("neg")
//	void testNegMarks() {
//		assertThrows(InvalidNumberException.class,
//				()->studentDetails.totalMarks(79,-90,85));	
//	}
	
	
}
