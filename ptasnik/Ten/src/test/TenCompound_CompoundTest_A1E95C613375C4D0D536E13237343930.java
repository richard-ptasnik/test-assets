/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KDelay;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class TenCompound_CompoundTest_A1E95C613375C4D0D536E13237343930
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public TenCompound_CompoundTest_A1E95C613375C4D0D536E13237343930(IContainer parent, String name) {
		super(parent, "TenCompound", "A1E95C613375C4D0D536E13237343930");
	}

	public void execute() {

		this.add(new KDelay(this, "Delay (10 min.)", "A1E95C6138138FE0D536E13237343930", 600000));
		super.execute();
	}

}