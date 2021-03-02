@LoginFeature @Sanity
  Feature: LoginFeature
    Background:
      User navigates to Facebook
      Given I am on Facebook login page

      @Test1
      Scenario: Login with valid userid and password

        When I enter username as "kaveri"
        And I enter password as "56786"
        Then I should be able to login inside the facebook
        And The title of web page should be facebook main page
