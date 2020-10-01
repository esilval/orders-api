-- INSERT ORDERS

INSERT INTO ORDERS(ID, PRODUCT_ID, CLIENT_ID, QUANTITY, AMOUNT, TAXES, TOTAL_AMOUNT, STATE) VALUES (1, 1, 23, 1, 175.0 ,10.0, 185.0, 'FINISHED');
INSERT INTO ORDERS(ID, PRODUCT_ID, CLIENT_ID, QUANTITY, AMOUNT, TAXES, TOTAL_AMOUNT, STATE) VALUES (2, 1, 35, 1, 175.0 ,10.0, 185.0, 'IN_PROGRESS');
INSERT INTO ORDERS(ID, PRODUCT_ID, CLIENT_ID, QUANTITY, AMOUNT, TAXES, TOTAL_AMOUNT, STATE) VALUES (3, 3, 54, 3, 357.0 ,10.0, 1101.0, 'STARTED');
INSERT INTO ORDERS(ID, PRODUCT_ID, CLIENT_ID, QUANTITY, AMOUNT, TAXES, TOTAL_AMOUNT, STATE) VALUES (4, 3, 55, 1, 357.0 ,10.0, 367.0, 'IN_PROGRESS');
INSERT INTO ORDERS(ID, PRODUCT_ID, CLIENT_ID, QUANTITY, AMOUNT, TAXES, TOTAL_AMOUNT, STATE) VALUES (5, 6, 76, 2, 280.0 ,5.0, 570.0, 'STARTED');
INSERT INTO ORDERS(ID, PRODUCT_ID, CLIENT_ID, QUANTITY, AMOUNT, TAXES, TOTAL_AMOUNT, STATE) VALUES (6, 5, 23, 4, 275.0 ,10.0, 1140.0, 'STARTED');
INSERT INTO ORDERS(ID, PRODUCT_ID, CLIENT_ID, QUANTITY, AMOUNT, TAXES, TOTAL_AMOUNT, STATE) VALUES (7, 17, 14, 1, 1305.0 ,5.0, 1310.0, 'IN_PROGRESS');
INSERT INTO ORDERS(ID, PRODUCT_ID, CLIENT_ID, QUANTITY, AMOUNT, TAXES, TOTAL_AMOUNT, STATE) VALUES (8, 18, 35, 1, 1500.0 ,0.0, 1500.0, 'IN_PROGRESS');
INSERT INTO ORDERS(ID, PRODUCT_ID, CLIENT_ID, QUANTITY, AMOUNT, TAXES, TOTAL_AMOUNT, STATE) VALUES (9, 1, 87, 2, 175.0 ,5.0, 360.0, 'STARTED');
INSERT INTO ORDERS(ID, PRODUCT_ID, CLIENT_ID, QUANTITY, AMOUNT, TAXES, TOTAL_AMOUNT, STATE) VALUES (10, 17, 99, 1, 1305.0 ,5.0, 1310.0, 'IN_PROGRESS');
INSERT INTO ORDERS(ID, PRODUCT_ID, CLIENT_ID, QUANTITY, AMOUNT, TAXES, TOTAL_AMOUNT, STATE) VALUES (11, 4, 101, 3, 300.0 ,10.0, 930.0 , 'STARTED');

-- INSERT ORDER DETAILS

INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (1, 1, 'Purshase confirmation. On delivery.');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (2, 1, 'The package has been shipped. Be patient and be awaiting for the shipping details. ');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (3, 1, 'Shipping PIN: ABCD1234');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (4, 1, 'Package delivered. Enjoy it!');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (5, 2, 'Purshase confirmation. On delivery.');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (6, 2, 'The package has been shipped. Be patient and be awaiting for the shipping details. ');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (7, 3, 'Purshase confirmation. On delivery.');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (8, 4, 'Purshase confirmation. On delivery.');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (9, 4, 'The package has been shipped. Be patient and be awaiting for the shipping details. ');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (10, 5, 'Purshase confirmation. On delivery.');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (11, 6, 'Purshase confirmation. On delivery.');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (12, 7, 'Purshase confirmation. On delivery.');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (13, 7, 'The package has been shipped. Be patient and be awaiting for the shipping details. ');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (14, 7, 'Shipping PIN: WXYZ0987');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (15, 8, 'Purshase confirmation. On delivery.');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (16, 8, 'The package has been shipped. Be patient and be awaiting for the shipping details. ');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (17, 9, 'Purshase confirmation. On delivery.');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (18, 10, 'Purshase confirmation. On delivery.');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (19, 10, 'The package has been shipped. Be patient and be awaiting for the shipping details. ');
INSERT INTO ORDER_DETAILS(ID, ORDER_ID, DESCRIPTION) VALUES (20, 11, 'Purshase confirmation. On delivery.');