package utils.drivers;

/**
 * @author federico on 02/05/17.
 * @email fede.larregle@gmail.com
 */
public class DriverFactory {

    public static final DriverFactory instance;

    static {
        instance = new DriverFactory();
    }

    private DriverFactory() {}

    public static DriverFactory getInstance() { return instance; }


    private enum Drivers {
        CHROME, FIREFOX, EXPLORER
    }

}
