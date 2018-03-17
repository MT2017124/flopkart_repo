create table FlopkartUser 
 ( ID INT NOT NULL AUTO_INCREMENT, # This is a system generated ID (artificial attribute)
   FirstName varchar(50), 
   LastName varchar(50), 
   UserType varchar(50), # Takes values - 'Customer','Seller'
   Email varchar(50)  not null unique key, 
   Phone varchar(50) not null unique key, 
   otp varchar(50),
   pic_URL varchar(50), 
   password VARCHAR(50),
   primary key(id)
   );

   

create table FlopkartCategory
	(ID int auto_increment not null,
	categoryname varchar(50) unique,
	primary key(ID));   
 
 
 
create table FlopkartSubcategory
	(ID int auto_increment not null,
	categoryid int not null,
	subcategoryName varchar(50),
	primary key (id),
	unique (categoryid, subcategoryName),
	foreign key(categoryid) references flopkartcategory(id) On delete cascade on update cascade
   ); 
 
 
 
create table FlopkartListing
   (ID int auto_increment not null,
   ListingName varchar(100) unique,
   ImgUrl varchar(100),
   subcategoryid int,
   sellerid int,
   Quantity int, # No. of FlopkartItem rows for this Listing
   price int,
   colour varchar(20),
   Brand varchar(100),
   Manufacture_date date, 
   description varchar(100),
   priority int, # Can be used to advertise high priority listings
   discount int, # 0 to 100 in percentage.. default value is 0
   primary key(ID),
   foreign key(sellerid) references flopkartuser(ID),
   foreign key(subcategoryid) references flopkartsubcategory(ID));
   
   

   
 
create table FlopkartListingDetails
   (ID int auto_increment not null,
   ListingId int not null,
   attr_name varchar(100),
   attr_val varchar(100),
   primary key(ID),
   foreign key(ListingId) references FlopkartListing(ID));
   


 
create table FlopkartCart
   (ID int auto_increment not null,
   UserId int,
   primary key(ID),
   foreign key(UserId) references FlopkartUser(ID));

   
   
create table FlopkartItem
   (ID int auto_increment not null,
   ListingId int not null,
   CartId int,            # Contains value only if status is 'Ordered','Dispatched','Delivered' or 'Returned'
   status varchar(100),   # Takes values - 'Available','Ordered','Dispatched','Delivered','Returned','Deleted'
   primary key(ID),
   foreign key(ListingId) references FlopkartListing(ID),
   foreign key(CartId) references FlopkartCart(ID));
   

   

create table FlopkartReview
   (ID int auto_increment not null,
   ListingId int not null,
   UserId int not null,
   stars int, 
   review varchar(1000),   
   primary key(ID),
   foreign key(ListingId) references FlopkartListing(ID),
   foreign key(UserId) references FlopkartUser(ID));
   


   

create table FlopkartWishlist
   (ID int auto_increment not null,
   UserId int not null,
   primary key(ID),
   foreign key(UserId) references FlopkartUser(ID));
   
   
create table FlopkartListingWishlist
   (ID int auto_increment not null,
   listingid int not null,
   wishlistid int not null,
   primary key(ID),
   foreign key(listingid) references flopkartlisting(ID),
   foreign key(wishlistid) references flopkartWishlist(ID));

   
   
create table FlopkartDeal
   (ID int auto_increment not null,
   dealname varchar(500) unique,
   startdate date,
   enddate date,
   primary key(ID));
   
   
create table FlopkartListingDeal
   (ID int auto_increment not null,
   listingid int not null,
   dealid int not null,
   primary key(ID),
   foreign key(listingid) references flopkartlisting(ID),
   foreign key(dealid) references flopkartDeal(ID));