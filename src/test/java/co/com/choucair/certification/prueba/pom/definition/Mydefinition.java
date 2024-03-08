package co.com.choucair.certification.prueba.pom.definition;

import co.com.choucair.certification.prueba.pom.tasks.OpenApp;
import co.com.choucair.certification.prueba.pom.tasks.SearchProduct;
import cucumber.api.java.Before;
import  cucumber.api.java.en.Given;
import  cucumber.api.java.en.Then;
import  cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

public class Mydefinition {

   @Before
   public void setStage(){
       OnStage.setTheStage((new OnlineCast()));
   }
    @Given("^I entry to the page exito$")
    public void iEntryToThePageExito() {
        OnStage.theActorCalled("Crihstian").wasAbleTo(OpenApp.Page());
        }
      @When("^I add some products$")
        public void iAddSomeProducts() {
              OnStage.theActorInTheSpotlight().attemptsTo(SearchProduct.AddItems());
          }

    @Then("^products are displayed in the cart$")
        public void productsAreDisplayedInTheCart(){
    }

    }


