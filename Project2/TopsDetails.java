package Tops;
import java.util.Set;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TopsDetails 
{
	
	String url = "https://careercenter.tops-int.com";
	WebDriver driver = DriverOp.getDriver(url);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Actions action = new Actions(driver);
	
	public static  void main(String[] args) throws InterruptedException 
		{
		TopsDetails TD  = new TopsDetails();
		TD.Login();
		TD.PersonalDetails();
//		TD.EducationalDetails();
//		TD.PasswordChange();
//		TD.CourseDetails();
//		TD.ResumeBuilder();
//		TD.Close();
		
		
		
		// TODO Auto-generated method stub

		}
		public void Login() throws InterruptedException
		{
		//Login
		
		driver.findElement(By.id("mobile")).sendKeys("8469181334");
		driver.findElement(By.id("password")).sendKeys("8469181334");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		
		
		public void CourseDetails() throws InterruptedException
		{
			
			TakesScreenshot ss = (TakesScreenshot)driver;
			
			File source =ss.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots\\SC1.png"); 
			try 
			{
				FileUtils.copyFile(source, dest);
				System.out.println("ss taken");
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		driver.findElement(By.linkText("Diploma In Software Testing And Automation")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Course Details")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("course-attendance-tab")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("course-accounts-tab")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Diploma In Software Testing And Automation")).click();
		Thread.sleep(2000);
		WebElement Project = driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div[1]/div/ul/div/div/div/ul/li[2]/a"));
		Thread.sleep(2000);
		Project.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
//		driver.navigate().forward();
//		driver.navigate().to("https://www.techlistic.com/p/java.html");
//		driver.findElement(By.xpath("//div[@id='course-project']/div/div[1]/h4/a/i")).click();
//		Thread.sleep(2000);
		}
		public void PersonalDetails() throws InterruptedException
		{
			
			 String actualTitle = driver.getTitle();
			 System.out.println("Title fetched: "+ actualTitle);
		//PersonalDetails
		
		WebElement ProfileIcon = driver.findElement(By.id("profileDropdown"));
		ProfileIcon.click();
		driver.findElement(By.linkText("Personal Details")).click();
		driver.findElement(By.className("selection")).click();
		driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[1]")).click();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		action.click(firstName).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();		
		firstName.clear();
		firstName.sendKeys("Ankitkumar");
		
		driver.findElement(By.id("imageRemove")).click();
	
//		
		WebElement lastName = driver.findElement(By.id("lastName"));
		action.click(lastName).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();				
		lastName.sendKeys("Patel");
		WebElement email = driver.findElement(By.id("email"));
		action.click(email).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();		
		email.sendKeys("patelankitkumar9062@gmail.com");
		WebElement linkedin_id = driver.findElement(By.id("linkedin_id"));
		action.click(linkedin_id).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();		
		linkedin_id.sendKeys("www.linkdin.com/in/ankit9062");
		WebElement Insta = driver.findElement(By.id("instagram_id"));
	
		action.click(Insta).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
	
		Insta.sendKeys("Ankit_9062");
		driver.findElement(By.id("select2-gender-container")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[1]")).click();
		driver.findElement(By.id("select2-maritalStatus-container")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[1]")).click();
		js.executeScript("arguments[0].scrollIntoView();", Insta  );

		driver.findElement(By.id("birthdate")).sendKeys("10-08-1993");
		
		WebElement fatherName = driver.findElement(By.id("fatherName"));
		action.click(fatherName).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		fatherName.sendKeys("Lalabhai");
		WebElement motherName = driver.findElement(By.id("motherName"));
		motherName.clear();
		motherName.sendKeys("Santokben");
		WebElement guardianName = driver.findElement(By.id("guardianName"));
		guardianName.clear();
		guardianName.sendKeys("Lalabhai");
		js.executeScript("arguments[0].scrollIntoView();", guardianName  );
		WebElement Religion = driver.findElement(By.id("select2-religion-container"));
		Thread.sleep(2000);
		Religion.click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[1]")).click();
		
		driver.findElement(By.id("select2-category-container")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[2]")).click();
		driver.findElement(By.id("select2-disability-container")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[1]")).click();
		driver.findElement(By.id("select2-idType-container")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[2]")).click();
		driver.findElement(By.id("idNo")).sendKeys("DDLPP6312R");
		WebElement EduLevel= driver.findElement(By.id("select2-educationLevel-container"));
		EduLevel.click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[10]")).click();
		js.executeScript("arguments[0].scrollIntoView();", EduLevel  );
		WebElement Address= driver.findElement(By.id("address"));
		Address.clear();
		Address.sendKeys("Vastral, Ahmedabad");
		WebElement pincode = driver.findElement(By.id("pincode"));
		pincode.clear();
		pincode.sendKeys("382418");
		driver.findElement(By.id("select2-country-container")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']")).click();
		driver.findElement(By.id("select2-state-container")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[12]")).click();
		driver.findElement(By.id("select2-district-container")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[1]")).click();
		driver.findElement(By.id("select2-city-container")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[1]")).click();
		driver.findElement(By.id("select2-trainingStatus-container")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[1]")).click();
		driver.findElement(By.id("aadharFront")).sendKeys("D:\\JAVA backup\\Calculator1\\Dog.jpg");
		driver.findElement(By.id("aadharBack")).sendKeys("D:\\JAVA backup\\Calculator1\\Dog.jpg");
//		firstName.click();
//		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("profileDropdown")));
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("updateProfile")));
//		Thread.sleep(2000);
//		WebElement Profile = driver.findElement(By.xpath("//img[@id='profileImage']"));
//		Thread.sleep(2000);
//		Profile.sendKeys("D:\\JAVA backup\\Calculator1\\Dog.jpg");
//		js.executeScript("window.scrollBy(0,0)");
		
//		js.executeScript("window.scrollBy(0,document.body.bottom)");
//		js.executeScript("arguments[0].scrollIntoView();",   );
//		driver.findElement(By.id("updateProfile")).click();
		
	
		
		}	
		public void EducationalDetails() throws InterruptedException
		{
		//Educational Details
			
			//HOMEPAGE
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();
		//DROPDOWN
		driver.findElement(By.id("profileDropdown")).click();
		//CLICK ON EDUCATION DETAILS
		driver.findElement(By.linkText("Education Details")).click();
		WebElement NewDetails = driver.findElement(By.linkText("+ Add Education Details"));
		NewDetails.click();
		Thread.sleep(2000);
		WebElement Degree = driver.findElement(By.id("degree"));
		Degree.clear();
		Degree.sendKeys("B.E/B.Tech");
		WebElement University = driver.findElement(By.id("collegeName"));
		University.clear();
		University.sendKeys("Charusat University");
		WebElement Year = driver.findElement(By.id("passingYear"));
		Year.clear();
		Year.sendKeys("2016");
		WebElement Result = driver.findElement(By.id("result"));
		Result.clear();
		Result.sendKeys("80");
		WebElement Percentage = driver.findElement(By.id("eduResultUnit"));
		Percentage.click();
		WebElement Add = driver.findElement(By.xpath("//div[@id='mobileAddBtnSection-courseEdu']/div/input"));
		Add.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div[2]/div/div/div[2]/div[4]/div[2]/div/a[2]/i")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		}
		
		public void PasswordChange()
		{
		//Password Change
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();
		
		driver.findElement(By.id("profileDropdown")).click();
		driver.findElement(By.xpath("//div[@class='container-fluid']/div/div[2]/div/ul/li[3]")).click();
		driver.findElement(By.id("current_password")).sendKeys("152266");
		driver.findElement(By.id("new_password")).sendKeys("558596");
		driver.findElement(By.id("confirm_password")).sendKeys("5984825");
		driver.findElement(By.id("changePasswordSubmit")).click();
		}
		
		public void ResumeBuilder() throws InterruptedException
		{
//		//Resume Builder
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[4]")).click();
		WebElement tital = driver.findElement(By.id("title"));
		action.click(tital).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		tital.sendKeys("Manual And Automation Tester");
		
		WebElement Contact = driver.findElement(By.id("contact"));
		action.click(Contact).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		Contact.sendKeys("8469181334");
		
		WebElement email= driver.findElement(By.id("email"));
		action.click(email).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		email.sendKeys("patelankitkumar9062@gmail.com");
		
		WebElement dob = driver.findElement(By.id("dob"));
		dob.sendKeys("10-08-1993");
		
		WebElement address = driver.findElement(By.id("address"));
		action.click(address).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		address.sendKeys("402/Meghana nagar, Harishchandra nagar soc. Nr sumin nagar b/h canal, Vastral");
		
		WebElement linkdin = driver.findElement(By.id("linkedinLink"));
		action.click(linkdin).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		linkdin.sendKeys("www.linkdin.com/in/ankit9062");
		
		WebElement github= driver.findElement(By.id("githubLink"));
		action.click(github).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		github.sendKeys("Ankit_9062");
		
		WebElement beha = driver.findElement(By.id("behanceLink"));
		action.click(beha).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		beha.sendKeys("Ankit_9062");
		//js.executeScript("window.scrollBy(0,document.body.bottom)");
		Thread.sleep(2000);
		driver.findElement(By.id("personalDetailSubmit")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("v-pills-profile-tab")).click();
		
		js.executeScript("window.scrollBy(0,document.body.top)");
		WebElement summeryContent = driver.findElement(By.id("summeryContent"));
		action.click(summeryContent).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		summeryContent.sendKeys("Please select correct summery data");
		
		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,document.body.bottom)");
//		Thread.sleep(2000);
//		driver.findElement(By.id("personalDetailSubmit")).click();
//		Thread.sleep(2000);
	//technical
		driver.findElement(By.id("v-pills-technical-tab")).click();
		js.executeScript("window.scrollBy(0,document.body.top)");
		WebElement programmingLanguages = driver.findElement(By.id("programmingLanguages"));
		action.click(programmingLanguages).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		programmingLanguages.sendKeys("hh");
		WebElement databases = driver.findElement(By.id("databases"));
		action.click(databases).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		databases.sendKeys("ty");
		WebElement webServers = driver.findElement(By.id("webServers"));
		action.click(webServers).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		webServers.sendKeys("y7y");
		js.executeScript("window.scrollBy(0,document.body.bottom)");
		WebElement softwares = driver.findElement(By.id("softwares"));
		action.click(softwares).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();
		softwares.sendKeys("yuyu");
		WebElement systems = driver.findElement(By.id("systems"));
		action.click(systems).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();		
		systems.sendKeys("ui87");
		driver.findElement(By.xpath("//div[@id='v-pills-technical']/form/div[6]/div/input")).click();
		Thread.sleep(2000);
		
		
		//Experience
		
		driver.findElement(By.id("v-pills-projects-tab")).click();
		driver.findElement(By.linkText("+ Add Experience Details")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='resume-pills-tabContent']/div[4]/div/div[2]/a")).click();
		
		driver.findElement(By.id("companyName")).sendKeys("Alstom Transportation");
		driver.findElement(By.id("position")).sendKeys("Trouble Shooter");
		driver.findElement(By.id("jobDescriptionText")).sendKeys("Maitained LRVs");
		driver.findElement(By.id("jobTenureFrom")).sendKeys("11-08-2019");
		driver.findElement(By.id("jobTenureTo")).sendKeys("27-09-2020");
		driver.findElement(By.id("jobTenurePresent")).click();
		//submit
		driver.findElement(By.id("companyDetailsFormSubmit")).click();

		Thread.sleep(2000);
		//delete
		driver.findElement(By.xpath("//div[@id='v-pills-projects']/div/div/div[1]/div[2]/a[2]")).click();
		Thread.sleep(1000);
	//switch ton alert to confirm delete
		driver.switchTo().alert().accept();
		js.executeScript("window.scrollBy(0,document.body.bottom)");
		driver.findElement(By.xpath("//div[@id='v-pills-projects']/div/div[3]/div/input")).click();

		
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("v-pills-education-tab")).click();
		Thread.sleep(2000);
		WebElement NewDetails1 = driver.findElement(By.xpath("//div[@id='v-pills-education']/div/div[4]"));
		NewDetails1.click();
		Thread.sleep(2000);
		driver.findElement(By.id("degree")).sendKeys("B.E/B.Tech");
		WebElement University = driver.findElement(By.id("collegeName"));
		University.sendKeys("Charusat University");
		WebElement Year = driver.findElement(By.id("passingYear"));
		Year.click();
		Year.sendKeys("2016");
		WebElement Result = driver.findElement(By.id("result"));
		Result.sendKeys("80");
		WebElement Percentage = driver.findElement(By.id("eduResultUnit"));
		Percentage.click();
		WebElement Add = driver.findElement(By.xpath("//div[@id='mobileAddBtnSection-courseEdu']/div/input"));
		Add.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='v-pills-education']//div/div[4]/div[2]/div/a[2]/i")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.bottom)");
		driver.findElement(By.linkText("Save & Preview")).click();
		Thread.sleep(2000);
		
		String mainWin = driver.getWindowHandle();	
		Set<String> allWin = driver.getWindowHandles();
		for(String win : allWin)
		{
			if(!win.equals(mainWin)) 
				{
				driver.switchTo().window(win);
				driver.findElement(By.linkText("Download Resume")).click();
				driver.close();

				}
		}
		}
		public void Close()
		{
			driver.quit();
		}
		
}
