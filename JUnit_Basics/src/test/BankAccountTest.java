import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest {

	BankAccount B = new BankAccount();
	@Test
	@DisplayName("testcase1")
	void test1() {
		int balance =2000;
		try {
			Assertions.assertEquals(1500, B.WithDraw(500));
		} catch (InsufficientFundsExpcetion e) {
			e.printStackTrace();
		}
	}
	@Test
	@DisplayName("testcase2")
	void test2() {
		int balance =2000;
		Assertions.assertThrows(InsufficientFundsExpcetion.class, ()->B.WithDraw(2100));
	}

}
