package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author federico on 02/05/17.
 * @email fede.larregle@gmail.com
 */
public interface PageInteface<B extends By, W extends WebElement> {

    W getElement(B locator);
    List<W> getElements(B locator);
}
