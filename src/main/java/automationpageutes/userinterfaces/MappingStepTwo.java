package automationpageutes.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MappingStepTwo {
    public static final Target INPUT_CITY = Target.the("Register City").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Register zip").located(By.id("zip"));
    public static final  Target COUNTRY=Target.the("country").located(By.cssSelector("div[name='countryId']"));
    public static final Target SELECT_COUNTRY=Target.the("Select country").located(By.cssSelector("input[placeholder='Select a country']"));
    public static final Target BUTTON_NEXT = Target.the("Button to continue").located(By.xpath("//span[contains(text(),'Next: Devices')]"));

}
