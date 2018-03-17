create table FlopkartListing(ID int auto_increment not null,listingname varchar(20) unique,subcategoryid int,availaible int,total int,price int,discount int,
stars int,description varchar(100),
primary key(ID),foreign key(subcategoryid) references flopkartsubcategory(ID));
create table FlopkartCategory(ID int auto_increment not null,categoryname varchar(50) unique,primary key(ID));
insert into FlopkartCategory(categoryname) values("Electronics");
insert into FlopkartListing(listingname,subcategoryid,availaible,total,price,discount,stars,description) values 
("lenovo laptop",1,10,10,50000,10,4,"ideapad");
create table flopkartsubcategory
( ID int auto_increment not null,
categoryid int not null,
   subcategoryName varchar(50),
   primary key (id),
   unique (categoryid, subcategoryName),
   foreign key(categoryid) references flopkartcategory(id) On delete cascade on update cascade
   );
   insert into flopkartsubcategory(categoryid,subcategoryname) values (1,"laptops");
use sampledatabase;
select * from flipkartitem;
select * from flopkartuser;
desc flopkartuser;
alter table flopkartuser
modify password varchar(101);
drop table flopkartuser;
create table flopkartuser(
ID INT NOT NULL AUTO_INCREMENT, # This is a system generated ID (artificial attribute)
   UserID varchar(50) NOT NULL, 
   FirstName varchar(50), 
   LastName varchar(50), 
   UserType varchar(50), 
   Email varchar(50), 
   Phone varchar(50), 
   pic_URL varchar(50), 
   password VARCHAR(50),
   primary key (ID),
   unique key (Email),
   unique key (UserID), 
   unique key (Phone) 
);