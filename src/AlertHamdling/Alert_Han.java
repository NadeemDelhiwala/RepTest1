/**
 * 
 */
package AlertHamdling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Nadeem
 *
 */
public class Alert_Han {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium data\\jars backup\\chr\\chromedriver.exe");
		WebDriver _cd1=new ChromeDriver();
       //WebDriver _cd1=new FirefoxDriver();
       _cd1.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
       _cd1.findElement(By.id("loginbutton")).click();
       Thread.sleep(2000);
       //Handling alert
       Alert _alert=_cd1.switchTo().alert();
       //Get the message on the alert
       System.out.println(_alert.getText());
       
       //Accept the alert 
       _alert.accept();
       //usernameId
       _cd1.findElement(By.id("usernameId")).sendKeys("NadeemDelh");
       _cd1.findElement(By.id("loginbutton")).click();
       _alert=_cd1.switchTo().alert();
       Thread.sleep(2000);
       System.out.println(_alert.getText());
       _alert.dismiss();
       _cd1.quit();
	}

}
