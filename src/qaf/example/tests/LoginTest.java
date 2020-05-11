package qaf.example.tests;
import static qaf.example.steps.StepsLibraryRecipe.*;

import java.util.Map;

import static com.qmetry.qaf.automation.step.CommonStep.*;
import static qaf.example.steps.StepsLibrary.*;

import org.openqa.selenium.WebDriver.Navigation;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

import com.thoughtworks.selenium.webdriven.commands.GetAttribute;


import qaf.example.steps.StepsLibraryRecipe;

public class LoginTest extends WebDriverTestCase{
	@QAFDataProvider(dataFile = "resources/logintestdata.json")
	@Test(description = "json file as data provider ")
	public void testLogin(Map <String, String> data) {
		//Map<String, String> params
		//LoginPage loginPage = new LoginPage();
		get("https://www.food.com/");
		StepsLibraryRecipe s = new StepsLibraryRecipe();
		s.loginSearch(data.get("Username"),data.get("password"));

}
}
