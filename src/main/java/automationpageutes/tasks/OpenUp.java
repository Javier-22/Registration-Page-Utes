package automationpageutes.tasks;

import automationpageutes.userinterfaces.OpenUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private OpenUpPage openuppage;
    public static OpenUp theUrl() {return Tasks.instrumented(OpenUp.class);}
    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(openuppage));}

}