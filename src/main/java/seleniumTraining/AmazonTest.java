package seleniumTraining;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtils btUtils = new BrowserUtils();

		btUtils.initiDriver("chrome");

		btUtils.launchUrl("https://www.amazon.com");
		
		String title =btUtils.getTitle();
		System.out.println(title);
		if(title.contains("amazon")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("InCorrect title");
		}
		
		System.out.println(btUtils.getCurrenturl());
		
		btUtils.quitBrowser();
	}

}
