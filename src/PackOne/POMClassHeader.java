package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClassHeader 
{
 private WebDriver driver;
 
 @FindBy(xpath="/html/body/div[1]/career-website/section/div/section"
 		+ "/section[1]/career-website-header-layout2/header/div/div/div/div/h2")
	private WebElement JoinOurCrew;
    public String joinOurCrew()
    {
    	String actualText=JoinOurCrew.getText();
    	System.out.println("Actual text is :" + actualText );
		return actualText;
       }
    
    @FindBy(xpath="//lyte-icon[@class='dropdown'=\"ALL\"]")
	private WebElement FilterByDropdown;
    public void filterByDropdown()
    {
    	FilterByDropdown.click();
    }
    
    @FindBy(xpath="//lyte-drop-item[@data-value='Engineering']")
	private WebElement SelectEng;
    public void selectEng()
    {
    	SelectEng.click();
    }
    
    @FindBy(xpath="/html/body/div[1]/career-website/section/div/section"
    		+ "/section[2]/div/career-website-job-layout1/div/div[3]/div/"
    		+ "div/ul/career-website-job-listing-layout1[3]/li/h3")
	private WebElement QAEng;
    public void qAEng()
    {
    	QAEng.click();
    }
    @FindBy(xpath="/html/body/div[2]/career-website-detail/section/div[2]/div[2]/"
    		+ "div/div/lyte-button/button/lyte-yield")
	private WebElement iminterested;
    public void imInterested()
    {
    	iminterested.click();
    }
    
    @FindBy(xpath="/html/body/div[2]/career-website-detail/"
    		+ "section/div[3]/career-website-detail-template-2/div/div[3]/div/"
    		+ "portal-manual-apply/form/rec-form-component/div[1]/div/div[1]/div/"
    		+ "crux-text-component/div/lyte-input/div/input")
	private WebElement FName;
    public void enterFName()
    {
    	FName.sendKeys("Utkarsha");
    }
    
    @FindBy(xpath="/html/body/div[2]/career-website-detail/section/"
    		+ "div[3]/career-website-detail-template-2/div/div[3]/div/"
    		+ "portal-manual-apply/form/rec-form-component/div[1]/div/div"
    		+ "[2]/div/crux-text-component/div/lyte-input/div/input")
	private WebElement LName;
    public void enterLName()
    {
    	LName.sendKeys("Kulkarni");
    }
    
    @FindBy(xpath="/html/body/div[2]/career-website-detail/section/div[3]/"
    		+ "career-website-detail-template-2/div/div[3]/div/portal-manual-apply"
    		+ "/form/rec-form-component/div[1]/div/div[3]/div/crux-email-component/"
    		+ "div/lyte-input/div/input")
	private WebElement Email;
    public void enterEmail()
    {
    	Email.sendKeys("utkarshakulkarni2123@gmail.com");
    }
    
    @FindBy(xpath="/html/body/div[2]/career-website-detail/section/div[3]/career-website-detail"
    		+ "-template-2/div/div[3]/div/portal-manual-apply/form/rec-form-component/div[1]/div"
    		+ "/div[4]/div/crux-phone-component/div/div/lyte-input/div/input")
	private WebElement mobile;
    public void entermobile()
    {
    	mobile.sendKeys("9766250294");
    }
    
    @FindBy(xpath="/html/body/div[2]/career-website-detail/section/div[3]/"
    		+ "career-website-detail-template-2/div/div[3]/div/portal-manual-apply/"
    		+ "form/rec-form-component/div[3]/div/div[1]/div/crux-text-component/div"
    		+ "/lyte-input/div/input")
	private WebElement currentEmployer;
    public void enterCurrentEmployer()
    {
    	currentEmployer.sendKeys("Klean Environmental Consultance");
    }
    
    @FindBy(xpath="/html/body/div[2]/career-website-detail/section/div[3]/career-"
    		+ "website-detail-template-2/div/div[3]/div/portal-manual-apply/form/"
    		+ "rec-form-component/div[3]/div/div[2]/div/crux-picklist-component/div"
    		+ "/lyte-dropdown/div[1]/lyte-drop-button/lyte-icon")
	private WebElement currentjobDropdown;
    public void currentjobDropdown()
    {
    	currentjobDropdown.click();
    }

    
    @FindBy(xpath="/html/body/lyte-drop-box/lyte-drop-body/lyte-drop-item[2]")
	private WebElement currentJobTitle;
    public void enterCurrentJobTitle()
    {
    	currentJobTitle.sendKeys("Technical chemist");
    }
    
    @FindBy(xpath="/html/body/div[2]/career-website-detail/section/div[3]/career-"
    		+ "website-detail-template-2/div/div[3]/div/portal-manual-apply/form/"
    		+ "rec-form-component/div[3]/div/div[3]/div/rec-skills-component/"
    		+ "skills-tag/ul")
	private WebElement SkillSet;
    public void enterSkill()
    {
    	SkillSet.sendKeys("Java");
    }    
    
    @FindBy(xpath="/html/body/div[2]/career-website-detail/section/div[3]/career-"
    		+ "website-detail-template-2/div/div[3]/div/portal-manual-apply/form/"
    		+ "rec-form-component/div[3]/div/div[4]/div/crux-text-component/div/"
    		+ "lyte-input/div/input")
	private WebElement CurrantCTC;
    public void enterCurrantCTC()
    {
    	CurrantCTC.sendKeys("200000");
    }
    
    @FindBy(xpath="/html/body/div[2]/career-website-detail/section/div[3]/career-"
    		+ "website-detail-template-2/div/div[3]/div/portal-manual-apply/form/"
    		+ "rec-form-component/div[3]/div/div[5]/div/crux-text-component/div/"
    		+ "lyte-input/div/input")
	private WebElement ExpectedCTC;
    public void enterExpectedCTC()
    {
    	ExpectedCTC.sendKeys("500000");
    }
    
    @FindBy(xpath="/html/body/div[2]/career-website-detail/section/div[3]/"
    		+ "career-website-detail-template-2/div/div[3]/div/portal-manual-apply/"
    		+ "form/rec-form-component/div[4]/div/div[1]/div/crux-number-component/"
    		+ "div/lyte-input/div/input")
	private WebElement noticeperiod;
    public void enternoticeperiod()
    {
    	noticeperiod.sendKeys("");
    }
    
    public POMClassHeader (WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
}
