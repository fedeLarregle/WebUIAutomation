package pages;

import org.openqa.selenium.By;

import java.util.List;

/**
 * @author federico on 02/05/17.
 * @email fede.larregle@gmail.com
 */
public class GenericPage<B extends By> extends Page<B> {


    @Override
    public B GetElement() {
        return null;
    }

    @Override
    public List<B> getElements() {
        return null;
    }
}
