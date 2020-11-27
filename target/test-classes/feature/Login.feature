Feature: Application login

Scenario Outline: Home Page default Login

Given user is on landing page url "https://www.facebook.com/"
When user login <username> and <password> is login
Then Home page is landing
And cards are displayed

Examples:
|username  | password    |
|nagaraju  | nagaraj@123 |
|system    | temp@123    |

