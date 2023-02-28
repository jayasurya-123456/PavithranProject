package org.stepdefinition;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.text.Element;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.AssertionFailedError;
public class StepdefinitionClass {
public static WebDriver driver;
	
	@Given("User have to launch the URL")
	public void user_have_to_launch_the_URL() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
		driver.get("https://ibdlpuat.indianbank.in/omniapp");
		driver.manage().window().maximize();

		
	}

	@When("User have to enter the username in username field")
	public void user_have_to_enter_the_username_in_username_field() {
	
		WebElement username = driver.findElement(By.xpath("//input[@id='oaloginform:userid']"));
		username.sendKeys("meenakshi");
		
	    	}

	@When("USer have to enter the password in password field")
	public void user_have_to_enter_the_password_in_password_field() {
		
		WebElement password = driver.findElement(By.xpath("//input[@id='oaloginform:password']"));
		password.sendKeys("newgen123#");
	   	}
	@When("User should click the login button ")
	public void user_should_click_the_login_button() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//input[@id='oaloginform:loginbtn']"));
		login.click();
		Thread.sleep(2000);		
		
		driver.getTitle();
	  String s1 = "OmniApp | Main";
	 if (driver.getTitle()==s1) {
	 System.out.println("done");
	 }
	 else {
		 Thread.sleep(3000);
		WebElement alreadylogin = driver.findElement(By.xpath("//input[@id='oaloginform:contloginbtn']"));
		alreadylogin.click();
	}
		
	}

	

	@When("User have to click Data entry maker")
	public void user_have_to_click_Data_entry_maker() throws InterruptedException {
		Thread.sleep(5000);
	//	WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframe_Int11']"));
		WebElement frame1 = driver.findElement(By.id("iframe_Int11"));
		driver.switchTo().frame(frame1);
		//driver.switchTo().frame("iframe_Int11");
		Thread.sleep(2000);
		WebElement maker = driver.findElement(By.xpath("//label[@title='Data Entry Maker']"));
		maker.click();
		Thread.sleep(2000);
	   	}
	@When("User should enter the workitem number in search field")
	public void user_should_enter_the_workitem_number_in_search_field() throws InterruptedException {
	  driver.switchTo().defaultContent();
	  WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='iframe_Int3002']"));
	  driver.switchTo().frame(frame2);
	  Thread.sleep(3000);
	 // WebElement search_workitem = driver.findElement(By.xpath("//input[@id='wlf:Prefix']//parent::div[@class='oa-search oa-group']"));
	  WebElement search_workitem = driver.findElement(By.id("wlf:Prefix"));
	  Thread.sleep(5000);
