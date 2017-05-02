package utils.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author federico on 02/05/17.
 * @email fede.larregle@gmail.com
 */
public class Locators extends By{

    private static final Locators instance;

    static {
        instance = new Locators();
    }

    private Locators() {

    }

    public Locators getInstance() { return instance; }

    @Override
    public List<WebElement> findElements(SearchContext searchContext) {
        return null;
    }
}
