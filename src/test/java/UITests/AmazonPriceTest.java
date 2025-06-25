package UITests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
//import UITests.AmazonSearchPage;

import pages.AmazonSearchPage;

import java.util.Collections;
import java.util.Map;

public class AmazonPriceTest {
    WebDriver driver;
    AmazonSearchPage searchPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        searchPage = new AmazonSearchPage(driver);
        driver.navigate().refresh();
    }

    @Test(enabled = false)
    public void checkLowestAndHighestPrice() {
        searchPage.searchProduct("watches");
        searchPage.waitForElement1();
//        searchPage.scroll();
        searchPage.selectBrandFilter();
        searchPage.waitforElement2();
        searchPage.scrollTodown();

        Map<String, Integer> productMap = searchPage.fetchProductPriceMap();

        if (productMap.isEmpty()) {
            System.out.println("No products found!");
            return;
        }

        String lowProduct = Collections.min(productMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        String highProduct = Collections.max(productMap.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println("Lowest Price Product: " + lowProduct + " - ₹" + productMap.get(lowProduct));
        System.out.println("Highest Price Product: " + highProduct + " - ₹" + productMap.get(highProduct));
    }
    
    @Test
    public void selectAllFilters() {
    	 searchPage.searchProduct("watches");
         searchPage.selectPrimeFilter();
         searchPage.selectBrandFilter();
         searchPage.selectTopBrandFilter();
         searchPage.selectLeatherFilter();
    	
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }
}
