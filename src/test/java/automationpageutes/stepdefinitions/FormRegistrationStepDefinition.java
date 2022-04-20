package automationpageutes.stepdefinitions;

import automationpageutes.models.DataModelStepFour;
import automationpageutes.models.DataModelStepOne;
import automationpageutes.models.DataModelStepThree;
import automationpageutes.models.DataModelStepTwo;
import automationpageutes.questions.ConfirmationTex;
import automationpageutes.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormRegistrationStepDefinition {
    @Before
    public void sedStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^the user enters the main page of utes$")
    public void theUserEntersTheMainPageOfUtes() {
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.theUrl());}

    @When("^you are on the utes home page click the join today button$")
    public void youAreOnTheUtesHomePageClickTheJoinTodayButton() {
        theActorInTheSpotlight().attemptsTo(InitialClick.ClickTo());
    }

    @And("^fill in the data corresponding to step one of the form$")
    public void fillInTheDataCorrespondingToStepOneOfTheForm(List<DataModelStepOne>dataModelStepOne) {
        theActorInTheSpotlight().attemptsTo(FillStepOne.DataOne(dataModelStepOne));
    }

    @And("^fill in the data corresponding to step two of the form$")
    public void fillInTheDataCorrespondingToStepTwoOfTheForm(List<DataModelStepTwo>dataModelStepTwo) {
        theActorInTheSpotlight().attemptsTo(FillStepTwo.DataTwo(dataModelStepTwo));
    }

    @And("^nd fill in the data corresponding to step three of the form$")
    public void ndFillInTheDataCorrespondingToStepThreeOfTheForm(List<DataModelStepThree>dataModelStepThree) {
        theActorInTheSpotlight().attemptsTo(FillStepThree.DataThree(dataModelStepThree));
    }

    @And("^the user in step four finishes filling out the form and gives him continue$")
    public void ndTheUserInStepFourFinishesFillingOutTheFormAndGivesHimContinue(List<DataModelStepFour>dataModelStepFour) {
        theActorInTheSpotlight().attemptsTo(FillStepFour.DataFour(dataModelStepFour));
    }


    @Then("^user should be able to see the following text (.*)$")
    public void userShouldBeAbleToSeeTheFollowingText(String tex){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirmationTex.Img(tex)));

    }
}

