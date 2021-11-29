select * from member;
select * from books;
select * from issue;

INSERT INTO MEMBER VALUES (1, 'Sayantan Sinha', 'Pune', '2010-12-10', 'Lifetime', 2000, 6, 50);
INSERT INTO MEMBER VALUES (2, 'Abhirup Sarkar', 'Kolkata', '2011-01-19', 'Annual', 1400, 3, 0);
INSERT INTO MEMBER VALUES (3, 'Ritesh Bhuniya', 'Gujarat', '2011-02-20', 'Quarterly', 350, 2, 100);
INSERT INTO MEMBER VALUES (4, 'Paresh Sen', 'Tripura', '2011-03-21', 'Half Yearly', 700, 1, 200);
INSERT INTO MEMBER VALUES (5, 'Sohini Haldar', 'Birbhum', '2011-04-11', 'Lifetime', 2000, 6, 10);
INSERT INTO MEMBER VALUES (6, 'Suparna Biswas', 'Kolkata', '2011-04-12', 'Half Yearly', 700, 1, 0);
INSERT INTO MEMBER VALUES (7, 'Suranjana Basu', 'Purulia', '2011-06-30', 'Annual', 1400, 3, 50);
INSERT INTO MEMBER VALUES (8, 'Arpita Roy', 'Kolkata', '2011-07-31', 'Half Yearly', 700, 1, 0);

INSERT INTO BOOKS VALUES(101, 'Let us C', 'Denis Ritchie', 450, 'Others');
INSERT INTO BOOKS VALUES(102, 'Oracle - Complete Ref', 'Loni', 550, 'Database');
INSERT INTO BOOKS VALUES(103, 'Visual Basic 10', 'BPB', 700, 'Others');
INSERT INTO BOOKS VALUES(104, 'Mastering SQL', 'Loni', 450, 'Database');
INSERT INTO BOOKS VALUES(105, 'PL SQL-Ref', 'Scott Urman', 750, 'Database');
INSERT INTO BOOKS VALUES(106, 'UNIX', 'Sumitava Das', 300, 'System');
INSERT INTO BOOKS VALUES(107, 'Optics', 'Ghatak', 600, 'Science');
INSERT INTO BOOKS VALUES(108, 'Data Structure', 'G.S. Baluja', 350, 'Others');

INSERT INTO ISSUE (LIB_ISSUE_ID, BOOK_NO, MEMBER_ID, ISSUE_DATE) VALUES (7001, 101, 1, '2011-01-10');
INSERT INTO ISSUE (LIB_ISSUE_ID, BOOK_NO, MEMBER_ID, ISSUE_DATE) VALUES (7002, 102, 2, '2011-01-25');
INSERT INTO ISSUE (LIB_ISSUE_ID, BOOK_NO, MEMBER_ID, ISSUE_DATE) VALUES (7003, 104, 1, '2011-02-01');
INSERT INTO ISSUE (LIB_ISSUE_ID, BOOK_NO, MEMBER_ID, ISSUE_DATE) VALUES (7004, 104, 2, '2011-03-15');
INSERT INTO ISSUE (LIB_ISSUE_ID, BOOK_NO, MEMBER_ID, ISSUE_DATE) VALUES (7005, 101, 4, '2011-04-04');
INSERT INTO ISSUE (LIB_ISSUE_ID, BOOK_NO, MEMBER_ID, ISSUE_DATE) VALUES (7006, 108, 5, '2011-04-12');
INSERT INTO ISSUE (LIB_ISSUE_ID, BOOK_NO, MEMBER_ID, ISSUE_DATE) VALUES (7007, 101, 8, '2011-08-01');

SELECT MAX(Cost) AS MaxCost, Book_Name
FROM Books;

SELECT MIN(Cost) AS MinimumCost, 
AVG(Cost) AS AverageCost, 
SUM(Cost) AS TotalCost 
FROM Books;

SELECT Member_Name, Member.Member_id, Issue.issue_date
FROM Member
INNER JOIN Issue
On Member.Member_id = Issue.Member_id
where issue_date between '2011-01-26' and '2011-04-14';

SELECT book_name, author_name, category
FROM Books
WHERE NOT category = 'Others';

SELECT book_name, author_name
FROM Books
WHERE author_name LIKE '____t%';

SELECT COUNT(cost) AS CostGreaterThan350
FROM books
WHERE cost > 350;

SELECT COUNT(DISTINCT author_name) AS DistinctAuthor
FROM books;