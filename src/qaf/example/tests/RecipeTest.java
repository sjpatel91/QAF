package qaf.example.tests;
import static qaf.example.steps.StepsLibraryRecipe.*;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.verifyLinkWithPartialTextPresent;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.*;
import static qaf.example.steps.StepsLibrary.*;

import org.openqa.selenium.WebDriver.Navigation;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.thoughtworks.selenium.webdriven.commands.GetAttribute;

import qaf.example.steps.StepsLibraryRecipe;

public class RecipeTest extends WebDriverTestCase {

	@Test
	public void testRecipeSearch() {
		StepsLibraryRecipe s = new StepsLibraryRecipe();
		get("https://www.food.com/");
		s.recipeSearch();
		assertAttribute("title.search", "innerHTML","Best Banana Bread");
		assertAttribute("notes.search", "innerHTML", "MY PRIVATE NOTES");
	}
	
	@Test
	public void testRecipeDropdownSearch() {
		StepsLibraryRecipe s = new StepsLibraryRecipe();
		get("https://www.food.com/");
		s.recipeDropdownSearch();	
		assertAttribute("trending_value.search", "innerHTML", "Trending");
		
	}
	@Test
	public void testRecipeDaySearch() {
		StepsLibraryRecipe s = new StepsLibraryRecipe();
		get("https://www.food.com/");
		s.baseSection();
		assertAttribute("recipe_day_main_page_title.search", "innerHTML", "Mexican Meatball Soup");
		assertNotVisible("share.search");
		s.recipeDaySearch();
		assertAttribute("recipe_day_title.search", "innerHTML", "70 Regional Mexican Foods to Make at Home");
		
	}
	
	@Test
	public void testServeSearch() {
		StepsLibraryRecipe s = new StepsLibraryRecipe();
		get("https://www.food.com/");
		s.serveSearch();
		assertAttribute("serve.search", "innerHTML", "-50");
		assertNotAttribute("ingredient.search", "innerHTML", "5");	
		
	}
	@Test
	public void testSearchBoxSearch() {
		StepsLibraryRecipe s = new StepsLibraryRecipe();
		get("https://www.food.com/");
		s.searchRecipeSearch();
		assertAttribute("message_recipe.search", "innerHTML", "Bad Request");
		
	}
	
	@Test
	public void testYieldSearch() {
		StepsLibraryRecipe s = new StepsLibraryRecipe();
		get("https://www.food.com/");
		s.yieldSearch();
		
		assertAttribute("yield_value.search", "innerHTML", "1");	
		
	}
	
	
	
}
