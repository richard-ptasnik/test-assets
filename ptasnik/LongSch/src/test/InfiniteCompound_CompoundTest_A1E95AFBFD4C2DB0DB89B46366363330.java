/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.ArmableTransaction;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.KDelay;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class InfiniteCompound_CompoundTest_A1E95AFBFD4C2DB0DB89B46366363330
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public InfiniteCompound_CompoundTest_A1E95AFBFD4C2DB0DB89B46366363330(IContainer parent, String name) {
		super(parent, "InfiniteCompound", "A1E95AFBFD4C2DB0DB89B46366363330");
	}

	public void execute() {

		For loopNm_1 = Loop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(null);

		super.execute();
	}

	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent, "Loop1", "A1E95AFDAF2209A0DB89B46366363330", -1, 0, 0, 0, 1, true, false, null) {

			public void executeLoop() {

				this.add(transaction_1(this));
				super.executeLoop();
			}

		};
		return forLoop;
	}

	private ArmableTransaction transaction_1(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Transaction1", "A1E95AFC10F5BF70DB89B46366363330") {

			public void execute() {

				this.add(new KDelay(this, "Delay (5 min.)", "A1E95AFC1982ED20DB89B46366363330", 300000));

				super.execute();
			}

			public void finish(IKAction child) {
				super.finish(child);
				if (hasFinished()) {

				}
			}
		};
		trx.setArmEnabled(false);
		return trx;
	}

}