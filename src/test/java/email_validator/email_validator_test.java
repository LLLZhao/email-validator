package email_validator;
import static org.junit.Assert.*;
import org.junit.Test;

import email_validator.emailValidator;

public class email_validator_test {
//test
	@Test
	public void test() {
		emailValidator test = new emailValidator();
		int result = test.validator("linhui@dal.com");
		assertEquals(4,result);
	}
}
