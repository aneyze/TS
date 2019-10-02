@TS_Lojas
Feature: LojasFeature

  Realize validation of the feature/functionality "Lojas" on the website https://vivariomarrecife.com.br/lojas


  @primeiroTeste @automatizado
  Scenario: Cenario01 - Lojas - Search for invalid text
    Given a web browser is opened - lojas
    When the user clicks on Lojas
    And the user enters the field pesquisa texto with "Lala" and clicks on Buscar
    Then the message "NENHUM RESULTADO ENCONTRADO" is showed

  @segundoTeste @automatizado
  Scenario: Cenario02 - Lojas - Search for specific text
    Given a web browser is opened - lojas
    When the user clicks on Lojas
    And the user enters the field pesquisa categoria with "Beleza" and clicks on Buscar
    Then links related to 'Maquiagem' are shown with these values "ADCOS" "MAHOGANY" "SEPHORA"