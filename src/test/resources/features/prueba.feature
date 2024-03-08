#Autor: Crihstian manco

  @HistoriaDeUsuario

  Feature: verify add articles to exito

    Me as a user WANT to enter the exito page

    @prueba
    Scenario: Add articles to exito
      Given I entry to the page exito
      When I add some products
      Then products are displayed in the cart
