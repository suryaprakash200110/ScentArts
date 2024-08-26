Feature: To vaildate the scentarts application 

Scenario: To verify the about us page
Given To launch the browser and maximise the window
When  To launch the url of scentarts application
And  To click the About us button
And  To scroll down into “ AREAS OF SCENTING” section
And  To click the Hotel button
And  To click another offices button
And finally click the Airports button
Then To close the chrome browser


Scenario: To verify the our services page
Given  To launch the firefox browser and maximise the window
When To launch url of scentarts application
And To click the our services button
And To scroll down into contect us section
And To click the  contect us button
Then  To close the firefox browser

Scenario:  To Verify ContactUs Page Functionality 
Given  To launch the chrome browser and maximise the window
When To launch scentarts application url
And Want To click the  contect us button
And Scroll down to form filling section
And To pass the name in full name text box
|Suryaprakash|Arunkumar|Mownish|Madhan|
And To pass the company name company name
|Bluzinfo|Inmakes|Tcs|
|Wibro|Cognizent|Google|
And To pass the phone number in phone number text box
|no1|9876543210|
|no2|1234567890|
|no3|6789054321|
And To pass the valid email id in email text box
|email1         |email2           |email3           |
|surya@gmail.com|Arun@gamil.com   |madhan@gmail.com |
|Arya@gmail.com |prasath@gmail.com|mownish@gmail.com|
And To pass the message in message text box
And To click the send button
Then  To close the Chrome browser

