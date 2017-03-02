package email_validator;
import static org.junit.Assert.*;
import org.junit.Test;

import email_validator.emailValidator;

public class email_validator_test {

	@Test
	public void test() {
		emailValidator test = new emailValidator();
		int result = test.validator("linhui@dal.ca");
		assertEquals(2,result);
    
	}

}
