package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Chrome webdriver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    /*ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			//options.addArguments("disable-infobars");
			//options.addArguments("--incognito");
			//options.addArguments("--ignore-certificate-errors");
	       // options.addArguments("--disable-popup-blocking");
			WebDriver driver = new ChromeDriver(options);*/
		    
		 driver.get ("https://demo.opencart.com/index.php?route=account/login");
		 
		 //Register User
		 	WebElement Account;
			Account = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
			Account.click();
			Thread.sleep(200);
		 	WebElement Register = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
			Account.click();
			Thread.sleep(2000);
			
			WebElement FName = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
			FName.sendKeys("Test");;
			Thread.sleep(200);
			WebElement LName = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
			LName.sendKeys("User");;
			Thread.sleep(200);
			WebElement Email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
			Email.sendKeys("TestUser@gmail.com");;
			Thread.sleep(200);
			WebElement Phone = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
			Phone.sendKeys("03009287654");;
			Thread.sleep(200);
			WebElement Pass = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
			Pass.sendKeys("12345");;
			Thread.sleep(200);
			WebElement Pass1 = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
			Pass1.sendKeys("12345");;
			Thread.sleep(200);
			
			
			//*[@id="top-links"]/ul/li[2]/ul/li[1]/a
			
		 
		    
		    // Get element by id
		 
		 //LOgin and Order Placement
		    
		    WebElement username;
			username = driver.findElement(By.id("input-email"));
			username.sendKeys("mytc5@gmail.com");
			
			WebElement pass = driver.findElement(By.id("input-password"));
			pass.sendKeys("123456789");
			
			WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
			loginButton.click(); 
			
			WebElement search = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
			search.sendKeys("HP LP3065");
			
			WebElement searchC = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
			searchC.click();
			
			Thread.sleep(50);

			WebElement openfilter1  = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			System.out.println("test check");
			jse.executeScript("arguments[0].scrollIntoView()", openfilter1);
			System.out.println("test");
			openfilter1.click();
			Thread.sleep(2000);
			
			WebElement EnterQuantity  = driver.findElement(By.id("input-quantity"));
			//JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView()", EnterQuantity);
			Thread.sleep(3000);
			EnterQuantity.clear();
			EnterQuantity.sendKeys("2");
			
			Thread.sleep(200);
			
			WebElement AddToCart = driver.findElement(By.id("button-cart"));
			AddToCart.click();
			Thread.sleep(5000);

			WebElement viewCart = driver.findElement(By.id("cart-total"));
			viewCart.click();
			Thread.sleep(2000);
			
			WebElement checkOut = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"));
			checkOut.click();
			Thread.sleep(2000);
		
			WebElement select = driver.findElement(By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[1]/label"));
			select.click();
			Thread.sleep(5000);
			
			WebElement ContinueOrder= driver.findElement(By.id("button-payment-address"));
			 ContinueOrder.click();
			 Thread.sleep(5000);
			 
			 WebElement ContinueOrder1= driver.findElement(By.id("button-shipping-address"));
			 ContinueOrder1.click();
			 Thread.sleep(5000);
			 
			 WebElement ContinueOrder2= driver.findElement(By.id("button-shipping-method"));
			 ContinueOrder2.click();
			 Thread.sleep(5000);
			 
			 WebElement Terms= driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]"));
			Terms.click();
			 Thread.sleep(2000);
			 
			 WebElement ContinueOrder3= driver.findElement(By.id("button-payment-method"));
			 ContinueOrder3.click();
			 Thread.sleep(5000); 
			 
			 WebElement ConfirmOrder= driver.findElement(By.id("button-confirm"));
			 ConfirmOrder.click();
			 Thread.sleep(5000);
			 WebElement Confirm= driver.findElement(By.id("content"));
			 Confirm.click();
			 Thread.sleep(5000);
			 
			 WebElement ConfirmFinal= driver.findElement(By.id("content"));
			 ConfirmFinal.click();
			 Thread.sleep(5000);
			 
			 //Assert Order verification
			 
			 String actualpagetitle = "";
				String expectedTitle = "Your order has been placed!";
				actualpagetitle  = driver.getTitle();
			
				System.out.println(actualpagetitle);
				
				if (actualpagetitle.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		            
		            Thread.sleep(2000);
		            
		            
		            
			 
		            
		
			//jse.executeScript("window.scrollBy(0,10000)");
			
			
			
			
			//WebElement Cart = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"));
			//Cart.click();
			
			//*[@id="content"]/div[3]/div/div/div[2]/div[2]/button[1]
			
		//	WebElement openfilter  = driver.findElement(By.xpath("//i[@onclick='AddNewLeadSourceAction()']"));
			//WebElement openfilter  = driver.findElement(By.xpath("//*[contains(text(), '" + BOOK NOW + "')]")));
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Voice Connected')]")));
			
		    
		    // with Name
		    
		  /*  WebElement username;
			username = driver.findElement(By.name("email"));
			username.sendKeys("mytc5@gmail.com");
			
			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("123456789");
			
			WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
			loginButton.click();
			
			// Assert get Test Pass
			
			String actualpagetitle = "";
			String expectedTitle = "My Account";
			actualpagetitle  = driver.getTitle();
		
			System.out.println(actualpagetitle);
			
			if (actualpagetitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
			
			// Assert get Test Failed
			
			String actualpagetitle1 = "";
			String expectedTitle1 = "My Test";
			
			actualpagetitle1  = driver.getTitle();
					
			System.out.println(actualpagetitle1);
						
				if (actualpagetitle1.contentEquals(expectedTitle1)){
		            System.out.println("Test Passed!");
			        } else {
		            System.out.println("Test Failed");
			        }
			
			//	Logout
				
			/*	String url = "";
				url = driver.getCurrentUrl();
				System.out.println(url);
				
				if (actualpagetitle.contains("Account")){
		            System.out.println("URL Test Passed!");
		        } else {
		            System.out.println("URL Test Failed");
		        }
				*/
		/*    driver.get ("https://qatestid12.wixsite.com/qaspecialist");
		    
		    WebDriverWait wait2 = new WebDriverWait(driver,100);
		    wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"comp-ifgtula74label\"]")));
		    
		    WebElement Contact;
			Contact = driver.findElement(By.xpath("//*[@id=\"comp-ifgtula74label\"]"));
			Contact.click();
			WebElement UserName = driver.findElement(By.id("comp-jhrgftz1input"));
			UserName.sendKeys("Saman");
			
			WebElement info = driver.findElement(By.id("comp-jhrggrufinput"));
			info.sendKeys("saman.qasim3@gmail.com");
			
			WebElement PhNum = driver.findElement(By.id("comp-jhrgh32ainput"));
			PhNum.sendKeys("03001234567");
			
			WebElement details = driver.findElement(By.id("comp-jhrgftz1input"));
			details.sendKeys("Hello in 1st day of selenium Automation Training");
			
			WebElement submit = driver.findElement(By.id("comp-jhrgk2pstextarea"));
			submit.click();
			
			// WebDriverWait wait3 = new WebDriverWait(driver,50);
			  //wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"comp-jhrgftz1input\"]")));
			    
			
			Thread.sleep(2000);*/
			
			//driver.close();
			//driver.quit();
		    
	}

}
}
