package co.com.choucair.certification.prueba.pom.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchExitoPage extends PageObject {
    public static final Target SELECT_PROD1 = Target.the("Boton prod1")
            .located(By.xpath("//div/div/button/span[text()='Agregar'])[5]"));
}
