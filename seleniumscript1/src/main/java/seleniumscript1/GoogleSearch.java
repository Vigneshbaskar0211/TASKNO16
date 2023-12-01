package seleniumscript1;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

  public class GoogleSearch {

		    public static void main(String[] args) {
		       
		        // Create a Firefox browser instance
		        WebDriver driver = new FirefoxDriver();

		        // Maximize the browser window
		        driver.manage().window().maximize();

		        // Navigate to Google
		        driver.get("http://google.com");

		        // Print the URL of the current page
		        System.out.println("Current URL: " + driver.getCurrentUrl());

		        // Reload the page
		        driver.navigate().refresh();

		        // Close the browser
		        driver.quit();


	}

}
