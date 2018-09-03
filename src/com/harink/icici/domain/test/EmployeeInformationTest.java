package com.harink.icici.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.harink.icici.domain.EmployeeInformation;

class EmployeeInformationTest {
 EmployeeInformation empinfo;
 @BeforeEach
	void setUp() {
	 empinfo = new EmployeeInformation(1234, "John Doe", 50000);
	}
 @Test
	void testNetSalary() {
		assertEquals(51300.0, empinfo.netSalary());
		//assertEquals(38000.0, empinfo.netSalary());
		//assertEquals(33432.66, empinfo.netSalary());
		//assertEquals(33432.66, empinfo.netSalary());
	}
 @AfterEach
	void tearDown() {
		empinfo = null;
	} 
}
