/*---01---*/
SELECT MAX(Cost) AS MaxCost, Book_Name
FROM Books;

/*---02---*/
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

SELECT abs(-167);
SELECT pow(8,6);
SELECT round(134.56789,2);
SELECT floor(13.15);
SELECT ceil(13.15);

select year(curdate()) as Year, month(curdate()) as Month, day(curdate()) as Day;

/*--QUESTION 12--*/
select substring('INFOSYS', 3, 4) as SubString;

/*--QUESTION 13--*/
select ascii('a'), ascii('S');

/*--QUESTION 14--*/
select character_length('INFOSYS') as LengthOfString, 
replace('INFOSYS', 'S', 'T') as ReplaceString;

SELECT Member_name, Member_address
FROM member
WHERE Member_address = 'Kolkata';

SELECT book_name
FROM books
WHERE Cost between 300 and 500;

SELECT Member_name
FROM member
WHERE Membership_type = 'Half Yearly';
 
SELECT Member_Name
FROM member
WHERE year(Acc_Open_Date) = 2011;
 
select member.member_id as MemberId, member.member_name as MemberName, member.penalty_amount as PenaltyAmount
from member
where member.member_id in (
select issue.Member_Id from issue
inner join books
on books.Book_No = issue.Book_No
where books.Book_Name = 'Let us C'
);

SELECT Max_Books_Allowed
FROM member
inner join issue
on issue.Member_Id = member.Member_Id
WHERE month(Issue_Date) = 01;

SELECT Member_Name
FROM member
WHERE Member_id not in (SELECT Member_id from issue);

SELECT book_name, Category
from books
WHERE Cost is NULL;

SELECT book_name
from books
WHERE Author_Name = 'Loni' AND Cost < 600;

SELECT * FROM issue
WHERE Return_Date is NULL;

SELECT book_name
FROM books
WHERE Category = 'Science' or Category = 'Database';

SELECT Member_name, Penalty_Amount
FROM member
order by Penalty_Amount desc;

SELECT book_name, Category, Cost
FROM books
order by Category asc, Cost desc;

SELECT book_name
FROM books
WHERE book_name like '%SQL%';

SELECT member_name
From member
WHERE Member_name like 'S%';

SELECT member_name
From member
WHERE Member_name like '%T%' and 
(Member_name like 'S%' or Member_name like 'A%');
