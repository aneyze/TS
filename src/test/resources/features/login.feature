@TS_Login
Feature: LoginFeature

  Realize validation of the feature/functionality "Entrar (login)" on the website https://vivariomarrecife.com.br/login


  @terceiroTeste @automatizado
  Scenario: Cenario03 - Login - Login with invalid user and invalid password
    Given  a web browser is opened - login
    When the user clicks on Entrar
    And the user enters "blabla" and "123456" and clicks on Acessar
    Then the follow message "ERRO: Usuário ou senha inválido." is shown

  @quartoTeste @automatizado
  Scenario: Cenario04 - Login - Forgot the password not filling the field E-mail
    Given  a web browser is opened - login
    When the user clicks on Entrar
    And the user clicks on Esqueceu a Senha and presses ENTER in the field E-mail
    Then the follow error message "ERRO: Preencha corretamente o campo de usuário ou e-mail." is shown