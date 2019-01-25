package web.smartqedemoproject.drmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Screen1 extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://devrabbitdev.com/\",\"report_upload_url\":\"https://192.168.1.142:8080/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"SmartQEDemoProject.\",\"project_description\":\"desc\",\"project_id\":198,\"module_name\":\"DRModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":342,\"testcase_name\":\"TC1\",\"testcase_id\":405,\"testset_id\":0,\"executed_timestamp\":2057627500,\"browser_type\":\"chrome\"}";

	public static String projectName = "smartqedemoproject";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Screen1(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_290014A;
	public String clkAContact_290014() {
		waitForExpectedElement(driver, Contact_290014A);		
		String text = Contact_290014A.getText();
		Contact_290014A.click();
		return text;
	}

}
