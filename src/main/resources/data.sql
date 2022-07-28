insert into UserTable(username, emailAddress, hasSignedUp) values ('Saad','saad@gmail.com', TRUE);
insert into UserTable(username, emailAddress, hasSignedUp) values ('Shrey','shrey@gmail.com', FALSE);
insert into UserTable(username, emailAddress, hasSignedUp) values ('Bhavay','bhavay@outlook.com', TRUE);
insert into UserTable(username, emailAddress, hasSignedUp) values ('Mike','mike@outlook.com.com', TRUE);

insert into ShoeTable(price, size, category, color) values (10000, 10, 'sneakers', 'red');
insert into ShoeTable(price, size, category, color) values (7000, 9, 'tennis', 'white');
insert into ShoeTable(price, size, category, color) values (12000, 11, 'sneakers', 'red');
insert into ShoeTable(price, size, category, color) values (7000, 7, 'running', 'blue');
insert into ShoeTable(price, size, category, color) values (12000, 6, 'tennis', 'yellow');
insert into ShoeTable(price, size, category, color) values (1000, 6, 'running', 'red');


insert into PurchaseTable(userId, shoeId, date) values (3, 1, '2021-01-11');
insert into PurchaseTable(userId, shoeId, date) values (2, 2, '2020-01-12');
insert into PurchaseTable(userId, shoeId, date) values (1, 1, '2019-09-16');
insert into PurchaseTable(userId, shoeId, date) values (4, 3, '2017-09-08');
insert into PurchaseTable(userId, shoeId, date) values (4, 2, '2021-07-04');
insert into PurchaseTable(userId, shoeId, date) values (3, 3, '2018-12-20');
insert into PurchaseTable(userId, shoeId, date) values (3, 2, '2021-07-16');
