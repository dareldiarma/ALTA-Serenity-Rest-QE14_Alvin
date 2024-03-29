package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

public class DeleteStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Delete user with user id {int}")
    public void deleteUserWithUserId(int id) {
        reqresAPI.deleteUser(id);
    }

    @When("Send request delete user")
    public void sendRequestDeleteUser() {
        SerenityRest.when().delete(ReqresAPI.DELETE_USER);
    }

    @Given("Delete user with invalid user id {string}")
    public void deleteUserWithInvalidUserId(String id) {
        reqresAPI.deleterUserInvalidId(id);
    }
}
