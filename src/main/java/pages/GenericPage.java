package pages;


import utils.elements.Elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author federico on 02/05/17.
 * @email fede.larregle@gmail.com
 */
public class GenericPage {

    private final static GenericPage instance;
    private final List<Elements> elements;

    static {
        instance = new GenericPage();
    }

    private GenericPage() {
        elements = new ArrayList<>();
    }

    public static GenericPage createInstace() {
        return instance;
    }

    public void addElement(Elements element) { elements.add(element); }

    public List<Elements> getElements() { return Collections.unmodifiableList(elements); }
}
