Feature: Cancellation Policy Normal Customer

As a financial administrator
I want to see the cancellation penalty when a reservation is cancelled
So that I can create an invoice


Scenario: Normal Customer with over 5000 euro reservation.

Given a normal customer
And given a reservation fee of 5001 dollars
When the customer cancels 14 days before arrival date
Then ensure the cancellation penalty is 3357.5 dollars

Given a normal customer
And given a reservation fee of 5001 dollars
When the customer cancels 15 days before arrival date
Then ensure the cancellation penalty is 1620.0 dollars

Given a normal customer
And given a reservation fee of 5000 dollars
When the customer cancels 10 days before arrival date
Then ensure the cancellation penalty is 3570.0 dollars

Scenario Outline: Normal Customer

Given a normal customer
And given a reservation fee of <reservationfee> dollars
When the customer cancels <cancelddaysbefore> days before arrival date
Then ensure the cancellation penalty is <penaltytopay> dollars


  Examples:
  |reservationfee|cancelddaysbefore|penaltytopay|
  |5001          |10               | 3357.5      |
  |5001          |15               | 1620.0      |
  |5000          |10               | 3570.0      |