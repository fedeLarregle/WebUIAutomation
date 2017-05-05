package utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static utils.drivers.DriverFactory.Location.LOCAL;

/**
 * Singleton class for WebDriver creation
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

    /**
     * Sets the browser's type
     * @param browser
     * @return
     */
    public DriverFactory setBrowser(Drivers browser) {
        instance.browser = browser;
        return instance;
    }

    /**
     * Sets if the browser it's local or not
     * @param location
     * @return
     */
    public DriverFactory setBrowserLocation(Location location) {
        instance.location = location;
        return instance;
    }

    /**
     * Retrieves the specific WebDriver implementation
     * @return
     */
    public WebDriver createDriverInstance() {

        if ( (instance.browser == null) ) {
            throw new IllegalArgumentException("Browser null");
        }

        if ( (instance.location == null) ) {
            throw new IllegalArgumentException("Location null");
        }

        switch (instance.browser) {
            case CHROME: {
                return instance.location.equals(LOCAL) ?  getLocalChromeDriver() : getRemoteChromeDriver();
            }
            case FIREFOX: {
                return instance.location.equals(LOCAL) ?  getLocalFirefoxDriver() : getRemoteFirefoxDriver();
            }
            case EXPLORER: {
                return instance.location.equals(LOCAL) ? getLocalExplorerDriver() : getRemoteExplorerDriver();
            }
            default: {
                return null;
            }
        }

    }

    /**
     * Retrieves a local ChromeDriver instance
     * @return ChromeDriver
     */
    private static ChromeDriver getLocalChromeDriver() { return null; }

    /**
     * Retrieves a local FirefoxDriver instance
     * @return FirefoxDriver
     */
    private static FirefoxDriver getLocalFirefoxDriver() { return null; }

    /**
     * Retrieves a local InternetExplorerDriver instance
     * @return InternetExplorerDriver
     */
    private static InternetExplorerDriver getLocalExplorerDriver() { return null; }

    /**
     * Retrieves a remote ChromeDriver instance
     * @return ChromeDriver
     */
    private static ChromeDriver getRemoteChromeDriver() { return null; }

    /**
     * Retrieves a remote FirefoxDriver instance
     * @return FirefoxDriver
     */
    private static FirefoxDriver getRemoteFirefoxDriver() { return null; }

    /**
     * Retrieves a remote InternetExplorerDriver instance
     * @return InternetExplorerDriver
     */
    private static InternetExplorerDriver getRemoteExplorerDriver() { return null; }


    public enum Drivers {
        CHROME, FIREFOX, EXPLORER
    }

    public enum Location {
        LOCAL, REMOTE
    }

}
