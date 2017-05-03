package pages;

import org.openqa.selenium.By;

import java.util.List;

/**
 * @author federico on 02/05/17.
 * @email fede.larregle@gmail.com
 */
public interface PageInteface<B extends By> {

    B GetElement();
    List<B> getElements();
}
