package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class que1_task1 {
	public static void main(String[] args)
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(co);
	
	driver.navigate().to("https://www.amazon.in/Fire-Boltt-Bluetooth-Calling-Assistance-Resolution/dp/B0BF57RN3K/ref=pd_ci_mcx_mh_mcx_views_0?pd_rd_w=HEN0A&content-id=amzn1.sym.7938e11a-362b-421f-bd30-8dd8d3c4b65f&pf_rd_p=7938e11a-362b-421f-bd30-8dd8d3c4b65f&pf_rd_r=VK61XB3RB88G44WSWY3T&pd_rd_wg=IQjlG&pd_rd_r=bcfacb18-9502-4e53-8f7c-9aae9bac8984&pd_rd_i=B0BF57RN3K&th=1");
	WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
	addtocart.click();
	WebElement check = driver.findElement(By.xpath("//*[@class=\"a-button-input\"]"));
	check.click();
	
	driver.navigate().to("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
	WebElement qty = driver.findElement(By.id("a-autoid-0-announce"));
	qty.click();
	WebElement dty = driver.findElement(By.id("quantity_10"));
	dty.click();
	
	WebElement update = driver.findElement(By.id("a-autoid-1-announce"));
	update.click();
	
	driver.navigate().to("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
	WebElement del = driver.findElement(By.xpath("//*[@class=\"a-color-link\"]"));
	del.click();
	
	
	
	
	
	
	
	
	

	
	}
}
