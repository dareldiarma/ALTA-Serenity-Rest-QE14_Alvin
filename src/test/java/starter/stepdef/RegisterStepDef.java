package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class RegisterStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("User register with valid email and password entered with json {string}")
    public void userRegisterWithValidEmailAndPasswordEnteredWithJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.postUserRegister(jsonFile);
    }

    @When("Send request to register")
    public void sendRequestToRegister() {
        SerenityRest.when().post(ReqresAPI.USER_REGISTER);
    }

    @Given("User register with invalid email and password entered with json {string}")
    public void userRegisterWithInvalidEmailAndPasswordEnteredWithJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.postUserRegister(jsonFile);
    }
}
