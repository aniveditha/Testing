Feature: OrangeHRM Application Login Functionality

Scenario Outline: Validating OrangeHRM Application LogIn Functionality

 Given Navigate to OrangeHRM Application
 When User enters "<UserName>" UserName
 Then User enters "<Password>" Password
 Then User performs click operation on logIn button
 Then User "<LogInType>" able to successfully login to the applicaiton and close the application
 
 Examples:
 | UserName | Password | LogInType  |
 | Admin    | admin123 | shouldbe   |
 | admin    | Admin123 | shouldNot  |