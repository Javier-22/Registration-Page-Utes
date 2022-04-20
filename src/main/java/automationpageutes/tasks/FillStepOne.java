package automationpageutes.tasks;

import automationpageutes.models.DataModelStepOne;
import automationpageutes.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static automationpageutes.userinterfaces.MappingStepOne.*;

public class FillStepOne implements Task {
    private List<DataModelStepOne> dataOne;
    public FillStepOne (List<DataModelStepOne> dataOne) { this.dataOne=dataOne;}
    @Override
    public <T extends Actor> void performAs(T actor) {

        String mail = dataOne.get(0).getStrEmail();
        int random = (int) (Math.random() * 10000);
        String email_complement = mail + random + "@utest.com";

        actor.attemptsTo(
                Enter.theValue(dataOne.get(0).getStrName()).into(INPUT_FIRSNAME),
                Enter.theValue(dataOne.get(0).getStrLastname()).into(INPUT_LASTNAME),
                Enter.theValue(email_complement).into(INPUT_EMAIL),
                Click.on(SELECT_MONTH),
                SelectFromOptions.byVisibleText(dataOne.get(0).getStrMonth()).from(SELECT_MONTH),
                Click.on(SELECT_DAY),
                SelectFromOptions.byVisibleText(dataOne.get(0).getStrDay()).from(SELECT_DAY),
                Click.on(SELECT_YEAR),
                SelectFromOptions.byVisibleText(dataOne.get(0).getStrYear()).from(SELECT_YEAR),
                Enter.theValue(dataOne.get(0).getStrLanguages()).into(INPUT_LANGUAGES),
                Click.on(SELECT_SPANISH),
                Click.on(NEXT_BUTTON));

    }
    public static FillStepOne DataOne(List<DataModelStepOne>dataOne){return Tasks.instrumented(FillStepOne.class, dataOne);}
}
