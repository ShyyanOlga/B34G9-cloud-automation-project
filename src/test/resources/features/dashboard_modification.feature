@B34G9-148
Feature: Default

	Background:
		Given user is on the login page
		Given user logged in with username as "user1" and password as "Userpass123"
		

	
	@B34G9-136
	Scenario: Verify user can see all modules
		Then Can see all 12 modules on the page displayed

	
	@B34G9-137
	Scenario: Verify ser can see username displayed when click user icon
		When Click user icon
				And Dropdown menu appeared 
				Then See user name displayed	

	
	@B34G9-138 # cleaning in Hook class
	Scenario: Verify user can click on Customize button and select any of the Widgets 
		        When Click customize module
				And Popup window is displayed
				And See 10 widgets displayed
				When Click on widgets 
				And Widgets are selected
				And Click X button
				And Selected all Widgets are appeared on the screen
				#Then Unselect all Widgets if selected



	
	@B34G9-139
	Scenario: Verify user can click on Online Status button and select Away Status options
		        When Click user icon
				And Dropdown menu appeared 
				When Click on the online status
		        When Click Away
				And Away is selected
				And Click X button
				#And Popup window disappeared
				When Click user icon 
				And Dropdown menu appeared 
				Then Away status is selected

	# stoped here take this tag
	@B34G9-141
	Scenario: Verify user can click on Online Status button and select Do not disturb Status options
		        When Click user icon
				And Dropdown menu appeared 
				When Click on the online status
		        When Click Do not disturb
				And Do not disturb status is selected
				And Click X button
			#	And Popup window disappeared
				When Click user icon 
				And Dropdown menu appeared 
				Then Do not disturb status is selected	

	
	@B34G9-142
	Scenario: Verify user can click on Online Status button and select Invisible Status options
		        When Click user icon
				And Dropdown menu appeared 
				When Click on the online status
				When Click Invisible 
				And Invisible status is selected
				And Click X button
			#	And Popup window disappeared
				When Click user icon 
				And Dropdown menu appeared 
				Then Invisible status is selected	

	
	@B34G9-143
	Scenario: Verify user can click on Set Status button and select In a meeting of the Status options
				When Click user icon
				And Dropdown menu appeared
				When Click on the online status
				When Click In a meeting
				And Click Set status message
			#	When Popup window disappeared
				When Click user icon 
				And Dropdown menu appeared 
				Then In a meeting status is selected	

	
	@B34G9-144
	Scenario: Verify user can click on Set Status button and select Commuting of the Status options
				When Click user icon
				And Dropdown menu appeared
				When Click on the online status
				When Click Commuting
				And Click Set status message
			#	When Popup window disappeared
				When Click user icon 
				And Dropdown menu appeared 
				Then Commuting status is selected	

	
	@B34G9-145
	Scenario: Verify user can click on Set Status button and select Working remotely of the Status options
				When Click user icon
				And Dropdown menu appeared
				When Click on the online status
				When Click Working remotely
				And Click Set status message
			#	When Popup window disappeared
				When Click user icon 
				And Dropdown menu appeared 
				Then Working remotely status is selected	

	
	@B34G9-146
	Scenario: Verify user can click on Set Status button and select Out sick of the Status options
				When Click user icon
				And Dropdown menu appeared
				When Click on the online status
				When Click Out sick
				And Click Set status message
			#	When Popup window disappeared
				When Click user icon 
				And Dropdown menu appeared 
				Then Out sick status is selected	

	
	@B34G9-140
	Scenario: Verify user can click on Online Status button and select Online Status options
				When Click user icon
				And Dropdown menu appeared 
				When Click on the online status
				When Click Online 
				And Online status is selected
				And Click X button
			#	And Popup window disappeared
				When Click user icon 
				And Dropdown menu appeared 
				Then Online status is displayed

	
	@B34G9-147
	Scenario: Verify user can click on Set Status button and select Vacationing of the Status options
				When Click user icon
				And Dropdown menu appeared
				When Click on the online status
				When Click Vacationing
				And Click Set status message
			#	When Popup window disappeared
				When Click user icon 
				And Dropdown menu appeared 
				Then Vacationing status is selected