package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class LoginStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("User login with valid email and password entered with json {string}")
    public void sendRequestLogin(String json){
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.postUserLogin(jsonFile);
    }

    @When("Send request to login")
    public void sendRequestToLogin() {
        SerenityRest.when().post(ReqresAPI.USER_LOGIN);
    }

    @Given("User login with invalid email and password entered with json {string}")
    public void userLoginWithInvalidEmailAndPasswordEnteredWithJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.postUserLogin(jsonFile);
    }
}
