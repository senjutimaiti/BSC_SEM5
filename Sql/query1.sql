CREATE DATABASE assignment1;
USE assignment1;

CREATE TABLE Member (
    Member_id integer(5),
    Member_Name varchar(30),
    Member_address varchar(50),
    Acc_Open_Date Date,
    Membership_type varchar(20),
    Fees_paid integer(4),
    Max_Books_Allowed integer(2),
    Penalty_Amount integer(4)
);
CREATE TABLE Books (
    Book_No integer(6),
    Book_Name varchar(30),
    Author_Name varchar(30),
    Cost integer(4),
    Category char(10)
);
CREATE TABLE Issue(
    Lib_Issue_Id integer(10),
    Book_No integer(6),
    Member_Id integer(5),
    Issue_Date date,
    Return_Date date
);

desc member;
desc books;
desc issue;

ALTER TABLE member
Add primary key (member_id);
ALTER TABLE member
modify Member_Name varchar(30) NOT NULL;
ALTER TABLE member
Add constraint m1 check(membership_type in('Lifetime','Annual','Half Yearly','Quarterly'));
ALTER TABLE member
Add constraint m2 check(max_books_allowed < 7);
ALTER TABLE member
Add constraint m3 check(penalty_amount <= 1000);

ALTER TABLE books
modify book_name varchar(30) NOT NULL;
ALTER TABLE books
Add constraint b1 Primary key (book_no);
ALTER TABLE books
Add constraint b2 check(category in('Science','Database','System','Others'));

ALTER TABLE issue
Add constraint i1 primary key (Lib_issue_id);
ALTER TABLE issue
ADD CONSTRAINT i2 FOREIGN KEY (member_id) REFERENCES member (member_id);
ALTER TABLE issue
ADD CONSTRAINT i3 FOREIGN KEY (book_no) REFERENCES books (book_no);

ALTER TABLE issue
DROP FOREIGN KEY i2;
ALTER TABLE issue
DROP FOREIGN KEY i3;

ALTER TABLE member
ADD CONSTRAINT i2 FOREIGN KEY (member_id) REFERENCES issue (member_id);
ALTER TABLE books
ADD CONSTRAINT i3 FOREIGN KEY (book_no) REFERENCES issue (book_no);

ALTER TABLE member
DROP FOREIGN KEY i2;
ALTER TABLE books
DROP FOREIGN KEY i3;

select * from member;
select * from books;
select * from issue;

INSERT INTO MEMBER VALUES (1, 'Sayantan Sinha', 'Pune', '2010-12-10', 'Lifetime', 2000, 6, 50);
INSERT INTO BOOKS VALUES(101, 'Let us C', 'Denis Ritchie', 450, 'Others');
INSERT INTO ISSUE (LIB_ISSUE_ID, BOOK_NO, MEMBER_ID, ISSUE_DATE) VALUES (7001, 101, 1, '2011-01-10');

DELETE FROM `assignment1`.`member` WHERE (`Member_id` = '1');
DELETE FROM `assignment1`.`books` WHERE (`Book_no` = '101');
DELETE FROM `assignment1`.`issue` WHERE (`Book_no` = '101');

select * from member;
select * from books;
select * from issue;