package automationpageutes.questions;

import automationpageutes.userinterfaces.MappingButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ConfirmationTex implements Question <Boolean>{
    private String tex;

    public ConfirmationTex(String tex){this.tex=tex;}

    public static ConfirmationTex Img(String tex) {return  new ConfirmationTex(tex);}


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resul;
        String confirmation = (MappingButton.CONFIRMATION_TEST.resolveFor(actor).getText());
        if (confirmation.contains(tex)) {
            resul = true;
        } else {
            resul=false;
        }
        return resul;
    }
}



