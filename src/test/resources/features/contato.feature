@TS_Contato
Feature: ContatoFeature

  Realize validation of the feature/functionality "Contato" on the website https://vivariomarrecife.com.br/contato


  @quintoTeste @automatizado
  Scenario: Cenario05 - Contato - Not filling in the required fields to send a message
    Given a web browser is opened - contato
    When the user clicks on Contato
    And the user enters the fields "(82)98889-2989", "Meu Assunto Favorito" and "Minha mensagem é muito longa" and clicks on Enviar
    Then The message "Um ou mais campos possuem um erro. Verifique e tente novamente." is shown