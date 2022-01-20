/*---01---*/
SELECT MAX(Cost) AS MaxCost, Book_Name
FROM Books;

/*---02---*/
SELECT MIN(Cost) AS MinimumCost, 
AVG(Cost) AS AverageCost, 
SUM(Cost) AS TotalCost 
FROM Books;

/*---03---*/
SELECT Member_Name, Member.Member_id, Issue.issue_date
FROM Member
INNER JOIN Issue
On Member.Member_id = Issue.Member_id
where issue_date between '2011-01-26' and '2011-04-14';

/*---04---*/
SELECT book_name, author_name, category
FROM Books
WHERE NOT category = 'Others';

/*---05---*/
SELECT book_name, author_name
FROM Books
WHERE author_name LIKE '____t%';

/*---06---*/
SELECT COUNT(cost) AS CostGreaterThan350
FROM books
WHERE cost > 350;

/*---07---*/
SELECT COUNT(DISTINCT author_name) AS DistinctAuthor
FROM books;

/*---08---*/
SELECT abs(-167);
SELECT pow(8,6);
SELECT round(134.56789,2);
SELECT floor(13.15);
SELECT ceil(13.15);

/*---09---*/
select year(curdate()) as Year, month(curdate()) as Month, day(curdate()) as Day;

/*---10---*/
select greatest(4,5,17,3);

/*---11---*/
select least('4','5','17');

/*--QUESTION 12--*/
select substring('INFOSYS', 3, 4) as SubString;

/*--QUESTION 13--*/
select ascii('a'), ascii('S');

/*--QUESTION 14--*/
select character_length('INFOSYS') as LengthOfString, 
replace('INFOSYS', 'S', 'T') as ReplaceString;

/*--QUESTION 15--*/
SELECT Member_name, Member_address
FROM member
WHERE Member_address = 'Kolkata';

/*--QUESTION 16--*/
SELECT book_name
FROM books
WHERE Cost between 300 and 500;

/*--QUESTION 17--*/
SELECT Member_name
FROM member
WHERE Membership_type = 'Half Yearly';
 
/*--QUESTION 18--*/ 
SELECT Member_Name
FROM member
WHERE year(Acc_Open_Date) = 2011;
 
/*--QUESTION 19--*/ 
select member.member_id as MemberId, member.member_name as MemberName, member.penalty_amount as PenaltyAmount
from member
where member.member_id in (
select issue.Member_Id from issue
inner join books
on books.Book_No = issue.Book_No
where books.Book_Name = 'Let us C'
);

/*--QUESTION 20--*/
SELECT Max_Books_Allowed
FROM member
inner join issue
on issue.Member_Id = member.Member_Id
WHERE month(Issue_Date) = 01;

/*--QUESTION 21--*/
SELECT Member_Name
FROM member
WHERE Member_id not in (SELECT Member_id from issue);

/*--QUESTION 22--*/
SELECT book_name, Category
from books
WHERE Cost is NULL;

/*--QUESTION 23--*/
SELECT book_name
from books
WHERE Author_Name = 'Loni' AND Cost < 600;

/*--QUESTION 24--*/
SELECT * FROM issue
WHERE Return_Date is NULL;

/*--QUESTION 25--*/
SELECT book_name
FROM books
WHERE Category = 'Science' or Category = 'Database';

/*--QUESTION 26--*/
SELECT Member_name, Penalty_Amount
FROM member
order by Penalty_Amount desc;

/*--QUESTION 27--*/
SELECT book_name, Category, Cost
FROM books
order by Category asc, Cost desc;

/*--QUESTION 28--*/
SELECT book_name
FROM books
WHERE book_name like '%SQL%';

/*--QUESTION 29--*/
SELECT member_name
From member
WHERE Member_name like 'S%';

/*--QUESTION 30--*/
SELECT member_name
From member
WHERE Member_name like '%T%' and 
(Member_name like 'S%' or Member_name like 'A%');

/*--QUESTION 31--*/
select concat(Upper(substring(book_name,1,1)),lower(substring(book_name,2))) as BookName, upper(author_name) as AuthorName
From books
order by BookName desc;

/*--QUESTION 32--*/
select Book_No, book_name, author_name, cost,(substring(Category,1,1)) as Category
from books;

select category as Category, count(book_no) as CountOfBooks
from books
group by Category;

select Book_No, count(Book_No) as IssueCount 
from issue
group by Book_No
order by IssueCount desc;

select member_id, count(book_no) as BookCount
from issue
group by Member_Id
having BookCount > 1;

select Book_No as BookNo,count(Book_No) as CountBook, Member_Id as MemmberId
from issue
group by Member_Id, Book_No
having count(Member_Id) > 1;

select * from books
group by Cost
order by Cost desc 
limit 0,1;

select e1.Book_No, e1.Member_Id
from issue e1,issue e2 
where e1.book_no = e2.book_no and e1.member_id = e2.member_id;


select * from books where cost = max(cost) and cost not in (select max(cost) from books);
