package selenium_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  
  public class First_selenium_demo {  
	  	    public static void main(String[] args) {  
	        
	   // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "F:\\chrome driver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
	    driver.navigate().to("http://www.google.com/");  
	    
	    driver.findElement(By.name("q")).sendKeys("Devops");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    
	    
	    
	    
	    }  
	  
	}  
