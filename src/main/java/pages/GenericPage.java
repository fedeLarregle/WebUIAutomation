package pages;

import org.openqa.selenium.WebDriver;
import utils.elements.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * @author federico on 02/05/17.
 * @email fede.larregle@gmail.com
 */
public class GenericPage {

    private GenericPage page;
    private final List<Elements> elements;

    private GenericPage(WebDriver driver) {
        elements = new ArrayList<>();
    }

    public synchronized GenericPage createInstace(WebDriver driver) {

        return page == null ? new GenericPage(driver) : page;
    }
}
