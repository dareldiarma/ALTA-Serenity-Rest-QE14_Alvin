package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.zh_cn.假如;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class ResponsesStepDef {
    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {

        SerenityRest.then().statusCode(statusCode);
    }
    @And("Validate json schema {string}")
    public void validateJsonSchema(String json) {
        File jsonFile = new File(Constants.JSON_SCHEMA+json);
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(jsonFile));
    }
    @And("Response body page should be {string} and {string}")
    public void responseBodyPageShouldBeAnd(String name, String job) {
        SerenityRest.and().body(ReqresResponses.NAME,equalTo(name)).body(ReqresResponses.JOB,equalTo(job));
    }
    @And("Response body page should be {int}")
    public void responseBodyPageShouldBe(int page) {
        SerenityRest.and().body(ReqresResponses.PAGE,equalTo(page));
    }

}
