@story
Feature:A user wants to register on the utes page, to be part of the largest community of digital independent
        software testers in the world and improve their testing skills.

         I as a user
         wish to register on the Utes page
         to improve my testing skills

  @testCaseOne
    Scenario Outline:Verify each of the fields of the utes registration form by entering acceptable values
    Given the user enters the main page of utes
    When you are on the utes home page click the join today button
    And fill in the data corresponding to step one of the form
      | strName   | strLastname  | strEmail   | strMonth   | strDay  |strLanguages  | strYear  |
      | <strName> | <strLastname>| <strEmail> | <strMonth> | <strDay>|<strLanguages>| <strYear>|
    And fill in the data corresponding to step two of the form
      | strCity   | strZyp   |strCountry  |
      | <strCity> | <strZyp> |<strCountry>|
    And nd fill in the data corresponding to step three of the form
     |strSO  |strVersion  | srtCountry   |strLanguage   | strMobile  | strModel  | strOperatingSystem  |
     |<strSO>|<strVersion>| <strCountry> |<strLanguage> | <strMobile>| <strModel>| <strOperatingSystem>|
    And the user in step four finishes filling out the form and gives him continue
      | strPassword   | strConfirmePassword  |
      | <strPassword> | <strConfirmePassword>|
    Then user should be able to see the following text Welcome to the world's largest community of freelance software testers!

    Examples:
      | strName   | strLastname | strEmail            | strMonth | strDay  |strLanguages  | strYear  |  strCity       | strZyp   |strCountry  |strSO   |strVersion | strLanguage   | strMobile  | strModel  | strOperatingSystem  |  strPassword   | strConfirmePassword  |
      | javier    | Romero      | test                | March    | 22      |  Spanish     | 1994     |  Montería      | 10122021 |Colombia    |Windows |  10       | English       | Apple      | iPhone    | iOS 9 Beta          |  1067095499Ja@ | 1067095499Ja@        |
      | javier    | Romero      | Choucair            | March    | 22      |  Spanish     | 1994     |  Barranquilla  | 10122021 |Colombia    |Windows |  10       | English       | Apple      | iPhone    | iOS 9 Beta          |  1067095499Ja@ | 1067095499Ja@        |