//	  FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//	  wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds((long) 0.25)).ignoring(Exception.class).until(ExpectedConditions.visibilityOf(search_workitem));
	  search_workitem.click();
	  search_workitem.sendKeys("1950");
	  driver.findElement(By.xpath("//input[@id='wlf:cmdBtnRS']")).click();
	  driver.switchTo().defaultContent();
	
}
	@When("User have to select the workitem")
	public void user_have_to_select_the_workitem() throws InterruptedException {
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='iframe_Int40']"));
		driver.switchTo().frame(frame3);
	   WebElement workitem = driver.findElement(By.xpath("//label[@id='wlf:pnlResult_0_pn']"));
	 workitem.click();
	  // Thread.sleep(3000);
	}
	@When("User have to verify the customer personal details ")
	public void user_have_to_verify_the_customer_personal_details() throws InterruptedException {
	    
	

	
		 Set<String> windows = driver.getWindowHandles();
		 List<String> window1=new ArrayList<String>(windows);
		 driver.switchTo().window(window1.get(1));
		 Thread.sleep(5000);
		 
		 //WebElement frame4 = driver.findElement(By.id("ngformIframe"));
		driver.switchTo().frame("ngformIframe");
	//	List<WebElement> textbox = driver.findElements(By.xpath("//input[@labelname title]"));
		//for (int i = 0; i < textbox.size(); i++) {
			//if (textbox.isEmpty()) {
				//System.out.println("Field is empty");
				
				
	//		}
		//	else {
		//		System.out.println("Field is filled");
		//	}
//}
		
		
		 WebElement text = driver.findElement(By.id("JL_CUSTOMER_DETAILS_APPLICANT_NAME"));
		 String string = text.toString();
		 
		 if (string.isEmpty()) {
			 System.out.println("name is empty");
			
		} else {
			 System.out.println("name is filled");
			 Thread.sleep(2000);
		 } 
		 WebElement ph_number = driver.findElement(By.id("JL_CUSTOMER_DETAILS_MOBILE_NUMBER"));
		 String string2 = ph_number.toString();
		 
		 if (string2.isEmpty()) {
			 System.out.println("number is empty");
			 
		} else {
			System.out.println("number is filled");

		}
		 WebElement email = driver.findElement(By.id("JL_CUSTOMER_DETAILS_EMAIL_ID"));
		String string3 = email.toString();
		if (string3.length()==0) {
			System.out.println("email is not filled");
		}
		else {
			System.out.println("email is filled");
		}
		 WebElement dob = driver.findElement(By.id("JL_CUSTOMER_DETAILS_DATE_OF_BIRTH"));
		 String string4 = dob.toString();
		 if (string4.isEmpty()) {
			 System.out.println("dob is empty");
			
		} else {
			System.out.println("dob is filled");

		}
		 WebElement re_kyc = driver.findElement(By.id("JL_CUSTOMER_DETAILS_REKYC"));
		 String string5 = re_kyc.toString();
		 if (string5.isEmpty()) {
			 System.out.println("RE_KYC is empty");
			
		} else {
			System.out.println("RE_KYC is filled");

		}
		 WebElement EKYC = driver.findElement(By.id("JL_CUSTOMER_DETAILS_EKYC"));
		 String string6 = EKYC.toString();
		 if (string6.isEmpty()) {
			 System.out.println("EKYC is empty");
			
		} else {
			System.out.println("EKYC is filled");

		}	
		 List<WebElement> l = new ArrayList<WebElement>();
		 l.add(text);
		 l.add(ph_number);
		 l.add(email);
		 l.add(dob);
		 l.add(re_kyc);
		 l.add(EKYC);
		for (WebElement we : l) {
			String string7 = we.toString();
			if (string7.isBlank()) {
				Assert.fail("Failed");
			}
			else {
				System.out.println("done");
			}
		}
			
		}
	
		 
		
	
@When("User have to check the customer residence details")
public void user_have_to_check_the_customer_residence_details() {
	   WebElement address = driver.findElement(By.id("JL_CUSTOMER_DETAILS_ADDRESS_P1"));
	String string = address.toString();
	if (string.isEmpty()) {
		System.out.println("address is empty");
		
	} else {
		System.out.println("address is filled");

	}
   WebElement state = driver.findElement(By.id("JL_CUSTOMER_DETAILS_STATE_C"));
   String string2 = state.toString();
   if (string2.isEmpty()) {
		System.out.println("state is empty");
		
	} else {
		System.out.println("state is filled");

	}
   WebElement country = driver.findElement(By.id("JL_CUSTOMER_DETAILS_COUNTRY_C"));
   String string3 = country.toString();
   if (string3.isEmpty()) {
		System.out.println("country is empty");
		
	} else {
		System.out.println("country is filled");

	}
   WebElement pincode = driver.findElement(By.id("JL_CUSTOMER_DETAILS_PINCODE_C"));
   String string4 = pincode.toString();
   if (string4.isEmpty()) {
		System.out.println("pincode is empty");
		
	} else {
		System.out.println("pincode is filled");

	}
   
}

