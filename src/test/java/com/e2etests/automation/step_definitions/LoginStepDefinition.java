package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {
	
	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	
	public LoginStepDefinition () {
		loginPage = new LoginPage () ; 
		configFileReader = new ConfigFileReader();
	}
	@Given("Je me connecte a l appli sawg labs")
    public void jeMeConnecteAlapplicationSwagLabs () {
	Setup.getDriver().get(configFileReader.getPropreties("home.url"));
	}
    @When("Je saisis le username (string)" )
    public void jeSaisisLeUsername(String username) {
    	loginPage.fillUsername(username);
}
	@When("Je saisis le password (string)")
    public void jeSaisisLePassword(String pswd) {
		loginPage.fillUPassword(pswd);
}
	@When("Je clique sur le bouton login")
    public void jeCliqueSurLeBoutonLogin() {
		loginPage.clickOnLogin();
	}

	@Then("Je me redirige vers la page home (string)") 
    public void jeMeRedirigeLaPageHome(String title ) {
		String title_page = LoginPage.titlePage.getText();
		Assert.assertEquals(title_page, title);
	}
}
