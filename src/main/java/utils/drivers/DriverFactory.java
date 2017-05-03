package utils.drivers;

/**
 * @author federico on 02/05/17.
 * @email fede.larregle@gmail.com
 */
public class DriverFactory {

    private static final DriverFactory instance;
    private Location location;
    private Drivers browser;

    static {
        instance = new DriverFactory();
    }

    private DriverFactory() {}

    public static DriverFactory getInstance() { return instance; }

    public DriverFactory setBrowser(Drivers browser) {
        this.browser = browser;
        return this;
    }

    public DriverFactory setBrowserLocation(Location location) {
        this.location = location;
        return this;
    }

    public enum Drivers {
        CHROME, FIREFOX, EXPLORER
    }

    public enum Location {
        LOCAL, REMOTE
    }

}
