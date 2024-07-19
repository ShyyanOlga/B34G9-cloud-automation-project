@B34G9-164
Feature: Default

	Background:
		#@B34G9-116
		Given user is on the login page
		Given user logged in with username as "user1" and password as "Userpass123"
		

	
	@B34G9-160
	Scenario: Verify user can add any file to favorites from its own three dots menu
		When Click file module
				And Redirected to file page  
				When Click tree dots menu on chosen file
				And Dropdown menu appeared under tree dots menu
				When Click on add favorites 
			    And file was selected
				When Click favorite button
				And Redirected to favorite page
				Then Chosen file is selected
				When Click tree dots menu in favorites
				And Click remover from favorites

	
	@B34G9-161
	Scenario: Verify user can rename any file from its own three dots menu
		When Click file module
				And Redirected to file page  
				When Click tree dots menu on chosen file
				And Dropdown menu appeared under tree dots menu
				When Click rename 
				And Input box for file name appeared
				When Type in new file name and click enter
				And File renamed	

	
	@B34G9-162
	Scenario: Verify user can choose to see details of the file from its own three dots menu
		When Click file module
				And Redirected to file page  
				When Click tree dots menu on chosen file
				And Dropdown menu appeared under tree dots menu
				When Click details 
				And File details appeared on the left site of the screen with details	

	
	@B34G9-163
	Scenario: Verify user can add comment to any file
		When Click file module
				And Redirected to file page  
				When Click on the angle sign
				And File information displayed on the left site of the screen
				When  Click comments button 
				And Input box for comment appeared 
				When Type in comment
				And Click on arrow button
				Then Comment appeared under the comment input box