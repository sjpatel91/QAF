package qaf.example.tests;

import static com.qmetry.qaf.automation.step.CommonStep.*;
import static qaf.example.steps.StepsLibrary.*;


import org.openqa.selenium.WebDriver.Navigation;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.thoughtworks.selenium.webdriven.commands.GetAttribute;

import qaf.example.steps.StepsLibraryRecipe;

public class SampleTest extends WebDriverTestCase {

	/*@Test
	public void testGoogleSearch() {
		get("/");
		searchFor("qaf github infostretch");
		verifyLinkWithPartialTextPresent("qaf");
	}*/
	@Test
	public void testRecipeSearch() {
		get("https://www.food.com/");
		recipeSearch();
		assertAttribute("title.search", "innerHTML","Best Banana Bread");
		assertAttribute("notes.search", "innerHTML", "MY PRIVATE NOTES");
	}
	
	@Test
	public void testRecipeDropdownSearch() {
		get("https://www.food.com/");
		recipeDropdownSearch();	
		assertAttribute("trending_value.search", "innerHTML", "Trending");
		
	}
	@Test
	public void testRecipeDaySearch() {
		get("https://www.food.com/");
		baseSection();
		assertAttribute("recipe_day_main_page_title.search", "innerHTML", "Mexican Meatball Soup");
		assertNotVisible("share.search");
		recipeDaySearch();
		assertAttribute("recipe_day_title.search", "innerHTML", "70 Regional Mexican Foods to Make at Home");
		
	}
	
	//Negative
	
	
	@Test
	public void testServeSearch() {
		get("https://www.food.com/");
		serveSearch();
		assertAttribute("serve.search", "innerHTML", "-50");
		assertNotAttribute("ingredient.search", "innerHTML", "5");
		
		
	}
	@Test
	public void testSearchBoxSearch() {
		get("https://www.food.com/");
		searchRecipeSearch();
		assertAttribute("message_recipe.search", "innerHTML", "Bad Request");
		
	}
	@Test
	public void testYieldSearch() {
		//StepsLibraryRecipe s = new StepsLibraryRecipe();
		get("https://www.food.com/");
		yieldSearch();
		assertAttribute("yield_value.search", "innerHTML", "1");	
		
	}
	
	
	
}
