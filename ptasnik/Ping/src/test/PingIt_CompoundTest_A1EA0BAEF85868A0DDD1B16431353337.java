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
public class PingIt_CompoundTest_A1EA0BAEF85868A0DDD1B16431353337
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public PingIt_CompoundTest_A1EA0BAEF85868A0DDD1B16431353337(IContainer parent, String name) {
		super(parent, "PingIt", "A1EA0BAEF85868A0DDD1B16431353337");
	}

	public void execute() {

		this.add(new test.CallPing_Test_A1EA0BAF71626E80DDD1B16431353337(this, "A1EA0BB120142710DDD1B16431353337") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}