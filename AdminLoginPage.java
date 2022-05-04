import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://bombaystudios.in/admin");

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

		// To UI Testing

		// To Check the Email Field Displayed And Working or Not.
		Boolean Email = driver.findElement(By.id("email_id")).isDisplayed();
		System.out.println("Email Field Displayed : - " + Email);
		driver.findElement(By.id("email_id")).click();
		Boolean Email1 = driver.findElement(By.id("email_id")).isEnabled();
		System.out.println("Email Field Clicked : - " + Email1);

		// To Check the Password Field Displayed And Working or Not.
		Boolean Password = driver.findElement(By.name("password")).isDisplayed();
		System.out.println("Password Field Displayed : - " + Password);
		driver.findElement(By.name("password")).click();
		Boolean Password1 = driver.findElement(By.name("password")).isEnabled();
		System.out.println("Password Field Clicked : - " + Password1);

		// To Check the Remember Me CheckBox Displayed And Working or Not.
		Boolean CheckBox = driver.findElement(By.xpath("//i[@class='cr-icon icofont icofont-ui-check txt-primary']"))
				.isDisplayed();
		System.out.println("CheckBox is Displayed : - " + CheckBox);
		driver.findElement(By.xpath("//i[@class='cr-icon icofont icofont-ui-check txt-primary']")).click();
		Boolean CheckBox1 = driver.findElement(By.xpath("//i[@class='cr-icon icofont icofont-ui-check txt-primary']"))
				.isEnabled();
		System.out.println("CheckBox is Clicked : - " + CheckBox1);

		// To Forgot Password Is Displayed And Working Or Not.
		Boolean FPassword = driver.findElement(By.xpath("//a[@class='text-right f-w-600 btn-password-link']"))
				.isDisplayed();
		System.out.println("Forgot Password Is Displayed : - " + FPassword);
		driver.findElement(By.xpath("//a[@class='text-right f-w-600 btn-password-link']")).click();
		Boolean FPassword1 = driver.findElement(By.xpath("//a[@class='text-right f-w-600 btn-password-link']"))
				.isEnabled();
		System.out.println("Forgot Password Is Clicked : - " + FPassword1);

		// To Login Button Is Displayed.
		Boolean LoginButton = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println("Login Button Is Displayed : - " + LoginButton);

		// To Dwear Logo Working or Not.
		String Brand = driver.findElement(By.linkText("Dwear.")).getText();
		System.out.println("Brand Name: - " + Brand);
		Boolean Brand1 = driver.findElement(By.linkText("Dwear.")).isDisplayed();
		System.out.println("Logo Is Displayed : - " + Brand1);
		driver.findElement(By.linkText("Dwear.")).click();

		// For Negative Testing.

		// To Leave Both Email-Id And Password Field Empty.
		driver.findElement(By.className("text-inverse")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Emptyemailfield = driver.findElement(By.id("email_id-error")).getText();
		String Emptypasswordfield = driver.findElement(By.id("password-error")).getText();
		System.out.println("Leaving Empty Email-id Field (Error): - " + Emptyemailfield);
		System.out.println("Leaving Empty Password Field (Error): - " + Emptypasswordfield);

		// To Empty Email-Id Field And Valid Password.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("111111");
		driver.findElement(By.className("text-inverse")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String EmptyEmail = driver.findElement(By.id("email_id-error")).getText();
		System.out.println("Empty Email-Id Field (Error): - " + EmptyEmail);

		// To Valid Email-Id And Empty Password Field.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.id("email_id")).sendKeys("admin123@dwear.co");
		driver.findElement(By.className("text-inverse")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String EmptyPassword = driver.findElement(By.id("password-error")).getText();
		System.out.println("Empty Password Field (Error): - " + EmptyPassword);

		// To Enter Invalid Email-id And Valid Password.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.id("email_id")).sendKeys("admin123@dwear.co");
		driver.findElement(By.name("password")).sendKeys("111111");
		driver.findElement(By.className("text-inverse")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String EmailError = driver.findElement(By.xpath("//span[@class='messages text-danger error']")).getText();
		System.out.println("Invalid Email-Id (Error): - " + EmailError);

		// To Enter Valid Email-ID And Invalid Password.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.id("email_id")).sendKeys("admin@dwear.co");
		driver.findElement(By.name("password")).sendKeys("121212");
		driver.findElement(By.className("text-inverse")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String PasswordError = driver.findElement(By.xpath("//span[@class='messages text-danger error']")).getText();
		System.out.println("Invalid Password (Error) " + PasswordError);

		// To check CheckBox is Selected On Not.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.id("email_id")).sendKeys("admin@dwear.co");
		driver.findElement(By.name("password")).sendKeys("111111");
		Boolean Result = driver.findElement(By.xpath("//i[@class='cr-icon icofont icofont-ui-check txt-primary']"))
				.isSelected();
		System.out.println("CheckBox Is Selected: - " + Result);

		// To Valid Email-ID And Click On Forget Password.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.id("email_id")).sendKeys("admin@dwear.co");
		driver.findElement(By.linkText("Forgot Password?")).click();

		// To Invalid Email-ID And Click On Forget Password.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.id("email_id")).sendKeys("admin123@dwear.co");
		driver.findElement(By.linkText("Forgot Password?")).click();

		// Positive Testing.
		driver.findElement(By.id("email_id")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.id("email_id")).sendKeys("admin@dwear.co");
		driver.findElement(By.name("password")).sendKeys("111111");
		driver.findElement(By.className("text-inverse")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Succesfully Login By Admin");
		String updatedUrl = driver.getCurrentUrl();
		System.out.println("After Login URL: - " + updatedUrl);
		String updatedTitle = driver.getTitle();
		System.out.println("After Login Title: - " + updatedTitle);

		

	}

}
