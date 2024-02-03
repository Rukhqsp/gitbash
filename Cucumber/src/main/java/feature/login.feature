Feature:

Background:
Given Login page must display

Scenario: 

When Enter the valid username
And Enter the valid password
And Click on login button
Then Home page must display

Scenario:

When Enter the valid username
And Enter the invalid password
And Click on login button
Then Home page must not display

Scenario:

When Enter the blank username
And Enter the blank password
And Click on login button
Then Home page must not display

Scenario:

When Enter the wrong username
And Enter the wring password
And Click on login button
Then Home page must not display

