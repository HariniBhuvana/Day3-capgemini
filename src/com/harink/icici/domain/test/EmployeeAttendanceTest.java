package com.harink.icici.domain.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.harink.icici.domain.EmployeeAttendance;


class EmployeeAttendanceTest {

	EmployeeAttendance attendance = new EmployeeAttendance(157846, "Sudarshan", "Shanbhag", "A4");

	@Test
	void testCheckIn() throws InterruptedException {
		assertEquals(true, attendance.checkIn(157846));
		Thread.sleep(5000);
		assertEquals(true, attendance.labCheckIn(157846));
		Thread.sleep(5000);
		assertEquals(false, attendance.labCheckOut(157846));
		Thread.sleep(5000);
		assertEquals(false, attendance.checkOut(157846));
	}
}