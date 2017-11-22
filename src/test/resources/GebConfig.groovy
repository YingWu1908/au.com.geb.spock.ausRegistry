
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver

import static org.openqa.selenium.remote.DesiredCapabilities.firefox


waiting {
    timeout = 5
}

environments {

    // run via “./gradlew chromeTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    // run via “./gradlew chromeHeadlessTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chrome {
        driver = {
            ChromeOptions o = new ChromeOptions()
            System.setProperty("webdriver.chrome.driver",
                    new File("E:\\Helen\\selenium\\Chromedriver\\Chromedriver.exe").getAbsolutePath())
            o.addArguments("--start-maximized")
            new ChromeDriver(o)
        }
    }

    // run via “./gradlew firefoxTest”
    // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
    firefox {
        atCheckWaiting = 1
        driver = {
            System.setProperty("webdriver.gecko.driver",
                    new File("E:\\Helen\\selenium\\geckodriver.exe").getAbsolutePath())
            System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")
            new FirefoxDriver()
        }
    }

    reports {
        destinationDir = file("$buildDir/reports/tests/chromeTest")
    }
}
// To run the tests with all browsers just run “./gradlew test”

baseUrl = "https://www.ausregistry.com.au/"

//reports dir

