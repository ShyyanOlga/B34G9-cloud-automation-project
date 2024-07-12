package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("environment"));
    }
    @Given("user logged in with username as {string} and password as {string}")
    public void user_logged_in_with_username_as_and_password_as(String username, String password) {
        loginPage.login(username, password);

    }
}
