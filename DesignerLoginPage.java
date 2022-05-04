import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesignerLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://bombaystudios.in/designer");

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

		// To UI Testing.

		// To Sign In Name Is Displayed Or Not.
		Boolean SignIn = driver.findElement(By.xpath("//h3[@class='text-center txt-primary']")).isDisplayed();
		System.out.println("Sign-In Name Is Displayed : - " + SignIn);

		// To Sign in with your designer account Is Displayed Or Not.
		Boolean SignIn1 = driver.findElement(By.xpath("//p[@class='text-muted text-center p-b-5']")).isDisplayed();
		System.out.println("Sign-In With Your Designer Account Is Displayed : - " + SignIn1);

		// To Email-Id Field is Displayed And Working Or Not.
		Boolean EmailId = driver.findElement(By.name("email")).isDisplayed();
		System.out.println("Email-Id Field Displayed : - " + EmailId);
		driver.findElement(By.name("email")).click();
		Boolean EmailId1 = driver.findElement(By.name("email")).isEnabled();
		System.out.println("Email-Id Field Clicked : - " + EmailId1);

		// To Password Field is Displayed And Working Or Not.
		Boolean PasswordF = driver.findElement(By.name("password")).isDisplayed();
		System.out.println("Password Field Displayed : - " + PasswordF);
		driver.findElement(By.name("password")).click();
		Boolean PasswordF1 = driver.findElement(By.name("password")).isEnabled();
		System.out.println("Password Field Clicked : - " + PasswordF1);

		// To Login With OTP Is Displayed And Working Or Not.
		Boolean Lwo = driver.findElement(By.xpath("//a[@class='text-left f-w-600']")).isDisplayed();
		System.out.println("Login With OTP Is Displayed : - " + Lwo);
		driver.findElement(By.xpath("//a[@class='text-left f-w-600']")).click();
		Boolean Lwo1 = driver.findElement(By.xpath("//a[@class='text-left f-w-600']")).isEnabled();
		System.out.println("Login With OTP Is Clicked : - " + Lwo1);

		// To Forgot Password Is Displayed And Working Or Not.
		Boolean ForgotP = driver.findElement(By.xpath("//a[@class='text-right f-w-600 btn-password-link']"))
				.isDisplayed();
		System.out.println("Forgot Password Is Displayed : - " + ForgotP);
		driver.findElement(By.xpath("//a[@class='text-right f-w-600 btn-password-link']")).click();
		Boolean ForgotP1 = driver.findElement(By.xpath("//a[@class='text-right f-w-600 btn-password-link']"))
				.isEnabled();
		System.out.println("Forgot Password Is Clicked : - " + ForgotP1);
		
		//To Log-in Button Is Displayed Or Not.
		Boolean LoginB = driver.findElement(By.xpath("//button[@type='submit']"))
				.isDisplayed();
		System.out.println("Login Button Is Displayed : - " + LoginB);

		//To Register Here Is Displyed Or Not.
		Boolean RHere = driver.findElement(By.xpath("//a[@href='https://bombaystudios.in/designers/register']")).isDisplayed();
		System.out.println("Register Here Is Displayed : - " + RHere);
		
		
		// To Register User.
		driver.findElement(By.xpath("//a[@href='https://bombaystudios.in/designers/register']")).click();
		System.out.println("Register Page URL: - " + driver.getCurrentUrl());
		System.out.println("Register Page Title : - " + driver.getTitle());

		// Navigate to Register Page to Login Pgae.
		driver.navigate().to("https://bombaystudios.in/designer");

		// Leave Empty Email-Id And Password Field.
		driver.findElement(By.id("email_id")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Error = driver.findElement(By.id("email_id-error")).getText();
		System.out.println("Empty Email And Password (Error) : -" + Error);

		// To Empty Email-Id And Valid Password.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("email_id")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("1508");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Error1 = driver.findElement(By.id("email_id-error")).getText();
		System.out.println("Empty Email And Valid Password (Error) : -" + Error1);

		// To Valid Email-Id And Empty Password.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("email_id")).click();
		driver.findElement(By.id("email_id")).sendKeys("ritikaj7777@gmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String Error3 = driver.findElement(By.xpath("//span[@class='messages text-danger error']")).getText();
		System.out.println("Valid Email-Id And Empty Password (Error): -" + Error3);

		// To Valid Email-Id And Invalid Password.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("email_id")).click();
		driver.findElement(By.id("email_id")).sendKeys("ritikaj7777@gmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("1510");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Error4 = driver.findElement(By.xpath("//span[@class='messages text-danger error']")).getText();
		System.out.println("Valid Email-Id And Invalid Password (Error): -" + Error4);

		// To Invalid Email-Id And Valid Password.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("email_id")).click();
		driver.findElement(By.id("email_id")).sendKeys("ritikaj777@gmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("1508");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Error5 = driver.findElement(By.xpath("//span[@class='messages text-danger error']")).getText();
		System.out.println("InValid Email-Id And Valid Password (Error): -" + Error5);

		// To Valid Email-Id and Click on Forgot Password.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("email_id")).click();
		driver.findElement(By.id("email_id")).sendKeys("ritikaj7777@gmail.com");
		driver.findElement(By.xpath("//a[@class='text-right f-w-600 btn-password-link']")).click();
		Thread.sleep(5000);

		// To Invalid Email-Id And Click On Forgot Password.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("email_id")).click();
		driver.findElement(By.id("email_id")).sendKeys("ritikaj777@gmail.com");
		driver.findElement(By.xpath("//a[@class='text-right f-w-600 btn-password-link']")).click();

		// To Invalid Email-Id And Click On Login With OTP Button.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("email_id")).click();
		driver.findElement(By.id("email_id")).sendKeys("ritikaj777@gmail.com");
		driver.findElement(By.xpath("//a[@class='text-left f-w-600']")).click();

		// To Valid Email-Id And CLick On Login With OTP Button.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("email_id")).click();
		driver.findElement(By.id("email_id")).sendKeys("ritikaj7777@gmail.com");
		driver.findElement(By.xpath("//a[@class='text-left f-w-600']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='resend-otp']")).click();

		// To Valid Email-Id And Valid Password.
		driver.navigate().to("https://bombaystudios.in/designer");
		driver.findElement(By.id("email_id")).sendKeys("ritikaj7777@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1508");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println("After Successfully Login URL Is : - " + driver.getCurrentUrl());
		System.out.println("After Successfully Login Title Is : - " + driver.getTitle());
	}

}
