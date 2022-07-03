Feature: JBK offline application

@vvk
Scenario Outline: loginTest

Given User should be on login page
When User enter "<userName>" and "<pass>"
Then User will be on Home page

Examples:
|userName|pass|
|kiran@gmail.com|123456|
|vaibhav@gmail.com|12345|

@vvk1
Scenario: logoTest

Given User should be on login page
Then User should see JBK logo