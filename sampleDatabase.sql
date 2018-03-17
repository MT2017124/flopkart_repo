SELECT * FROM sampledatabase.flopkartcategory;

drop table flopkartuser;
create table flopkartuser 
 ( ID INT NOT NULL AUTO_INCREMENT, # This is a system generated ID (artificial attribute)
   FirstName varchar(50), 
   LastName varchar(50), 
   UserType varchar(50), 
   Email varchar(50)  not null unique key, 
   Phone varchar(50) not null unique key, 
   otp varchar(50),
   pic_URL varchar(50), 
   password VARCHAR(50),
   primary key(id)
   );
   
   desc flopkartuser;
   
   insert into flopkartuser 
   (   FirstName, LastName, UserType,Email, Phone, password )
   values ( "kavya", "puranik", 
   "customer", "kavyakpuranik8@gmail.com", "7022254356", SHA1('Password1'));
   insert into flopkartuser 
   (   FirstName, LastName, pic_URL, UserType,Email, Phone, password )
   values ( "sai", "gowri", "download1.jpg",
   "seller", "saigowri@gmail.com", "8888888888", SHA1('Password1'));