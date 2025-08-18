package week1.day2;

public class Browser {
	
	public void launchBrowser(String browserName)
	{
		System.out.println("browserName is " +browserName);
	}

	public void loadUrl()
	{
		System.out.println("Url loaded successfully");
	}
	
	public static void main(String[] args) {
		
		Browser browsing = new Browser();
		browsing.launchBrowser("edge");
		browsing.loadUrl();
					

	}

}
