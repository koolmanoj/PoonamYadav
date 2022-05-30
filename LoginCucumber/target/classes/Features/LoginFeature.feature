Feature: Verify the borrowing estimate
		 

	Scenario: Verify the borrowing estimate
	Given user on the given URL page 
    When user submits the form the following details:
    |Application Type|Number Of Dependents|Income|Other income|Living Expenses|Other loan repayments|Total Credit Card Limits|
    |Single|0|80000|10000|500|100|10000|
    And user clicks on borrow button
    Then borrowing estimate should be "$479,000"
   
	Scenario: Verify start over button function
		When user clicks on start over button
		Then whole form should be cleared
	
	Scenario: Verify message when living expense is set as $1
		When user enters Living Expenses with 1
		And user click on borrow button
		Then error message should be displayed