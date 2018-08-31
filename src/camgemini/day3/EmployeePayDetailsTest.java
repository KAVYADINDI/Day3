package camgemini.day3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import camgemini.day3.java.EmployeePayDetails;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class EmployeePayDetailsTest {

	EmployeePayDetails employee;
	EmployeePayDetails employee1;
	EmployeePayDetails employee2;
	@BeforeEach
	void setUp() {
		employee = new EmployeePayDetails("12D23", "Sam", 55000.0, 5000.0);
		employee1= new EmployeePayDetails("13B23", "Alia", 13000,2500);
	}

	@Test
	void testnetSalary() {
		assertEquals(80700, employee.netSalary(),0.02);
		assertEquals(20240,employee1.netSalary(),0.02);
		employee2= new EmployeePayDetails("13A23", "Tom", 30000, 900.0);
	    assertEquals(42100,employee2.netSalary(),0.02);
	}

	@AfterEach
	void tearDown() {
		employee = null;
	}

}
