package co.com.choucair.certification.prueba.pom.tasks;

import co.com.choucair.certification.prueba.pom.userinterfaces.ExitoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Performable;

public class OpenApp implements Task {
    private ExitoPage exitoPage;

    public static OpenApp Page(){
        return Tasks.instrumented(OpenApp.class);
    }

    @Override
        public  <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Open.browserOn(exitoPage)
        );
    }
}
