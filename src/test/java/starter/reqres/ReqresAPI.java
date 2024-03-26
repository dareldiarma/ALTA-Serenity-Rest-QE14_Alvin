package starter.reqres;

import io.restassured.http.ContentType;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.checkerframework.checker.units.qual.C;
import starter.utils.Constants;

import java.io.File;

public class ReqresAPI {
    public static String LIST_USER = Constants.BASE_URL+"/api/users?page={page}";
    public static String CREATE_USER = Constants.BASE_URL+"/api/users";
    public static String UPDATE_USER = Constants.BASE_URL+"/api/users/{id}";
    public static String DELETE_USER = Constants.BASE_URL+"/api/users/{id}";
    public static String USER_LOGIN = Constants.BASE_URL+"/api/login";
    public static String USER_REGISTER = Constants.BASE_URL+"/api/register";
    public static String LIST_USER_UNKNOWN = Constants.BASE_URL+"/api/{parameter}";
    @Step("Get list user with parameter page")
    public void getListUsers(int page){

        SerenityRest.given().pathParam("page", page);
    }
    @Step("post create user with valid json")
    public void postCreateUser(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }
    @Step("Update user with valid json and user id")
    public void putUpdateUser(int id, File json){
        SerenityRest.given().pathParam("id", id).contentType(ContentType.JSON).body(json);
    }
    @Step("Delete user with valid user id")
    public void deleteUser(int id){
        SerenityRest.given().pathParam("id", id);
    }

    @Step("User login with email and password")
    public void postUserLogin(File json){

        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }
    @Step("User register with email and password")
    public void postUserRegister(File json){

        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }
    @Step("Get list user with parameter unknown user")
    public void postGetListUserUnknown(String parameter){
        SerenityRest.given().pathParam("parameter", parameter);
    }
}
