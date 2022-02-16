import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxFinderObjTest {

	MinMaxFinderObj MM;
	myclass expected;
	myclass actual;
	
	@BeforeEach
	void obj()
	{
		MM= new MinMaxFinderObj();
		expected = new myclass();
		actual = new myclass();
	}
	@Test
	@DisplayName("TestCase1")
	void test1() 
	{
		
		int arr[]={56, 34, 7,3, 54, 3, 34, 34, 53};
		actual= MM.findMinMax2(arr);
		expected.minimum=3;
		expected.maximum=56;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	@DisplayName("TestCase2")
	void test2() 
	{
		myclass expected = new myclass();
		myclass actual = new myclass();
		int arr[]={3,3,3,3,3,3};
		actual= MM.findMinMax2(arr);
		expected.minimum=3;
		expected.maximum=3;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	@DisplayName("TestCase3")
	void test3() 
	{
		myclass expected = new myclass();
		myclass actual = new myclass();
		int arr[]={10};
		actual= MM.findMinMax2(arr);
		expected.minimum=10;
		expected.maximum=10;
		Assertions.assertEquals(expected, actual);
	}
	@Test
	@DisplayName("TestCase4")
	void test4()
	{
		int arr[]={ };
		assertThrows(RuntimeException.class, () -> MM.findMinMax2(arr));
		
	}
}
