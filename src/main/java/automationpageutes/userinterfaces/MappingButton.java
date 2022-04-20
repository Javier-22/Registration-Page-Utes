package automationpageutes.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MappingButton {
    public static final Target JOIN_TODAY_BUTTON = Target.the("registration button").located(By.xpath("//a[contains(text(),'Join Today')]"));
    public static final Target CONFIRMATION_TEST = Target.the("Join Today button").located(By.cssSelector("div.image-box-header > h1"));
}
