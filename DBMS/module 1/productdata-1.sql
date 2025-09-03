create table product(
pid int,
pname varchar(20),
qty int,
price float,
mfgdate date,
expdate date,
type varchar(20),
cid int)


insert into product values
(7,'Notebook',30,150,'2022-10-11',null,'nonperishable',5);

insert into product values
(8,'Pencil',40,175,'2023-10-11',null,'nonperishable',5);

insert into product values
(9,'sharpner',50,50,'2022-10-11',null,'nonperishable',5);



insert into product values
(10,'Chair',30,4000.00,'2022-10-11',null,'nonperishable',1);

insert into product values
(11,'Table',20,4000.00,'2022-10-11',null,'nonperishable',1);

insert into product values
(12,'Shelf',25,4000.00,'2020-10-11',null,'nonperishable',1);

insert into product values
(13,'lays',100,40.00,'2024-02-11','2025-02-11','perishable',2);

insert into product values
(14,'pringles',200,100.00,'2024-03-15','2025-02-11','perishable',2);
insert into product values
(15,'nachos',200,100.00,'2024-03-15','2025-02-11','perishable',2);

insert into product values
(15,'coke',40,45.00,'2024-06-10','2024-12-11','perishable',3);

insert into product values
(16,'miranda',50,40.00,'2024-02-11','2025-02-11','perishable',3);

insert into product values
(13,'sprite',100,47.00,'2024-06-17','2025-03-17','perishable',3);