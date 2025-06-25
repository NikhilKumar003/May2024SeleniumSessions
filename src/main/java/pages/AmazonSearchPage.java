package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class AmazonSearchPage {
    WebDriver driver;
    JavascriptExecutor js;
    
    

    public AmazonSearchPage(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor)driver;
    }

    By searchBox = By.id("twotabsearchtextbox");
    By titanBrandCheckbox = By.xpath("//span[text()='Titan']/preceding-sibling::div//i");
    By productNames = By.xpath("//div[@data-cy='title-recipe']/a");
    By productPrices = By.xpath("//span[@class='a-price']/span//span[2]");
    By deliver = By.xpath("//span[text()='Delivery Day']");
    By AmazonHeader = By.xpath("//div[@id='nav-subnav']/a[1]");
    By topBrandCheckBox = By.xpath("//span[text()='Top Brands']//preceding-sibling::div");
    By allPrimeCheckBox = By.xpath("//span[text()='Get It Today']/preceding-sibling::div");
    By leatherCheckBox = By.xpath("//span[text()='Nylon']/preceding-sibling::div");
    
    
    public void getElement(By locator) {
    	driver.findElement(locator).click();
    }
    public void scrollToElement(By locator) {
    	js.executeScript("arguments[0].scrollIntoView(true));", locator);
    }
    
    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchBox).submit();
    }
    public void waite(By ele) {
    	WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wt.until(ExpectedConditions.visibilityOfElementLocated(ele));
    }
    public void waitForElement1() {
    	waite(deliver);
    }
    public void waitforElement2() {
    	waite(AmazonHeader);
    }
    
    public void scroll(By loci) {
      js.executeScript("arguments[0].scrollIntoView(true)", loci);
    }
    public void scrollTodown() {
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
    }
    
    public void scorller() {
    	scroll(titanBrandCheckbox);
    }

    public void selectBrandFilter() {
        try {
            waite(titanBrandCheckbox);
            getElement(titanBrandCheckbox);
           } catch (Exception e) {
            System.out.println("Brand filter issue: " + e.getMessage());
        }
    }
    public void selectPrimeFilter() {
    try {
    	waite(allPrimeCheckBox);
    	getElement(allPrimeCheckBox);
        }catch (Exception e) {
        System.out.println("Prime filter issue: " + e.getMessage());
	    }
    }
    
    public void selectTopBrandFilter() {
        try {
        	
        	waite(topBrandCheckBox);
        	getElement(topBrandCheckBox);
        	scrollToElement(topBrandCheckBox);
        }catch (Exception e) {
            System.out.println("Prime filter issue: " + e.getMessage());
    	}
    }
    public void selectLeatherFilter() {
        try {
        	
        	waite(leatherCheckBox);
        	scrollToElement(leatherCheckBox);
        	getElement(leatherCheckBox);
        }catch (Exception e) {
            System.out.println("leather filter issue: " + e.getMessage());
    	}
    }
    

    public Map<String, Integer> fetchProductPriceMap() {
        List<WebElement> names = driver.findElements(productNames);
//        Iterator<WebElement> it = names.iterator();
//        while(it.hasNext()) {
//        	String prods = it.next().getText();
//        	System.out.println(prods);
//        }
        List<WebElement> prices = driver.findElements(productPrices);
//        Iterator<WebElement> its = prices.iterator();
//        while(its.hasNext()) {
//        	String prodses = its.next().getText();
//        	System.out.println(prodses);
//        }
        
//        System.out.println("products :"+prods+""+ prodses);
        Map<String, Integer> priceMap = new HashMap<>();
        for (int i = 0; i < Math.min(names.size(), prices.size()); i++) {
            String name = names.get(i).getText();
            String priceStr = prices.get(i).getText().replace(",", "").trim();
            try {
                int price = Integer.parseInt(priceStr);
                priceMap.put(name, price);
            } catch (NumberFormatException ignored) {}
        }
        return priceMap;
    }
}
