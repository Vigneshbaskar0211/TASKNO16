package seleniumscript1;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Wikipedia {
		    public static void main(String[] args) throws InterruptedException {

		        // Initialize Chrome browser
		        WebDriver driver = new ChromeDriver();
		        
		        //Maximize the window
		        driver.manage().window().maximize();

		        // Navigate to Wikipedia
		        driver.get("https://www.wikipedia.org/");

		        // Find the search input element and enter the query
		        WebElement searchInput = driver.findElement(By.id("searchInput"));
		        searchInput.sendKeys("Artificial Intelligence");
		        searchInput.sendKeys(Keys.RETURN);

		        // Wait for search results to load
                    Thread.sleep(5000);
                 
		        // Click on the "History" section
		        WebElement historySection = driver.findElement(By.xpath("//span[text()='History']"));
		        historySection.click();

		        // Get and print the title of the History section
		        WebElement titleElement = driver.findElement(By.id("firstHeading"));
		        String title = titleElement.getText();
		        System.out.println("Title of the History section: " + title);

		        // Close the browser
		        driver.quit();
		    }
		}
