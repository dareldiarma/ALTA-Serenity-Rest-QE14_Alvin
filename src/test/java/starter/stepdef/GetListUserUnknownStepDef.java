package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

public class GetListUserUnknownStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Get list user with parameter {string}")
    public void getListUserWithParameter(String parameter) {
        reqresAPI.postGetListUserUnknown(parameter);
    }

    @When("Send request get list user with specific parameter")
    public void sendRequestGetListUserWithSpecificParameter() {
        SerenityRest.when().get(ReqresAPI.LIST_USER_UNKNOWN);
    }
}
