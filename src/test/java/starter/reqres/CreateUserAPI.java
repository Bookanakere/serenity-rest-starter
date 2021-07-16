package starter.reqres;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CreateUserAPI {

    @Step("Send create user request with name and job details")
    public void sendCreateUserRequest(){
        String body = "{\"name\": \"maverick\", \"job\": \"doer\"}";

        SerenityRest.given().body(body).
                post("https://reqres.in/api/users");
    }
}
