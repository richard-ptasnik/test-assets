package customcode;

import org.eclipse.hyades.test.common.event.VerdictEvent;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

/**
 * @author unknown
 */
public class Class implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public Class() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		String VERDICT = args[0];
		
		tes.getTestLogManager().reportMessage("VERDICT=" + VERDICT);
		
		if (VERDICT.compareToIgnoreCase("PASS") == 0) {
			tes.getTestLogManager().reportVerdict("TheVerdict", VerdictEvent.VERDICT_PASS);
		} else if (VERDICT.compareToIgnoreCase("ERROR") == 0) {
			tes.getTestLogManager().reportVerdict("TheVerdict", VerdictEvent.VERDICT_ERROR);
		} else if (VERDICT.compareToIgnoreCase("FAIL") == 0) {
			tes.getTestLogManager().reportVerdict("TheVerdict", VerdictEvent.VERDICT_FAIL);
		} else if (VERDICT.compareToIgnoreCase("INCONCLUSIVE") == 0) {
			tes.getTestLogManager().reportVerdict("TheVerdict", VerdictEvent.VERDICT_INCONCLUSIVE);
		}
		
		
		return null;
	}

}
