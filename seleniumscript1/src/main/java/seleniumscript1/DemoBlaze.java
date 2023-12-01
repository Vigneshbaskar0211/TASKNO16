package seleniumscript1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) throws InterruptedException {
		
        // Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();
		
        // Navigate to Google
           driver.get("https://www.demoblaze.com/");
            
           // Maximize the browser window
        driver.manage().window().maximize();
 
		//manage the syncrhonization with 
		Thread.sleep(5000);//pause script for 5 seconds
		
      
//		Verify if the title of page is same or not 
		if(driver.getTitle().equals("STORE")) {
			System.out.println("Page landed on correct website...");
		}else {
			System.out.println("Page not landed on correct website...");
		}
        
		driver.quit();

	}

}
