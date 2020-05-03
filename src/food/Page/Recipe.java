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

public class Recipe extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "recipe.search")
    private QAFWebElement recipe_section;
	
	@FindBy(locator = "banana_recipe.search")
	private QAFWebElement banana_recipe;
	
	@FindBy(locator = "dropdown.search")
	private QAFWebElement dropdown;
	
	@FindBy(locator = "trending.search")
	private QAFWebElement trending;
	
	@FindBy(locator = "trending_value.search")
	private QAFWebElement trending_value;

	@FindBy(locator = "recipe_of_day.search")
	private QAFWebElement recipe_of_day;
	
	@FindBy(locator = "mouse_over_recipe.search")
	private QAFWebElement mouse_over_recipe;
	
	@FindBy(locator = "share.search")
	private QAFWebElement share;
	
	@FindBy(locator = "share_close.search")
	private QAFWebElement share_close;
	
	@FindBy(locator = "recipe_day_main_page_title.search")
	private QAFWebElement recipe_day_main_page_title;
	
	@FindBy(locator = "search_recipe.search")
	private QAFWebElement search_recipe;
	
	@FindBy(locator = "message_recipe.search")
	private QAFWebElement message_recipe;
	
	@Override
    protected void openPage(PageLocator arg0, Object... arg1) {
    }
    public QAFWebElement getRecipeSection() {
        return recipe_section;
    }
    public QAFWebElement getBananaRecipe() {
        return banana_recipe;
    }
    public QAFWebElement getDropdown() {
        return dropdown;
    }
    public QAFWebElement getTrending() {
        return trending;
    }
    public QAFWebElement getTrending_value() {
		return trending_value;
	}
    public QAFWebElement getRecipe_of_day() {
		return recipe_of_day;
	}
    public QAFWebElement getMouse_over_recipe() {
		return mouse_over_recipe;
	}
    public QAFWebElement getShare() {
		return share;
	}
    public QAFWebElement getShare_close() {
		return share_close;
	}
    public QAFWebElement getRecipe_day_main_page_title() {
		return recipe_day_main_page_title;
	}
    public QAFWebElement getSearch_recipe() {
		return search_recipe;
	}
    public QAFWebElement getMessage_recipe() {
		return message_recipe;
	}
    
    
}
