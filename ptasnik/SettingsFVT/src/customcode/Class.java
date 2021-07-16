package customcode;

import org.eclipse.hyades.test.common.event.VerdictEvent;

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.ITestLogManager;
import com.ibm.rational.test.lt.kernel.services.RPTCondition;

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
	 * 
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		String localWBVersion = args[0];
		String expectedCompatible = args[1].toLowerCase();
		String content = args[2];
		String datasetInput = args[3];
		
		ITestLogManager testlog = tes.getTestLogManager();
		boolean actuallyCompatible = content.contains("imageTemplates");
		
		String path = "Pages_Verification Points_v1_compatibility";
		
		tes.getTestLogManager().reportMessage("Testing localWBVersion=" + localWBVersion + " with expected expected compatible=" + expectedCompatible + ", datasetInput=" + datasetInput);
		if (expectedCompatible.compareTo("true") == 0) {
			if (actuallyCompatible) {
				testlog.reportVerificationPoint(path, VerdictEvent.VERDICT_PASS);
			} else {
				testlog.reportVerificationPoint(path, VerdictEvent.VERDICT_FAIL);
			}
		} else if (expectedCompatible.compareTo("false") == 0) {
			if (actuallyCompatible == false) {
				testlog.reportVerificationPoint(path, VerdictEvent.VERDICT_PASS);
			} else {
				testlog.reportVerificationPoint(path, VerdictEvent.VERDICT_FAIL);
			}			
		} else {
			testlog.reportVerificationPoint(path, VerdictEvent.VERDICT_ERROR);
			testlog.reportErrorCondition(RPTCondition.CustomCodeAlert);
		}
		
		if (datasetInput.compareTo("PASS") == 0) {
			tes.getTestLogManager().reportMessage("dataset verdict PASS");
			testlog.reportVerificationPoint(path, VerdictEvent.VERDICT_PASS);
		} else if (datasetInput.compareTo("FAIL") == 0) {
			tes.getTestLogManager().reportMessage("dataset verdict FAIL");
			testlog.reportVerificationPoint(path, VerdictEvent.VERDICT_FAIL);
		} else {
			tes.getTestLogManager().reportMessage("dataset NOT proper");
			testlog.reportVerificationPoint(path, VerdictEvent.VERDICT_ERROR);
			testlog.reportErrorCondition(RPTCondition.CustomCodeAlert);
		}
		
		return null;
	}

}
