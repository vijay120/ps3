Author: Vijay Ramakrishnan Thimmaiyah

Steps to run the system:

-> javacc select.jj 
-> javac Select.java 
-> java Select
.
.
.
type "exit;" to shutdown the server

Sample test query statements:

select * from Courses where 3 = "Spring";
select * from Students where 4 = 1;
select * from Students where 1 = "DemasE.Candaele";
select * from Students;
select * from Students where 3 = "MiningEngineering";  

Overview:

This "DBMS" loads in two files, one for the Students table and the other for the Courses table. The files
for each are name s0.txt and s1.txt respectively.

For the courses table, the representation of the tuple is as follows:
NAME | ID | SEMESTER

For the students table, the representation of the tuple is as follows:
NAME | ID | MAJOR | GPA

where for example, NAME is column 1 and GPA is column 4

File format:

Each attribute is identified by a collection of strings which has no spaces. This is for both the integer
attributes and the string attributes.

(small) Feature:

My parser does not care about a table being written as Students or students. If it matches where the table
"Students" in the dbms, then it will proceed, if not it will not search anything.