@When("User have to check the customer nominee details")
public void user_have_to_check_the_customer_nominee_details() {
	
	WebElement nomination_requested = driver.findElement(By.id("JL_CUSTOMER_DETAILS_NOMINATION_REQUESTED"));
	if (nomination_requested.isSelected()) {
		System.out.println("nomination_requested is empty");
		
	} else {
		System.out.println("nomination_requested is filled");

	}
	
	WebElement nominee_name = driver.findElement(By.id("JL_CUSTOMER_DETAILS_NOMINATION_NAME"));
	   String string = nominee_name.toString();
	   if (string.isEmpty()) {
			System.out.println("nominee_name is empty");
			
		} else {
			System.out.println("nominee_name is filled");

		}
	   WebElement DOB = driver.findElement(By.id("JL_CUSTOMER_DETAILS_DATE_OF_BIRTH_N"));
		if (DOB.isSelected()) {
			System.out.println("DOB is empty");
			
		} else {
			System.out.println("DOB is filled");

		}
		
		 WebElement gender = driver.findElement(By.id("JL_CUSTOMER_DETAILS_GENDER"));
			if (gender.isSelected()) {
				System.out.println("gender is empty");
				
			} else {
				System.out.println("gender is filled");

			}
			WebElement PAN = driver.findElement(By.id("JL_CUSTOMER_DETAILS_PAN"));
			   String string1 = PAN.toString();
			   if (string1.isEmpty()) {
					System.out.println("PAN is empty");
					
				} else {
					System.out.println("PAN is filled");

				}
			   WebElement Aadhar = driver.findElement(By.id("JL_CUSTOMER_DETAILS_AADHAR"));
			   String string2 = Aadhar.toString();
			   if (string2.isEmpty()) {
					System.out.println("Aadhar is empty");
					
				} else {
					System.out.println("Aadhar is filled");

				}
			   WebElement address1 = driver.findElement(By.id("JL_CUSTOMER_DETAILS_ADDRESS_1"));
			   String string3 = address1.toString();
			   if (string3.isEmpty()) {
					System.out.println("address1 is empty");
					
				} else {
					System.out.println("address1 is filled");

				}
			   WebElement CIF_number = driver.findElement(By.id("JL_CUSTOMER_DETAILS_CIF"));
			   String string4 = CIF_number.toString();
			   if (string4.isEmpty()) {
					System.out.println("CIF_number is empty");
					
				} else {
					System.out.println("CIF_number is filled");

				}
   
}
@When("User have to click the gold details")
public void user_have_to_click_the_gold_details() throws InterruptedException {
  
	driver.findElement(By.id("sheet126_link")).click();
	Thread.sleep(2000);
}
@When("User have to add gold details")
public void use_have_to_add_gold_details() throws InterruptedException {
  driver.findElement(By.id("add_TBL_GOLD_DETAILS")).click();
  Thread.sleep(2000);
 WebElement select1 = driver.findElement(By.xpath("(//table/tbody/tr[5]/td/select)[1]"));
  Select s = new Select(select1);
  s.selectByValue("07:Chain- Aaram");
  
  driver.findElement(By.xpath("(//input[@class='control-class inputStyle tableinput form-control1 fmarginbottom0      tabletextbox'])[3]")).sendKeys("2");
  driver.findElement(By.xpath("(//input[@class='control-class inputStyle tableinput form-control1 fmarginbottom0      tabletextbox'])[4]")).sendKeys("20");
 
  WebElement purity = driver.findElement(By.xpath("(//table/tbody/tr[5]/td/select)[2]"));
  Select s1 = new Select(purity);
  s1.selectByValue("22");

  //less stone
  driver.findElement(By.xpath("(//input[@class='control-class inputStyle tableinput form-control1 fmarginbottom0      tabletextbox'])[5]")).sendKeys("2");
  //deduction
  driver.findElement(By.xpath("(//input[@class='control-class inputStyle tableinput form-control1 fmarginbottom0      tabletextbox'])[6]")).sendKeys("1");
Thread.sleep(3000);  
	WebElement hallmark = driver.findElement(By.xpath("(//table/tbody/tr[5]/td/select)[3]"));
	Select s2 = new Select(hallmark);
	s2.selectByValue("Hallmark");
	Thread.sleep(2000);
	
	WebElement total_value = driver.findElement(By.xpath("(//input[@class='control-class inputStyle tableinput form-control1 fmarginbottom0 tabletextbox disabledTableFont'])[2]"));
	if (total_value.isSelected()) {
		System.out.println("total_value is empty");
		
	} else {
		System.out.println("total_value is filled");

	}
	

}
@When("User have to check the gold details")
public void user_have_to_check_the_gold_details() throws InterruptedException {
	WebElement total_item = driver.findElement(By.id("JL_GOLD_ASSESSMENT_TOTAL_ITEMS"));
	if (total_item.isSelected()) {
		System.out.println("total_item is empty");
		
	} else {
		System.out.println("total_item is filled");

	}
	WebElement total_units = driver.findElement(By.id("JL_GOLD_ASSESSMENT_TOTAL_UNITS"));
	if (total_units.isSelected()) {
		System.out.println("total_units is empty");
		
	} else {
		System.out.println("total_units is filled");

	}
	
	WebElement total_gross_weight = driver.findElement(By.id("JL_GOLD_ASSESSMENT_TOTAL_GROSS_WEIGHT"));
	if (total_gross_weight.isSelected()) {
		System.out.println("total_gross_weight is empty");
		
	} else {
		System.out.println("total_gross_weight is filled");
	}
	WebElement total_deduction = driver.findElement(By.id("JL_GOLD_ASSESSMENT_DEDUCTION"));
	if (total_deduction.isSelected()) {
		System.out.println("total_deduction is empty");
		
	} else {
		System.out.println("total_deduction is filled");
	}
	WebElement total_net_weight = driver.findElement(By.id("JL_GOLD_ASSESSMENT_NET_WEIGHT"));
	if (total_net_weight.isSelected()) {
		System.out.println("total_net_weight is empty");
		
	} else {
		System.out.println("total_net_weight is filled");
	}
	WebElement bank_valuation = driver.findElement(By.id("JL_GOLD_ASSESSMENT_BANKVALUATION"));
	if (bank_valuation.isSelected()) {
		System.out.println("bank_valuation is empty");
		
	} else {
		System.out.println("bank_valuation is filled");
	}
	WebElement loan_eligibility = driver.findElement(By.id("JL_GOLD_ASSESSMENT_LOANELIGIBLE_C"));
	if (loan_eligibility.isSelected()) {
		System.out.println("loan_eligibility is empty");
		
	} else {
		System.out.println("loan_eligibility is filled");
	}
	WebElement LA_credit_assessment = driver.findElement(By.id("JL_GOLD_ASSESSMENT_CREDIT_B"));
	if (LA_credit_assessment.isSelected()) {
		System.out.println("LA_credit_assessment is empty");
		
	} else {
		System.out.println("LA_credit_assessment is filled");
	}
	WebElement LA_requested = driver.findElement(By.id("JL_GOLD_ASSESSMENT_LOAN_AMOUNT_C"));
	if (LA_requested.isSelected()) {
		System.out.println("LA_requested is empty");
		
	} else {
		System.out.println("LA_requested is filled");
	}
	WebElement Final_eligible = driver.findElement(By.id("JL_GOLD_ASSESSMENT_ELIGIBLE_AMOUNT"));
	if (Final_eligible.isSelected()) {
		System.out.println("Final_eligible is empty");
		
	} else {
		System.out.println("Final_eligible is filled");
	}
	WebElement comment = driver.findElement(By.id("JL_GOLD_ASSESSMENT_COMMENTS"));
	comment.clear();
	comment.sendKeys("DONE");
	Thread.sleep(2000);
	
	driver.findElement(By.id("button255")).click();
}


}
