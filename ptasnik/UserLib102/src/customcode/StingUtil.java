package customcode;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

import org.apache.commons.lang3.StringUtils;

/**
 * @author unknown
 */
public class StingUtil implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public StingUtil() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		String myString1 = "ABC";
		String myString2 = "DEF";
		StringUtils.compare(myString1, myString2);
		return null;
	}

}