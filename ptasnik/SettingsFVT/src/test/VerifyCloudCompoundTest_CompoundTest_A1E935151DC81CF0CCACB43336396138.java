/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class VerifyCloudCompoundTest_CompoundTest_A1E935151DC81CF0CCACB43336396138
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public VerifyCloudCompoundTest_CompoundTest_A1E935151DC81CF0CCACB43336396138(IContainer parent, String name) {
		super(parent, "VerifyCloudCompoundTest", "A1E935151DC81CF0CCACB43336396138");
	}

	public void execute() {

		this.add(new test.VerifyCloud_Test_A1E9351427557200CCACB43336396138(this, "A1E9351524237680CCACB43336396138") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}