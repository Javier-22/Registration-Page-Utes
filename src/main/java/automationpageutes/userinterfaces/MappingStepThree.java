package automationpageutes.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MappingStepThree {
    public static final Target SELECT_SO = Target.the("select operating system").located(By.xpath("//div[@id='web-device']//div[1]//div[2]//div"));
    public static final Target INPUT_SO = Target.the("user  operating system").located(By.xpath("//div[@id='web-device']//div[1]//div[2]//div//input[1]"));
    public static final Target SELECT_VERSION = Target.the("operating system version selections").located(By.xpath("//div[@id='web-device']//div[2]//div[2]//div"));
    public static final Target INPUT_VERSION = Target.the("operating system version").located(By.xpath("//div[@id='web-device']//div[2]//div[2]//div//input[1]"));
    public static final Target LANGUAGE_DEVICE = Target.the("Select lenguage").located(By.xpath("//div[@id='web-device']//div[3]//div[2]//div"));
    public static final Target INPUT_LANGUAGE_DEVICE = Target.the("Computer lenguage").located(By.xpath("//div[@id='web-device']//div[3]//div[2]//div//input[1]"));
    public static final Target MOBIL = Target.the("Select mobile").located(By.xpath("//div[@id='mobile-device']//div[1]//div[2]//div"));
    public static final Target INPUT_MOBILE = Target.the("Mobile").located(By.xpath("//div[@id='mobile-device']//div[1]//div[2]//div//input[1]"));
    public static final Target SELECT_MODEL = Target.the("select devece model ").located(By.xpath("//div[@id='mobile-device']//div[2]//div[2]//div"));
    public static final Target INPUT_MODEL = Target.the("device model ").located(By.xpath("//div[@id='mobile-device']//div[2]//div[2]//div//input[1]"));
    public static final Target SELECT_SYSTEM = Target.the("Select device operating system").located(By.xpath("//div[@id='mobile-device']//div[3]//div[2]//div"));
    public static final Target INPUT_SYSTEM = Target.the("Device operating system ").located(By.xpath("//div[@id='mobile-device']//div[3]//div[2]//div//input[1]"));
    public static final Target BUTTON_NEXT3 = Target.the("Button to continue").located(By.xpath("//div[@class='pull-right next-step']//a"));

}
