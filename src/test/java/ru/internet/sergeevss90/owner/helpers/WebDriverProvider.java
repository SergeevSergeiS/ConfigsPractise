package ru.internet.sergeevss90.owner.helpers;

import ru.internet.sergeevss90.owner.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Objects;
import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private final WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    public WebDriverProvider() {
    }

    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseUrl());
        return driver;
    }

    private WebDriver createWebDriver() {
        if (Objects.isNull(config.getRemoteUrl())) {
            if (config.getBrowser().equals(Browsers.FIREFOX.toString())) {
                return new FirefoxDriver();
            } else if (config.getBrowser().equals(Browsers.CHROME.toString())) {
                return new ChromeDriver();
            }
        } else {
            if (config.getBrowser().equals(Browsers.FIREFOX.toString())) {
                return new RemoteWebDriver(config.getRemoteUrl(), new ChromeOptions());
            } else if (config.getBrowser().equals(Browsers.CHROME.toString())) {
                return new RemoteWebDriver(config.getRemoteUrl(), new FirefoxOptions());
            }
        }
        throw new NullPointerException("No such browser");
    }


}
