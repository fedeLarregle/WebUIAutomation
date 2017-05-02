package pages;

/**
 * @author federico on 02/05/17.
 * @email fede.larregle@gmail.com
 */
public interface Page <P extends Page> {

    P createInstance();
}
