package starter.postcodes;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CreateUserAPI {

    @Step("Send create user request with name and job details")
    public void sendCreateUserRequest(){

        SerenityRest.given().
                //pathParam("name", "maverick").
                //pathParam("job","doer").
                put("https://reqres.in/api/users/4");

    }
}
