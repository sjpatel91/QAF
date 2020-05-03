package food.Page;

import static com.qmetry.qaf.automation.step.CommonStep.assertAttribute;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static qaf.example.steps.StepsLibrary.recipeDropdownSearch;
import static qaf.example.steps.StepsLibrary.recipeSearch;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.api.*;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.*;
import com.qmetry.qaf.automation.ui.webdriver.*;

public class EachRecipe extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "full_recipe.search")
    private QAFWebElement full_recipe;
	
	@FindBy(locator = "title.search")
	private QAFWebElement title;
	
	@FindBy(locator = "notes.search")
	private QAFWebElement notes;
	
	@FindBy(locator = "recipe_day_title.search")
	private QAFWebElement recipe_day_title;
	
	@FindBy(locator = "serve.search")
	private QAFWebElement serve;

	@FindBy(locator = "serve_keys.search")
	private QAFWebElement serve_keys;
	
	@FindBy(locator = "done_serve.search")
	private QAFWebElement done_serve;
	
	@FindBy(locator = "ingredient.search")
	private QAFWebElement ingredient;

	@Override
    protected void openPage(PageLocator arg0, Object... arg1) {
    }
    
	public QAFWebElement getFull_recipe() {
		return full_recipe;
	}
	public QAFWebElement getTitle() {
		return title;
	}
	public QAFWebElement getNotes() {
		return notes;
	}
	public QAFWebElement getRecipe_day_title() {
		return recipe_day_title;
	}

	public QAFWebElement getServe() {
		return serve;
	}
	public QAFWebElement getServe_keys() {
		return serve_keys;
	}
	public QAFWebElement getDone_serve() {
		return done_serve;
	}
	public QAFWebElement getIngredient() {
		return ingredient;
	}
}
