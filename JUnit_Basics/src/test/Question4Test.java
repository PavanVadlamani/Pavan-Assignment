import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class Question4Test {

	Question4 Q4;
	@BeforeEach
	void beforeeachmethod1()
	{
		Q4=new Question4();
	}
	@BeforeAll
	static void beforeAllmethod1()
	{
		System.out.println("After beforeAll");
	}
	@AfterEach
	void AfterEachMethod1()
	{
		System.out.println("AfterEach :");
	}
	@AfterAll
	static void AfterAllMethod1()
	{
		System.out.println("AfterAll method");
	}
	@Test
	void test() {
		assertEquals(3, Q4.add(2, 1));
		System.out.println("Adding");
	}
	

}
