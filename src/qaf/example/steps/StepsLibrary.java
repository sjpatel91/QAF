package qaf.example.steps;

import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.mouseOver;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.submit;

import com.qmetry.qaf.automation.step.QAFTestStep;

import food.Page.EachRecipe;
import food.Page.Recipe;

public class StepsLibrary {
	/**
	 * @param searchTerm
	 *            : search term to be searched
	 */
//	@QAFTestStep(description = "search for {0}")
//	public static void searchFor(String searchTerm) {
//		sendKeys(searchTerm, "input.search");
//		click("button.search");
//	}
	@QAFTestStep(description = "search for {0}")
	public static void baseSection() {
		click("recipe.search");
		}
	
	@QAFTestStep(description = "I am verifying whole path for particlar recipe")
	public static void recipeSearch() {
		baseSection();
		click("banana_recipe.search");
		click("full_recipe.search");
	}
	@QAFTestStep(description = "I am verifying dropdown for Trending recipes")
	public static void recipeDropdownSearch() {
		baseSection();
		click("dropdown.search");
		click("trending.search");
	}
	@QAFTestStep(description = "I verified recipe of day")
	public static void recipeDaySearch() {
		mouseOver("mouse_over_recipe.search");
		click("share.search");
		click("share_close.search");
		click("recipe_of_day.search");
	}
	
	@QAFTestStep(description = "I am trying to verify serve size with negative numbers")
	public static void serveSearch() {
		baseSection();
		click("banana_recipe.search");
		click("serve.search");
		clear("serve_keys.search");
		sendKeys("-5", "serve_keys.search");
		click("done_serve.search");
	}
	@QAFTestStep(description = "I am verifying search box with % sign")
	public static void searchRecipeSearch() {
		baseSection();
		sendKeys("%", "search_recipe.search");
		submit("search_recipe.search");
	}
	
	@QAFTestStep(description = "I am trying to verify yield size with 0")
	public static void yieldSearch() {
		baseSection();
		click("banana_recipe.search");
		click("yield.search");
		clear("serve_keys.search");
		sendKeys("0", "serve_keys.search");
		click("done_serve.search");
		
	}
	
}
