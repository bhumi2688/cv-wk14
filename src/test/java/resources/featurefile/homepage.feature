
Feature: Home Page
  As a user I want to verify Job Search using different data set

  Scenario Outline: User should able to verify jobsearch using different data set
    Given user on HomePage
    When User accept cookies
    And User enter job title "<jobTitle>"
    And User enter Location "<location>"
    And User select distance "<distance>"
    And User click on moreSearchOptionsLink
    And User enter salaryMin "<salaryMin>"
    And User enter salaryMax "<salaryMax>"
    And User select salaryType "<salaryType>"
    And User select jobType "<jobType>"
    And User click on Find Jobs button
    Then User verify the result "<result>"
    Examples:
      | jobTitle                    | location               | distance       | salaryMin | salaryMax | salaryType | jobType   | result                                                   |
      | Tester                      | Harrow Green, Suffolk  | up to 5 miles  | 30000     | 500000    | annum      | Permanent | Permanent Tester jobs in Harrow Green                    |
      | Engineering Project Manager | East Sussex            | up to 15 miles | 200       | 300       | day        | Contract  | Contract Engineering Project Manager jobs in East Sussex |
      | Senior Finance Manager      | Crawley,West           | up to 15 miles | 80000     | 90000     | annum      | Contract  | Contract Senior Finance Manager jobs in Crawley          |
      | Teaching Assistant          | Edgware,London         | up to 10 miles | 20000     | 25000     | annum      | Part Time | Part Time Teaching Assistant jobs in Edgware             |
      | Head Teacher                | Croydon,Greater London | up to 15 miles | 10000     | 15000     | month      | Temporary | Temporary Head Teacher jobs in Croydon                   |
      | Company Accountant          | Reading                | up to 35 miles | 50000     | 90000     | annum      | Permanent | Permanent Company Accountant jobs in Reading             |
      | Customer Assistant          | East Sussex            | up to 15 miles | 900       | 1500      | month      | Part Time | Part Time Customer Assistant jobs in East Sussex         |
