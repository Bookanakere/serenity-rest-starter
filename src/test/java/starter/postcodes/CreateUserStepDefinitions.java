package starter.postcodes;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateUserStepDefinitions {

    @Steps
    CreateUserAPI createUserAPI;

    @When("I send a request to create user")
    public void iSendARequestToCreateUser() {
        createUserAPI.sendCreateUserRequest();
    }

    @Then("a user should be created")
    public void aUserShouldBeCreated() {
        restAssuredThat(response -> response.statusCode(200));
        System.out.println(lastResponse().body());
        // restAssuredThat(response -> response.body("'name'", equalTo(name)) );
    }
}
