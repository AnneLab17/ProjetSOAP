package org.ProjetSOAP;

import org.junit.Test;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class SimpleRunnerSoapUI {

	@Test
	public void test() throws Exception {
	    SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
	    testCaseRunner.setProjectFile("C:\\Users\\formation\\Documents\\SquashTA-1.10.0-RELEASE-workspace\\ProjetSOAP\\src\\test\\resources\\NOAA-SOAP-soapui-project.xml");
	    try {
	        testCaseRunner.run();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
