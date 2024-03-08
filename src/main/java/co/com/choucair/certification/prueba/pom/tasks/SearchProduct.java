package co.com.choucair.certification.prueba.pom.tasks;

import co.com.choucair.certification.prueba.pom.userinterfaces.SearchExitoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchProduct implements Task {

    private SearchExitoPage searchExitoPage;
    public static SearchProduct AddItems() {
        return Tasks.instrumented(SearchProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(SearchExitoPage.SELECT_PROD1)
        );

    }
}




