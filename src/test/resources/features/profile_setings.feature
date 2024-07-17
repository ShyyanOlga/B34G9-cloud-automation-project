@B34G9-156
Feature: Functionality for profile info settings under the Profile module

	Background:
		#@B34G9-116
		Given user is on the login page
		Given user logged in with username as "user1" and password as "Userpass123"
		

	
	@B34G9-152
	Scenario: Verify user can see Name Email Phone Number under Profile Settings
				When Click user icon
				And Dropdown menu appeared
				When Click on the settings
				And See personal info displayed on the middle of the screen	

	
	@B34G9-153
	Scenario: Verify  personal info displayed in the top left corner of the screen
				When Click user icon
				And Dropdown menu appeared
				When Click on the settings
				And See personal info displayed in the top left corner of the screen	

	
	@B34G9-154
	Scenario: Verify username in the user input box match with the name profile dropdown menu
		When Click user icon
		And Dropdown menu appeared
		When Click on the settings
		And Click user icon
		And Username in the user input box match with the name profile dropdown menu	

	
	@B34G9-155
	Scenario Outline: Verify user cannot pass any characters except numbers into the "Phone Number" input box.
				When Click user icon
				And Dropdown menu appeared
				When Click on the settings
				And Type in the phone number input box "<phone number>"
				Then Should accept only "<numbers excepted>"
				Examples:
				|phone number | numbers excepted|
				|1234567890	  |  1234567890     |
		        |2345678906	  |  2345678906	    |
				|3456789021   |  3456789021     |
		@letters
				Examples:
				|phone number |	numbers excepted|
				|lfkdjshafcb  |  lfkdjshafcb    |
		        |lalanono	  |  lalanono	    |
				|numota       |  numota         |