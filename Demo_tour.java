package project;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Demo_tour {

	public static void main(String[] args) throws InterruptedException, IOException
 {

                 //Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desktop\\Selenium_jar\\chromedriver.exe");
		WebDriver w = new ChromeDriver();

                //Open URL
		w.get("http://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(2000);

		// Selenium

		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);

		w.findElement(By.linkText("Radio & Checkbox Demo")).click();
		w.manage().window().maximize();

		// clicking radio button
		w.findElement(By.id("vfb-7-2")).click();

		// clicking checkboxes
		w.findElement(By.id("vfb-6-0")).click();
		w.findElement(By.id("vfb-6-2")).click();

		Thread.sleep(1000);
		w.navigate().back();

		// for upload file again to selenium
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();

		Thread.sleep(2000);

		// clicking upload file option
		w.findElement(By.linkText("File Upload")).click();
		w.manage().window().maximize();

		Thread.sleep(1000);

		// choose image
		w.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Dell\\Pictures\\image.jpg");

		Thread.sleep(1000);

		// chechbox
		w.findElement(By.id("terms")).click();

		w.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);

		w.navigate().back();

		// drag and drop action
		w.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();

		Thread.sleep(2000);

		w.findElement(By.linkText("Drag and Drop Action")).click();

		Thread.sleep(3000);

		w.manage().window().maximize();

		Actions a = new Actions(w);

		WebElement bank = w.findElement(By.partialLinkText("BANK"));
		WebElement drop1 = w.findElement(By.xpath(
				"//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
		a.dragAndDrop(bank, drop1).build().perform();

		WebElement amt = w.findElement(By.xpath(
				"//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		WebElement drop2 = w.findElement(By.xpath(
				"//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
		a.dragAndDrop(amt, drop2).build().perform();

		WebElement sales = w.findElement(By.partialLinkText("SALES"));
		WebElement drop3 = w.findElement(By.xpath(
				"//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
		a.dragAndDrop(sales, drop3).build().perform();

		WebElement amt2 = w.findElement(By.xpath(
				"//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
		WebElement drop4 = w.findElement(By.xpath(
				"//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
		a.dragAndDrop(amt2, drop4).build().perform();

		w.navigate().back();

		// insurance register

		w.findElement(By.linkText("Insurance Project")).click();

		Thread.sleep(2000);

		w.findElement(By.linkText("Register")).click();

		Select s = new Select(w.findElement(By.id("user_title")));

		s.selectByValue("Ms");

		w.findElement(By.id("user_firstname")).sendKeys("Yogita");

		w.findElement(By.id("user_surname")).sendKeys("Badhe");

		w.findElement(By.id("user_phone")).sendKeys("9689145560");

		Select s1 = new Select(w.findElement(By.name("year")));

		s1.selectByValue("1996");

		Select s2 = new Select(w.findElement(By.name("month")));

		s2.selectByValue("4");

		Select s3 = new Select(w.findElement(By.name("date")));

		s3.selectByValue("9");

		w.findElement(By.id("licencetype_t")).click();

		Select s4 = new Select(w.findElement(By.id("user_licenceperiod")));
		s4.selectByValue("2");

		Select s5 = new Select(w.findElement(By.id("user_occupation_id")));
		s5.selectByValue("12");

		w.findElement(By.id("user_address_attributes_street")).sendKeys("Karjod");

		w.findElement(By.id("user_address_attributes_city")).sendKeys("Jalgaon");

		w.findElement(By.id("user_address_attributes_county")).sendKeys("India");

		w.findElement(By.id("user_address_attributes_postcode")).sendKeys("425508");

		w.findElement(By.id("user_user_detail_attributes_email")).sendKeys("ybadhe0990@gmail.com");

		w.findElement(By.id("user_user_detail_attributes_password")).sendKeys("Yogita@198");

		w.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("Yogita@198");

		w.findElement(By.name("submit")).click();

		Thread.sleep(2000);

		w.findElement(By.name("email")).sendKeys("ybadhe0990@gmail.com");
		w.findElement(By.id("password")).sendKeys("Yogita@198");
		w.findElement(By.name("submit")).click();
		Thread.sleep(2000);

		w.findElement(By.xpath("//body/div[3]/form[1]/input[1]")).click();

		w.navigate().back();

		Thread.sleep(2000);
		w.findElement(By.linkText("New Tours")).click();

		// Agile project

		w.findElement(By.linkText("Agile Project")).click();
		w.findElement(By.name("uid")).sendKeys("1303");
		w.findElement(By.name("password")).sendKeys("Guru99");
		w.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);

		w.findElement(By.linkText("Mini Statement")).click();
		Select s6 = new Select(w.findElement(By.name("accountno")));
		s6.selectByVisibleText("3309");
		Thread.sleep(2000);
		w.findElement(By.name("AccSubmit")).click();
		Thread.sleep(2000);
		w.findElement(By.linkText("Home")).click();

		w.findElement(By.linkText("Log out")).click();
		Alert al = w.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		w.findElement(By.linkText("New Tours")).click();

		/*
		 * bank project
		 * 
		 * w.findElement(By.linkText("Bank Project")).click();
		 * 
		 * w.navigate().back();
		 */

		// security project

		w.findElement(By.linkText("Security Project")).click();
		w.findElement(By.name("uid")).sendKeys("1303");
		w.findElement(By.name("password")).sendKeys("Guru99");
		w.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);

		w.findElement(By.linkText("Balance Enquiry")).click();
		Select s7 = new Select(w.findElement(By.name("accountno")));
		s7.selectByVisibleText("3309");
		w.findElement(By.name("AccSubmit")).click();
		Thread.sleep(2000);
		w.findElement(By.linkText("Home")).click();

		w.findElement(By.linkText("Contact Us")).click();
		w.findElement(By.name("name")).sendKeys("Yogita");
		w.findElement(By.name("emailid")).sendKeys("ybadhe0990@gmail.com");
		w.findElement(By.name("telephoneno")).sendKeys("9689145560");
		w.findElement(By.name("addr")).sendKeys("Jalgaon");
		w.findElement(By.id("fileToUpload")).sendKeys("C:\\Users\\Dell\\Pictures\\Form.jpg");
		Thread.sleep(2000);
		w.findElement(By.name("sub")).click();
		w.findElement(By.linkText("Home")).click();

		w.findElement(By.linkText("Log out")).click();
		Alert a1 = w.switchTo().alert();
		Thread.sleep(2000);
		a1.accept();
		Thread.sleep(2000);
		w.findElement(By.linkText("New Tours")).click();

		// telecom project

		w.findElement(By.linkText("Telecom Project")).click();
		Thread.sleep(2000);

		// add customer
		w.findElement(By.linkText("Add Customer")).click();
		w.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		w.findElement(By.id("fname")).sendKeys("Yogita");
		w.findElement(By.id("lname")).sendKeys("Badhe");
		w.findElement(By.id("email")).sendKeys("ybadhe0990@gmail.com");
		w.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Jalgaon");
		w.findElement(By.id("telephoneno")).sendKeys("9689145560");
		w.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("//body/section[@id='main']/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();

		// add traffic plan to customer
		w.findElement(By.xpath("//body/section[@id='one']/div[1]/div[1]/div[2]/h3[1]/a[1]")).click();
		w.findElement(By.id("customer_id")).sendKeys("675992");
		w.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) w;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");

		w.findElement(By.xpath("//body/span[@id='header']/nav[1]/a[1]")).click();
		w.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(2000);

		w.findElement(By.linkText("Add Tariff Plan")).click();
		Thread.sleep(1000);
		w.findElement(By.id("rental1")).sendKeys("100");
		w.findElement(By.id("local_minutes")).sendKeys("30");
		w.findElement(By.id("inter_minutes")).sendKeys("30");
		w.findElement(By.id("sms_pack")).sendKeys("100");
		w.findElement(By.id("minutes_charges")).sendKeys("1");
		w.findElement(By.id("inter_charges")).sendKeys("1");
		w.findElement(By.id("sms_charges")).sendKeys("1");
		Thread.sleep(2000);
		w.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//body/section[@id='main']/div[1]/ul[1]/li[1]/a[1]")).click();

		w.findElement(By.xpath("//body/section[@id='one']/div[1]/div[3]/div[2]/h3[1]/a[1]")).click();
		w.findElement(By.id("customer_id")).sendKeys("675992");
		Thread.sleep(1000);
		w.findElement(By.name("submit")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) w;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js1.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(2000);
		w.findElement(By.xpath("//body/span[@id='header']/nav[1]/a[1]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		w.findElement(By.linkText("New Tours")).click();

		// payment gateway
		w.findElement(By.linkText("Payment Gateway Project")).click();
		Thread.sleep(2000);

		// generate card no
		w.findElement(By.xpath("//header/div[1]/nav[1]/a[2]")).click();
		Thread.sleep(2000);
		// scrolling
		JavascriptExecutor j1 = (JavascriptExecutor) w;
		j1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		j1.executeScript("window.scrollBy(0, -3000)");
		Thread.sleep(2000);
		// window handling
		Set<String> windows = w.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String p = it.next();
		String c = it.next();
		w.switchTo().window(c);
		Thread.sleep(2000);
		w.switchTo().window(p);

		// buy now
		w.findElement(By.xpath("//header/div[1]/nav[1]/a[1]")).click();
		Thread.sleep(2000);
		Select s8 = new Select(
				w.findElement(By.xpath("//body/section[@id='three']/div[1]/form[1]/div[1]/div[4]/select[1]")));
		s8.selectByVisibleText("2");

		// card details

		w.findElement(By.xpath("//body/section[@id='three']/div[1]/form[1]/div[1]/div[8]/ul[1]/li[1]/input[1]"))
				.click();
		w.findElement(By.id("card_nmuber")).sendKeys(" 4203620543500534");
		Select s9 = new Select(w.findElement(By.id("month")));
		s9.selectByValue("8");

		Select s10 = new Select(w.findElement(By.id("year")));
		s10.selectByValue("2022");

		w.findElement(By.id("cvv_code")).sendKeys("900");

		w.findElement(By.name("submit")).click();

		// screen shot

		TakesScreenshot t = (TakesScreenshot) w;
		File src = t.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("F:\\Testing Class\\Screenshot\\1.jpg"));

		// back to home page

		w.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

		// check credit card limit

		w.findElement(By.xpath("//header/div[1]/nav[1]/a[3]")).click();
		w.findElement(By.id("card_nmuber")).sendKeys("4950094614838535");
		w.findElement(By.xpath("//body/section[@id='three']/div[1]/form[1]/div[1]/div[6]/input[1]")).click();

		// scrolling

		JavascriptExecutor j = (JavascriptExecutor) w;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0, -3000)");
		Thread.sleep(2000);

		// new tours
		w.findElement(By.linkText("New Tours")).click();

		// login and logout

		w.findElement(By.name("userName")).sendKeys("test");
		w.findElement(By.name("password")).sendKeys("test");
		w.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		w.findElement(By.linkText("SIGN-OFF")).click();

		// register

		w.findElement(By.linkText("REGISTER")).click();
		w.findElement(By.name("firstName")).sendKeys("Yogita");
		w.findElement(By.name("lastName")).sendKeys("Badhe");
		w.findElement(By.name("phone")).sendKeys("9689145560");
		w.findElement(By.name("userName")).sendKeys("ybadhe0990@gmail.com");
		w.findElement(By.name("address1")).sendKeys("Karjod");
		w.findElement(By.name("city")).sendKeys("Jalgaon");
		w.findElement(By.name("state")).sendKeys("Maharashtra");
		w.findElement(By.name("postalCode")).sendKeys("425508");
		Select se = new Select(w.findElement(By.name("country"))); // dropdown
		se.selectByValue("INDIA"); // drop down choice selection
		w.findElement(By.name("email")).sendKeys("ybadhe0990@gmail.com");
		w.findElement(By.name("password")).sendKeys("Yogita@198");
		w.findElement(By.name("confirmPassword")).sendKeys("Yogita@198");
		Thread.sleep(2000);
		w.findElement(By.name("submit")).click();
		w.findElement(By.linkText("Home")).click();

		// flight

		w.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
		Select se1 = new Select(w.findElement(By.name("passCount")));
		se1.selectByValue("2");
		Select se2 = new Select(w.findElement(By.name("fromPort")));
		se2.selectByIndex(3);
		Select se3 = new Select(w.findElement(By.name("fromMonth")));
		se3.selectByVisibleText("April");
		Select se4 = new Select(w.findElement(By.name("fromDay")));
		se4.selectByIndex(2);
		Select se5 = new Select(w.findElement(By.name("toPort")));
		se5.selectByValue("Paris");
		Select se6 = new Select(w.findElement(By.name("toMonth")));
		se6.selectByIndex(4);
		Select se7 = new Select(w.findElement(By.name("toDay")));
		se7.selectByValue("6");
		w.findElement(By.xpath("//tbody/tr[9]/td[2]/font[1]/font[1]/input[2]")).click();
		Select se8 = new Select(w.findElement(By.name("airline")));
		se8.selectByVisibleText("Blue Skies Airlines");
		Thread.sleep(2000);
		w.findElement(By.name("findFlights")).click(); // continue
		w.findElement(By.xpath("//tbody/tr[2]/td[1]/a[1]/img[1]")).click(); // back home page button

	}

}
