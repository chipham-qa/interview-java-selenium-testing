package interview.coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class HandleBrokenLinks {
    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "src/test/java/interview/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the web page containing the links
        driver.get("https://www.facebook.com/login");

        // Find all the links on the web page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Loop through each link and check if it is broken
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                try {
                    // Create a HttpURLConnection object and open a connection to the URL
                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

                    // Set the request method to HEAD
                    connection.setRequestMethod("HEAD");

                    // Get the response code
                    int responseCode = connection.getResponseCode();

                    // Check if the response code indicates a broken link
                    if (responseCode >= 400) {
                        System.out.println(url + " is a broken link!");
                    } else {
                        System.out.println(url + " is a valid link.");
                    }
                } catch (Exception e) {
                    System.out.println(url + " is a broken link!");
                }
            } else {
                System.out.println("Invalid URL for the link: " + link.getText());
            }
        }

        // Close the browser
        driver.quit();
    }
}






