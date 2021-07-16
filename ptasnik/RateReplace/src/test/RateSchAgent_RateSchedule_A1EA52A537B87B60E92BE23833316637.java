/**@generated
 * WARNING – Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.IPacedLoop;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.KSyncPoint;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.PacedLoop;
import com.ibm.rational.test.lt.kernel.action.impl.RateGenerator;
import com.ibm.rational.test.lt.kernel.action.impl.RateRunner;
import com.ibm.rational.test.lt.kernel.action.impl.RateUserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class RateSchAgent_RateSchedule_A1EA52A537B87B60E92BE23833316637
		extends com.ibm.rational.test.lt.kernel.action.impl.RateSchedule {

	public RateSchAgent_RateSchedule_A1EA52A537B87B60E92BE23833316637(IContainer parent, String name) {
		super(parent, name, "A1EA52A537B87B60E92BE23833316637");
		setThinkMax(10000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addEventBehavior(
				new RPTEventStructure(new RPTFailVPEvent(), null, 1, "Content Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), null, 1, "Connection failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), null, 1, "Authentication failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(),
				new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
		this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), null, 1, "Failed to extract reference"));
		this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), null, 1, "Substitution failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), null, 1, "Timeout"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), null, 1, "Custom Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(),
				new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1,
				"Custom Code reported an unhandled exception"));

		this.addUserGroup(new RateRunnerGroup_1(this));

		this.addUserGroup(new RateRunnerGroup_2(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class RateRunnerGroup_1 extends RateUserGroup {

		public RateRunnerGroup_1(IContainer parent) {
			super(parent, "Rate Runner Group 1", "A1EA52A537C28D80E92BE23833316637");

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return createScenario(parent);
		}

		private IContainer createScenario(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario", "A1EA52A537C28D80E92BE23833316637") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					PacedLoop rategenLoop = createRateGenerator(this);
					this.add(rategenLoop);
					rategenLoop.addVarsToInit(null);
					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

		private RateGenerator createRateGenerator(IContainer parent) {
			RateGenerator rateGenerator = new RateRunner(parent, "Rate Runner Group 1",
					"A1EA52A537C28D80E92BE23833316637", -1, 0, 0, 0, 1, true, false, 1, 60000, IPacedLoop.CONSTANT,
					false, true) {

				public void executeLoop() {
					this.add(new KSyncPoint(this, this.getName() + "SyncPoint", "A1EA52A537C28D80E92BE23833316637",
							300000, true, 0, 0, 60000));
					this.add(new IterationDelay(this, "RateRunner PacedLoop Iteration Delay", //$NON-NLS-1$
							"A1EA52A537C28D80E92BE23833316637"));

					this.add(new test.Core_Test_A1EA52A52A7566C0E92BE23833316637(this,
							"A1EA52AB7E581B10E92BE23833316637") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					super.executeLoop();
				}

			};
			return rateGenerator;
		}

	}

	public class RateRunnerGroup_2 extends RateUserGroup {

		public RateRunnerGroup_2(IContainer parent) {
			super(parent, "Rate Runner Group 2", "A1EA53413669BB60EAF7B76434386332");

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return createScenario(parent);
		}

		private IContainer createScenario(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario", "A1EA53413669BB60EAF7B76434386332") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					PacedLoop rategenLoop = createRateGenerator(this);
					this.add(rategenLoop);
					rategenLoop.addVarsToInit(null);
					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

		private RateGenerator createRateGenerator(IContainer parent) {
			RateGenerator rateGenerator = new RateRunner(parent, "Rate Runner Group 2",
					"A1EA53413669BB60EAF7B76434386332", -1, 0, 0, 0, 1, true, false, 1, 1000, IPacedLoop.CONSTANT,
					false, true) {

				public void executeLoop() {
					this.add(new KSyncPoint(this, this.getName() + "SyncPoint", "A1EA53413669BB60EAF7B76434386332",
							300000, true, 0, 0, 60000));
					this.add(new IterationDelay(this, "RateRunner PacedLoop Iteration Delay", //$NON-NLS-1$
							"A1EA53413669BB60EAF7B76434386332"));

					this.add(new test.Core_Test_A1EA52A52A7566C0E92BE23833316637(this,
							"A1EA53413B1912A0EAF7B76434386332") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					super.executeLoop();
				}

			};
			return rateGenerator;
		}

	}

}