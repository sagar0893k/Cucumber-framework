package stepdefinition;



import base.TestBase;
import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class IndexStepDefinition extends TestBase {

	TestBase tbase;
	
   
    @Given("^user is on index page$")
	public void user_is_on_index_page() {
		tbase=new TestBase();
		tbase.initialization();
       
 Assert.assertEquals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com",driver.getTitle());
	      
	}
	
	
	
	
	
	
}
