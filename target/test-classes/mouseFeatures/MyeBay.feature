Feature:
@tag
Scenario: Verify user can view summary page
Given Open ebay application
Then mouse hover on MyeBay
Then click summary

@tag1
Scenario: Verify motors search result display
Given Open ebay application
Then select motors from  shop by category dropdown
Then click search
 
 @tag2
 Scenario: Verify count all the links in page
 Given Open ebay application
 Then count all the links