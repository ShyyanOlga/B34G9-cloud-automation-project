@B34G9-126
Feature: File search verification

	Background:
		#@B34G9-116
		Given user is on the login page
		Given user logged in with username as "user1" and password as "Userpass123"
		

	
	@B34G9-117
	Scenario: Verify user can search file typing its name through the magnifying glass icon inside any Module
		Given Click Contacts page module
			When  Click contact icon
			And File search input box appeared
			When Type in "us_06.png" file name
			And File appeared under the search input box
			When Click on matching file
			Then Redirected to files module
			Then File appeared in the list of files
			Then File is displayed on the left	

	
	@B34G9-118
	Scenario: Verify as a user, I should be able to search file or contact from the Dashboard Calendar page
		Given Click Calendar page module
			When  Click contact icon
			And File search input box appeared
			When Type in "us_06.png" file name
			And File appeared under the search input box
			When Click on matching file
			Then Redirected to files module
			Then File appeared in the list of files
			Then File is displayed on the left	

	
	@B34G9-119
	Scenario: Verify  as a user, I should be able to search file or contact from the Dashboard Photos page
		Given Click Photos page module
			When  Click contact icon
			And File search input box appeared
			When Type in "us_06.png" file name
			And File appeared under the search input box
			When Click on matching file
			Then Redirected to files module
			Then File appeared in the list of files
			Then File is displayed on the left	

	
	@B34G9-120
	Scenario: Verify as a user, I should be able to search file or contact from the Dashboard Activity page
		Given Click Activity page module
			When  Click contact icon
			And File search input box appeared
			When Type in "us_06.png" file name
			And File appeared under the search input box
			When Click on matching file
			Then Redirected to files module
			Then File appeared in the list of files
			Then File is displayed on the left	

	
	@B34G9-121
	Scenario: Verify  as a user, I should be able to search file or contact from the Dashboard Files page
		Given Click Files page module
			When  Click contact icon
			And File search input box appeared
			When Type in "us_06.png" file name
			And File appeared under the search input box
			When Click on matching file
			Then Redirected to files module
			Then File appeared in the list of files
			Then File is displayed on the left	

	
	@B34G9-122
	Scenario: Verify as a user, I should be able to search file or contact from the Dashboard Circles page
		Given Click Circles page module
			When  Click contact icon
			And File search input box appeared
			When Type in "us_06.png" file name
			And File appeared under the search input box
			When Click on matching file
			Then Redirected to files module
			Then File appeared in the list of files
			Then File is displayed on the left	

	
	@B34G9-123
	Scenario: Verify  as a user, I should be able to search file or contact from the Dashboard Deck page
		Given Click Deck page module
			When  Click contact icon
			And File search input box appeared
			When Type in "us_06.png" file name
			And File appeared under the search input box
			When Click on matching file
			Then Redirected to files module
			Then File appeared in the list of files
			Then File is displayed on the left	

	
	@B34G9-124
	Scenario: Verify as a user, I should be able to search file or contact from the Dashboard Talk page
		Given Click Talk page module
			When  Click contact icon
			And File search input box appeared
			When Type in "us_06.png" file name
			And File appeared under the search input box
			When Click on matching file
			Then Redirected to files module
			Then File appeared in the list of files
			Then File is displayed on the left	

	
	@B34G9-125
	Scenario: Verify  user can navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page
		Given Click Talk page module
			When  Click contact icon
			And File search input box appeared
			When Type in "us_06.png" file name
			And File appeared under the search input box
			When Click on matching file
			Then Redirected to files module
			And Click trycloud icon
			Then Redirected to the Dashboard