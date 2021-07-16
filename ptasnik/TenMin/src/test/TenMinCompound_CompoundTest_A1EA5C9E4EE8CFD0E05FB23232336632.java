/**@generated
 * WARNING – Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.KDelay;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class TenMinCompound_CompoundTest_A1EA5C9E4EE8CFD0E05FB23232336632
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public TenMinCompound_CompoundTest_A1EA5C9E4EE8CFD0E05FB23232336632(IContainer parent, String name) {
		super(parent, "TenMinCompound", "A1EA5C9E4EE8CFD0E05FB23232336632");
	}

	public void execute() {

		For loopNm_1 = Loop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(null);

		super.execute();
	}

	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent, "Loop1", "A1EA5C9E563D7D80E05FB23232336632", 10, 60000, 0, 0, 1, true, false,
				null) {

			public void executeLoop() {

				this.add(new test.TenTest_Test_A1EA5C9E44AF51B0E05FB23232336632(this,
						"A1EA5C9E5278FB70E05FB23232336632") {
					public void execute() {
						this.setRtbEnabled(false);
						super.execute();
					}
				});

				this.add(new KDelay(this, "Delay (1 min.)", "A1EA5C9E613F0690E05FB23232336632", 60000));
				super.executeLoop();
			}

		};
		return forLoop;
	}

}