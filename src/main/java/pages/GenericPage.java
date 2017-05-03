package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author federico on 02/05/17.
 * @email fede.larregle@gmail.com
 */
public class GenericPage<B extends By, W extends WebElement> extends Page<B, W> {


    public GenericPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public W getElement(By locator) {
        return null;
    }

    @Override
    public List<W> getElements(By locator) {
        return null;
    }
}
