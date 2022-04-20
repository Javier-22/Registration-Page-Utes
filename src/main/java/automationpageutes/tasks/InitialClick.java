package automationpageutes.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static automationpageutes.userinterfaces.MappingButton.*;

public class InitialClick implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JOIN_TODAY_BUTTON)
        );

    }
    public static InitialClick ClickTo(){return Tasks.instrumented(InitialClick.class);
    }
}
