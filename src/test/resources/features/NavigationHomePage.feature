
 Feature:  navigate on homepage

   @wip
   Scenario: check if user is able to navigate to Vorstand
     Given user is on homepage
     When user clicks on "About Us" tab and "Vorstand" module
     Then user should land on desired page