#Senaryo ;
#1- siteyi açınız. adkl@gmail.com  ad12345678
#2- username ve password u gönderin ve Login butonuna tıklatın.
#3- Login olduğunuzu doğrulayın.

Feature: Login Functionality

  #username ve password girerek login doğrulama
  Scenario: Login with valid username and password

    #siteyi aç - basgara a git
    Given Navigate to basqar
    #username ve passwordu gir ve login butonuna tıklat
    When Enter username and password and click Login button
    #Login olduğunu doğrula
    Then User should login successfully

