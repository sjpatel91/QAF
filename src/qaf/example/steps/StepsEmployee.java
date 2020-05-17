package qaf.example.steps;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ws.rest.RestTestBase;

public class StepsEmployee {
	
	@QAFTestStep(description = "response should have status {status}")
	public static void responseShouldHaveStatus(String status) {
		assertThat("Response Status", new RestTestBase().getResponse().getStatus().name(),
				Matchers.equalToIgnoringCase(status));
	}

	/**
	 * This method check for the response status of web service
	 * <p>
	 * Example:
	 * <p>
	 * BDD
	 * </p>
	 * <code>
	 * response should have status 'ResponceStatus'<br/>
	 * </code>
	 * <p>
	 * KWD
	 * </p>
	 * 
	 * @param status
	 *            : {0} : Status code, for example 200, 301
	 * @see Status
	 */
	@QAFTestStep(description = "response should have status code {statusCode}")
	public static void responseShouldHaveStatusCode(int statusCode) {
		assertThat("Response Status", new RestTestBase().getResponse().getStatus().getStatusCode(),
				Matchers.equalTo(statusCode));
	}



}
