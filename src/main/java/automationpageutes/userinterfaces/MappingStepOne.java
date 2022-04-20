package automationpageutes.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MappingStepOne {
    public static final Target INPUT_FIRSNAME = Target.the("Register name user").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Register lastname user").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Register email user").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Select month").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("Select day").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("Select year").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES=Target.the("Enter Languages").located(By.xpath("//input[contains(@type, 'search')]"));
    public static final Target SELECT_SPANISH = Target.the("Select Languages").located(By.xpath("//span[@class='ui-select-highlight']"));
    public static final Target NEXT_BUTTON = Target.the("Button to continue").located(By.xpath("//span[contains(text(),'Next: Location')]"));

}
