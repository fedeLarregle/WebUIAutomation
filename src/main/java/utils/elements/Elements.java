package utils.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author federico on 03/05/17.
 * @email fede.larregle@gmail.com
 */
public class Elements {

    private final WebDriver driver;

    public Elements(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Returns a WebElement identified by a given {@link By}
     * @param b
     * @param <B>
     * @return
     */
    public <B extends By> WebElement getElement(B b) { return this.driver.findElement(b); }

    /**
     * Returns a List<WebElement> identified by a given {@link By}
     * @param b
     * @param <B>
     * @return
     */
    public <B extends By> List<WebElement> getElements(B b) { return this.driver.findElements(b); }


}
