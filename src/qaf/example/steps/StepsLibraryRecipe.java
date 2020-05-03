package qaf.example.steps;

import com.qmetry.qaf.automation.step.QAFTestStep;

import static com.qmetry.qaf.automation.step.CommonStep.*;
import static qaf.example.steps.StepsLibrary.*;

import org.openqa.selenium.WebDriver.Navigation;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.thoughtworks.selenium.webdriven.commands.GetAttribute;
import food.*;
import food.Page.EachRecipe;
import food.Page.Recipe;

public class StepsLibraryRecipe extends WebDriverTestCase{
	/**
	 * @param searchTerm
	 *            : search term to be searched
	 */
	
	
	@QAFTestStep(description = "I go to food.com, and select recipe section")
	public static void baseSection() {
		Recipe rec = new Recipe();
		rec.getRecipeSection().click();
		}
	
	@QAFTestStep(description = "I am verifying whole path for particlar recipe")
	public static void recipeSearch() {
		baseSection();
		Recipe rec = new Recipe();
		EachRecipe each_rec = new EachRecipe();
		rec.getBananaRecipe().click();
		each_rec.getFull_recipe().click();
		
	}
	@QAFTestStep(description = "dropdown for Trending recipes")
	public static void recipeDropdownSearch() {
		baseSection();
		Recipe rec = new Recipe();
		EachRecipe each_rec = new EachRecipe();
		rec.getDropdown().click();
		rec.getTrending().click();
	}
	@QAFTestStep(description = "recipe of day")
	public static void recipeDaySearch() {
		Recipe rec = new Recipe();
		EachRecipe each_rec = new EachRecipe();
		mouseOver("mouse_over_recipe.search");
		rec.getShare().click();
		rec.getShare_close().click();
		rec.getRecipe_of_day().click();
		
	}
	
	@QAFTestStep(description = "serve size")
	public static void serveSearch() {
		Recipe rec = new Recipe();
		EachRecipe each_rec = new EachRecipe();
		baseSection();
		rec.getBananaRecipe().click();
		each_rec.getServe().click();
		each_rec.getServe_keys().clear();
		each_rec.getServe_keys().sendKeys("-5");
		each_rec.getDone_serve().click();
		
	}
	@QAFTestStep(description = "search recipe")
	public static void searchRecipeSearch() {
		Recipe rec = new Recipe();
		EachRecipe each_rec = new EachRecipe();
		baseSection();
		rec.getSearch_recipe().sendKeys("%");
		rec.getSearch_recipe().submit();
//		sendKeys("%", "search_recipe.search");
//		submit("search_recipe.search");
	}
	
	
}
