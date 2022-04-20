package automationpageutes.tasks;

import automationpageutes.models.DataModelStepFour;
import automationpageutes.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static automationpageutes.userinterfaces.MappinStepFour.*;

public class FillStepFour implements Task {
    private List<DataModelStepFour>dataFour;
    public FillStepFour(List<DataModelStepFour> dataFour){
        this.dataFour=dataFour;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor
                .attemptsTo(
                        Enter.theValue(dataFour.get(0).getStrPassword()).into(INPUT_PASSWORD),
                        Enter.theValue(dataFour.get(0).getStrConfirmePassword()).into(INPUT_CONFIRME_PASSWORD),
                        Click.on(CHECK_STAY),
                        Click.on(CHECK_TERMS),
                        Click.on(CHECK_PRIVACY)
                );
        Wait.Time(3000);
        actor.attemptsTo(
                Click.on(BUTTON_COMPLETE_SETUP)
        );

    }
    public static FillStepFour DataFour(List<DataModelStepFour>dataFour){
        return Tasks.instrumented(FillStepFour.class, dataFour);
    }
}
