package automationpageutes.tasks;

import automationpageutes.models.DataModelStepTwo;
import automationpageutes.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static automationpageutes.userinterfaces.MappingStepTwo.*;

public class FillStepTwo implements Task {
    private List<DataModelStepTwo>dataTwo;
    public FillStepTwo(List<DataModelStepTwo> dataTwo)
    { this.dataTwo=dataTwo;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        Wait.Time(10000);
        actor.attemptsTo(
                Enter.theValue(dataTwo.get(0).getStrCity() + Keys.DOWN).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Enter.theValue(" ").into(INPUT_ZIP),
                Enter.theValue(dataTwo.get(0).getStrZyp()).into(INPUT_ZIP),
                Click.on(COUNTRY),
                Enter.theValue(dataTwo.get(0).getStrCountry()).into(SELECT_COUNTRY),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(SELECT_COUNTRY),
                Click.on(BUTTON_NEXT)
        );


    }
    public static FillStepTwo DataTwo(List<DataModelStepTwo>dataTwo){
        return Tasks.instrumented(FillStepTwo.class, dataTwo);
    }
}
