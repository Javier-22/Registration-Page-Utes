package automationpageutes.tasks;

import automationpageutes.models.DataModelStepThree;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static automationpageutes.userinterfaces.MappingStepThree.*;

public class FillStepThree implements Task {
    private List<DataModelStepThree>dataThree;
    public FillStepThree (List<DataModelStepThree> dataThree){this.dataThree=dataThree;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_SO),
                Enter.theValue(dataThree.get(0).getStrSO()).into(INPUT_SO),
                Click.on(SELECT_VERSION),
                Enter.theValue(dataThree.get(0).getStrVersion()).into(INPUT_VERSION),
                Click.on(LANGUAGE_DEVICE),
                Enter.theValue(dataThree.get(0).getStrLanguage()).into(INPUT_LANGUAGE_DEVICE),
                Click.on(MOBIL),
                Enter.theValue(dataThree.get(0).getStrMobile()+ Keys.ENTER).into(INPUT_MOBILE),
                Click.on(SELECT_MODEL),
                Enter.theValue(dataThree.get(0).getStrModel() + Keys.ENTER).into(INPUT_MODEL),
                Click.on(SELECT_SYSTEM),
                Enter.theValue(dataThree.get(0).getStrOperatingSystem()+ Keys.ENTER).into(INPUT_SYSTEM),
                Click.on(BUTTON_NEXT3)
        );

    }
    public static FillStepThree DataThree(List<DataModelStepThree> dataThree){
        return Tasks.instrumented(FillStepThree.class, dataThree);
    }
}
