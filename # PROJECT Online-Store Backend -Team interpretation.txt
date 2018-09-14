# Online Store Archive Backend #

**OBJECTIVE**
Creation of a software system for maintaining the sales archive of a fictional online store using a MySQL database, with facilities for generating receipts in PDF format and reports displayed in simple web pages.

**PROJECT REQUIREMENTS**
This system is planned to become a part of a new backend system for a fictitious online store application.
It will be used to maintain in a database the archive of finalized transactions of the store. So, all transactions, customers and payments data are to be considered final and un-editable.
The system should allow the inclusion of the pre-existent archive of past transactions of the store, kept in CSV files.
The implemented module must meet these requirements:

1) You must define and create the database structure for keeping the archived data, and also adding more data and getting all the data later.

2) At first use, the database will be populated with historical data archived in CSV files:
- a file with Customers data (including their Address information);
- a file with Carts data (including their purchases: product categories and amount for each category);
- a file with Payments data. 
(You should define the structure of these CSV files and add data into them prior to this one-time use.)

3) Make sure that each Cart-object belongs to one and only one Customer.

4) Make sure to allow for one or more Payment-objects to be linked to a Cart-object.

5) Payments might have different types (e.g. credit card, cash, PayPal). A payment type can cover the whole value of a Cart or only a part of it, so more than 1 Payment can be associated with a Cart.
All payments must be considered already processed and finalized. 
Sensitive information is forbidden from being stored (like full credit card number or cvv).

6) A functionality must be offered for the creation of a Receipt for any Cart-object.
These receipts are to be generated in PDF format and saved locally.
A Receipt-object should contain the cart details (items which were ordered) and payments associated with that cart. 
Depending on the chosen implementation, you should save in a DB -- this is just an example -- the cart id, receipt as PDF (CLOB or BLOB column type in DB). You could save in different columns some details about these carts, like amount, payment type, type of items contained (ex. mobiles, TV, laptops, furniture, kids toys, clothes etc.) plus subtotals per each category.
*EXAMPLE*: receipt with ID 12345 contains for category laptop 4317 RON, for kids toys 1000 ron and for clothes 532 RON, having a total of 4317 + 1000 + 532 = 5849 RON.

7) A functionality must be offered for the creation of Reports.
The reports should be displayed in a web page, using Spark Java and Mustache templates for instance.
The following reports should be available:
- total sales of today;
- total sales per each category in the last month;
- a top of best sold categories;
- a top of best customers in the last month.
