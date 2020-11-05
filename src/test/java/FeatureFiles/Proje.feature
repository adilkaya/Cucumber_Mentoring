#Senaryo ;
#1- siteyi açınız. adkl@gmail.com  ad12345678
#2- username ve password u gönderin ve Login butonuna tıklatın.
#3- Login olduğunuzu doğrulayın.

Feature: Login Functionality

  #username ve password girerek login doğrulama
  Background: Login with valid username and password

    #siteyi aç - basgara a git
    Given Navigate to automationpractice
    #username ve passwordu gir ve login butonuna tıklat
    When Enter username and password and click Login button
     #Contac us a tikladik
    And Navigate to Contac us page


  Scenario Outline: Contac us input test

  #1- costumo - email mesaage send
  #2- costumo  email send message YOK
  #3- costumo  email yanlis, message

    When User select a "<SubjectHeading>" enter a "<Message>" and "<email>"
    Then Success error message should be displayed


    Examples:
      | SubjectHeading             | Message             | email  |
      | Customer service           | nasilsiniz bugun    | adkl@gmail.com  |
      | Customer service           |                     | adkl@gmail.com  |
      | Customer service           | nasilsiniz bugun    | lkdkgmailcom  |


