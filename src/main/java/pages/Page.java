package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author federico on 03/05/17.
 * @email fede.larregle@gmail.com
 */
public abstract class Page<B extends By, W extends WebElement> implements PageInteface<B, W>{

    protected final WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

}
