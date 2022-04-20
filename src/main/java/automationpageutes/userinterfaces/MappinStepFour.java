package automationpageutes.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MappinStepFour {
    public static final Target INPUT_PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target INPUT_CONFIRME_PASSWORD = Target.the("Confirm Password").located(By.id("confirmPassword"));
    public static final Target CHECK_STAY = Target.the("CHECK optional information").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_TERMS = Target.the("CHECK terms and Conditions").located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACY = Target.the("CHECK Privacy").located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Data confirmation button").located(By.id("laddaBtn"));
}



