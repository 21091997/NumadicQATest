package PackOne;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TC01VerifyHeaderTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\"
				+ "Chromdriver win32\\Updated Chrome\\chromedriver_win32 "
				+ "(1)\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		Thread.sleep(3000);
					
			driver.manage().window().maximize();
			System.out.println("Browser is maximized");
				
		driver.get("https://jobs.numadic.com/jobs/Careers");
			System.out.println("Url is opened");
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			POMClassHeader header = new POMClassHeader(driver); 
			
			
			String expectedresult = "JOIN OUR CREW";
			String actualText = header.joinOurCrew();
			System.out.println("Expected text is " + expectedresult);
			if(expectedresult.equals(actualText))
			{
				System.out.println("Header Test case passed");
			}
			else
			
				System.out.println("Header Test case failed");
			
			
			header.filterByDropdown();
			System.out.println("filterby dropdown selected");
			Thread.sleep(3000);
			
			header.selectEng();
			System.out.println("Engneering option is selected");
			Thread.sleep(3000);
			
			header.qAEng();
			System.out.println("QA Engineer selected");
			Thread.sleep(3000);
			
			String expectedTitle = "Numadic Iot Pvt. Ltd. - QA Engineer in";
			String actualTitle = driver.getTitle();
			System.out.println("Expected title is " + expectedTitle);
			if(expectedTitle.equals(actualTitle))
			{
				System.out.println("title is correct=> test case passed");
			}
			else
			
				System.out.println("title is wrong=> test case failed");
			
			header.imInterested();
			System.out.println("clicked on im interested button");
			Thread.sleep(3000);
			
			header.enterFName();
			System.out.println("first name is entered");
			Thread.sleep(3000);
			
			header.enterLName();
			System.out.println("last name is entered");
			Thread.sleep(3000);
			
			header.enterEmail();
			System.out.println("email is entered");
			Thread.sleep(3000);
			
			header.entermobile();
			System.out.println("mobile no is entered");
			Thread.sleep(3000);
			
			header.enterCurrentEmployer();
			System.out.println("currant employer name is entered");
			Thread.sleep(3000);
			
			header.currentjobDropdown();
			System.out.println("current job Dropdown is clicked");
			Thread.sleep(3000);
			
			header.enterCurrentJobTitle();
			System.out.println("currant job title is entered");
			Thread.sleep(3000);
			
			header.enterSkill();
			System.out.println("skill is entered");
			Thread.sleep(3000);
			
			header.enterCurrantCTC();
			System.out.println("Currant CTC is entered");
			Thread.sleep(3000);
			
			header.enterExpectedCTC();
			System.out.println("Expected CTC is entered");
			Thread.sleep(3000);
			
			header.enternoticeperiod();
			System.out.println("notice period is entered");
			Thread.sleep(3000);
			
			System.out.println("EOP");
			
			
			driver.quit();
}
}