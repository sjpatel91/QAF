package qaf.example.tests;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ws.RestWSTestCase;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.api.client.WebResource;
import static qaf.example.steps.StepsEmployee.*;

public class WebServiceTest extends RestWSTestCase{
	@Test(testName = "getEmps")
	public void getEnmployees() {

		//create get request
		ClientResponse response = getWebResource("/employees").accept("application/json").get(ClientResponse.class);
		responseShouldHaveStatus("OK");
		responseShouldHaveStatusCode(200);
		verifyThat("Response Status", getResponse().getStatus(), Matchers.equalTo(Status.OK));
	}
	@Test(testName = "getEmp")
	public void getEmployee() {
	
			
			//create get request
			ClientResponse response = getWebResource("/employee/1").accept("application/json").get(ClientResponse.class);
			responseShouldHaveStatus("BAD_REQUEST");
			responseShouldHaveStatusCode(400);
			System.out.println(response);
			verifyThat("Response Status", getResponse().getStatus(), Matchers.equalTo(Status.BAD_REQUEST));
	
		}
}
