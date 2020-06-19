Feature: Admin can add,delete,update,issue books and able to view books

Background:

Given Admin is on Login page
When Admin enters "madhavi@gmail.com","Madhavi@123"
Then Admin should be logged in

Scenario Outline: Admin should be able to add books
Given Admin is on adding book page
When Admin enters <bookName>,<authorName>,<publisherName>,<bookCategory>
Then Book should be added

Examples:
|bookName|authorName|publisherName|bookCategory|status|
|"ports"|"veenus"|"js publications"|"nets"|"Added Successfully"|

#Scenario: Admin should be able to remove books
#Given Admin is on removing book page
#When Admin clicks on remove book
#Then Book deleted successfully
#
#Scenario: Admin should be able to update books
#Given Admin is on updating book page
#When Admin enters 14202,"english","rakul","gopal","work"
#Then Book updated successfully
#
#Scenario: Admin should be able to view books
#Given Admin is on  viewing books page 
#When Admin  clicks on show books
#Then Admin  viewed booked sucessfully
#Then close browser page
#
#Scenario: Admin should be able to issue books 
#Given Admin  is on issuing book page
#When Admin  move hover on issuse
#Then Book issued successfully