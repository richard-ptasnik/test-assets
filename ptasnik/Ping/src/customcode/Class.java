package customcode;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

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
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    try (PrintStream ps = new PrintStream(baos, true, "UTF-8")) {
			try {
				InetAddress inetAddress = InetAddress.getByName(args[0]);
				displayStuff(ps, args[0], inetAddress);
			} catch (UnknownHostException e) {
				e.printStackTrace(ps);
			}	        
	    } catch (UnsupportedEncodingException e1) {
	    	tes.getTestLogManager().reportMessage(e1.toString());
		}
	    tes.getTestLogManager().reportMessage(new String(baos.toByteArray(), StandardCharsets.UTF_8));
		return null;
	}

	public static void displayStuff(PrintStream ps, String whichHost, InetAddress inetAddress) {
		ps.println("--------------------------");
		ps.println("Which Host:" + whichHost);
		ps.println("Canonical Host Name:" + inetAddress.getCanonicalHostName());
		ps.println("Host Name:" + inetAddress.getHostName());
		ps.println("Host Address:" + inetAddress.getHostAddress());
	}	

}
