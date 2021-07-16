package starter.reqres;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.reqres.CreateUserAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.matchesPattern;

public class CreateUserStepDefinitions {

    @Steps
    CreateUserAPI createUserAPI;

    @When("I send a request to create user")
    public void iSendARequestToCreateUser() {
        createUserAPI.sendCreateUserRequest();
    }

    @Then("a user should be created")
    public void aUserShouldBeCreated() {
        Date date = new Date();
        String formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
        restAssuredThat(response -> response.statusCode(201)
                                                .body("createdAt",matchesPattern(""+formattedDate+".+")));
    }
}
