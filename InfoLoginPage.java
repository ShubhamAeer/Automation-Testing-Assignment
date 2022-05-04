import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfoLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://bombaystudios.in/");

		// To Maximize the Window.
		driver.manage().window().maximize();

		// To Wait Foe 3 seconds.
		Thread.sleep(3000);

		// To Get current URL.
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("Before Login URL: - " + CurrentUrl);

		// To Title of the WebPage.
		String Title = driver.getTitle();
		System.out.println("Before Login Title: - " + Title);

		// To Click On Account Logo.
		driver.findElement(By.xpath("//i[@class='icon-user']")).click();
		
		//UI Testing.

		// To Click On Sign-in Tab Displayed And Working Or Not.
		Boolean SignInTab = driver.findElement(By.id("signin-tab")).isDisplayed();
		System.out.println("Sign-In Tab Is Displayed : - " + SignInTab);
		driver.findElement(By.id("signin-tab")).click();
		Boolean SignInTab1 = driver.findElement(By.id("signin-tab")).isEnabled();
		System.out.println("Sign-In Tab Is Clicked : - " + SignInTab1);

		// To Email-Address And Password Is Displayed And Working Or Not.
		Boolean EmailA = driver.findElement(By.xpath("//label[@for='singin-email']")).isDisplayed();
		System.out.println("Email-Address Tag Name Is Displayed : - " + EmailA);
		driver.findElement(By.id("singin-email")).click();
		Boolean EmailF = driver.findElement(By.id("singin-email")).isEnabled();
		System.out.println("Email-Address Field Is Clicked : - " + EmailF);
		
		//To Forgot Your Password Button Is Displayed Or Not.
		Boolean FLink = driver.findElement(By.xpath("//a[@class='forgot-link']")).isDisplayed();
		System.out.println("Forgot Your Password Button Is Displayed : - " + FLink);
		//To Google Login Button Is Displayed Or Not.
		Boolean GButton = driver.findElement(By.xpath("//a[@class='btn btn-login btn-g btn-google-login']")).isDisplayed();
		System.out.println("Google Login Button Is Displayed : - " + GButton);
		
		//To Facebook Login Button Is Displayed Or Not.
		Boolean FButton = driver.findElement(By.xpath("//a[@class='btn btn-login btn-f btn-facebook-login']")).isDisplayed();
		System.out.println("Facbook Login Button Is Displayed : - " + FButton);

		//To Designer Login Link Is Displayed Or Not.
		Boolean DButton = driver.findElement(By.xpath("//a[@href='https://bombaystudios.in/designer/login']")).isDisplayed();
		System.out.println("Designer Login Button Is Displayed : - " + DButton);
		
		// To Empty Email-Address And Password Field.
		driver.findElement(By.id("singin-email")).click();
		driver.findElement(By.id("singin-password")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary-2']")).click();
		String EmailE = driver.findElement(By.id("singin-email-error")).getText();
		System.out.println("Empty Email-Address (Error) : - " + EmailE);
		String PasswordE = driver.findElement(By.id("singin-password-error")).getText();
		System.out.println("Empty Password Field (Error): - " + PasswordE);

		// To Empty Email-Address And Valid Password.
		driver.findElement(By.id("singin-email")).clear();
		driver.findElement(By.id("singin-password")).clear();
		driver.findElement(By.id("singin-email")).click();
		driver.findElement(By.id("singin-password")).click();
		driver.findElement(By.id("singin-password")).sendKeys("ritikajain30");
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary-2']")).click();
		String EmptyEmailE = driver.findElement(By.id("singin-email-error")).getText();
		System.out.println("Empty Email-Address (Error) : - " + EmptyEmailE);

		// To Valid Email-Address And Empty Password.
		driver.findElement(By.id("singin-email")).clear();
		driver.findElement(By.id("singin-password")).clear();
		driver.findElement(By.id("singin-email")).click();
		driver.findElement(By.id("singin-email")).sendKeys("info@webarcitech.com");
		driver.findElement(By.id("singin-password")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary-2']")).click();
		String EmptyPasswordE = driver.findElement(By.id("singin-password-error")).getText();
		System.out.println("Empty Password Field (Error): - " + EmptyPasswordE);

		// To Valid Email-Address And Invalid Password.
		driver.findElement(By.id("singin-email")).clear();
		driver.findElement(By.id("singin-password")).clear();
		driver.findElement(By.id("singin-email")).click();
		driver.findElement(By.id("singin-email")).sendKeys("info@webarcitech.com");
		driver.findElement(By.id("singin-password")).click();
		driver.findElement(By.id("singin-password")).sendKeys("ritikajain31");
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary-2']")).click();
		System.out.println("Valid Email-Address And Invalid Password (Error) : - " + "Invalid credentials");

		// To Invalid Email-Address And Valid Password.
		driver.findElement(By.id("singin-email")).clear();
		driver.findElement(By.id("singin-password")).clear();
		driver.findElement(By.id("singin-email")).click();
		driver.findElement(By.id("singin-email")).sendKeys("info@webarcitech1.com");
		driver.findElement(By.id("singin-password")).click();
		driver.findElement(By.id("singin-password")).sendKeys("ritikajain30");
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary-2']")).click();
		System.out.println("Valid Email-Address And Invalid Password (Error) : - " + "Invalid credentials");

		// To Valid Email-Address And CLick On Forgot Password.
		driver.findElement(By.id("singin-email")).clear();
		driver.findElement(By.id("singin-password")).clear();
		driver.findElement(By.id("singin-email")).click();
		driver.findElement(By.id("singin-email")).sendKeys("info@webarcitech.com");
		driver.findElement(By.id("singin-password")).click();
		driver.findElement(By.xpath("//a[@class='forgot-link']")).click();

		// To Invalid Email-Address And CLick On Forgot Password.
		driver.findElement(By.id("singin-email")).clear();
		driver.findElement(By.id("singin-password")).clear();
		driver.findElement(By.id("singin-email")).click();
		driver.findElement(By.id("singin-email")).sendKeys("info@webarcitech1.com");
		driver.findElement(By.id("singin-password")).click();
		driver.findElement(By.xpath("//a[@class='forgot-link']")).click();

		// To valid Email-Address And Click On Request OTP.
		driver.findElement(By.id("singin-email")).clear();
		driver.findElement(By.id("singin-password")).clear();
		driver.findElement(By.id("singin-email")).click();
		driver.findElement(By.id("singin-email")).sendKeys("info@webarcitech.com");
		driver.findElement(By.id("singin-password")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-link btn-login-request-otp']")).click();
		System.out.println(driver.findElement(By.xpath("//label[@for='singin-password-otp']")).getText());

		// To Invalid Email-Address And Click On Request OTP.
		driver.findElement(By.id("singin-email")).clear();
		driver.findElement(By.id("singin-password")).clear();
		driver.findElement(By.id("singin-email")).click();
		driver.findElement(By.id("singin-email")).sendKeys("info@webarcitech1.com");
		driver.findElement(By.id("singin-password")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-link btn-login-request-otp']")).click();	

		// To Click On Google Login Button.
		driver.findElement(By.xpath("//a[@class='btn btn-login btn-g btn-google-login']")).click();
		String GoogleT = driver.getTitle();
		System.out.println("Google Login Title : - " + GoogleT);
		String GoogleUrl = driver.getCurrentUrl();
		System.out.println("Google Login URL : - " + GoogleUrl);

		// To Click On Facebook Login Button.
		driver.findElement(By.xpath("//a[@class='btn btn-login btn-f btn-facebook-login']")).click();
		String FacebookT = driver.getTitle(); 
		System.out.println("Facebook Login Title : - " + FacebookT);
		String FacebookUrl = driver.getCurrentUrl();
		System.out.println("Facbook Login URL : - " + FacebookUrl);

		// To Click On Designer Login Button.
		driver.findElement(By.xpath("//a[@href='https://bombaystudios.in/designer/login']")).click();
		String DTitle = driver.getTitle();
		System.out.println("Designer Login Title : - " + DTitle);
		String DUrl = driver.getCurrentUrl();
		System.out.println("Designer Login URL : - " + DUrl);

		// To Go To Register Tab.
		driver.findElement(By.id("register-tab")).click();
		driver.findElement(By.id("register-name")).click();
		driver.findElement(By.id("register-name")).sendKeys("ritika");
		driver.findElement(By.id("register-email")).click();
		driver.findElement(By.id("register-email")).sendKeys("ritika@webarcitech.com");
		driver.findElement(By.id("register-password")).click();
		driver.findElement(By.id("register-password")).sendKeys("12345678");
		driver.findElement(By.xpath("//label[@class='custom-control-label']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// To Valid Email-Address And Invalid Password.(With capital R)
		driver.findElement(By.id("singin-email")).clear();
		driver.findElement(By.id("singin-password")).clear();
		driver.findElement(By.id("singin-email")).click();
		driver.findElement(By.id("singin-email")).sendKeys("info@webarcitech.com");
		driver.findElement(By.id("singin-password")).click();
		driver.findElement(By.id("singin-password")).sendKeys("Ritikajain30");
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary-2']")).click();
		System.out.println("Invalid credentials");
	
		// To Valid Email-Address And Valid Password.
		driver.findElement(By.id("singin-email")).clear();
		driver.findElement(By.id("singin-password")).clear();
		driver.findElement(By.id("singin-email")).click();
		driver.findElement(By.id("singin-email")).sendKeys("info@webarcitech.com");
		driver.findElement(By.id("singin-password")).click();
		driver.findElement(By.id("singin-password")).sendKeys("ritikajain30");
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary-2']")).click();
		String Title1 = driver.getTitle();
		System.out.println("After Successfully Login Title : - " + Title1);
		String Title2 = driver.getCurrentUrl();
		System.out.println("After Successfully Login URL : -" + Title2);
	}

}
