create table USERS
(
    NAME     text not null,
    EMAIL    text not null,
    PASSWORD text not null
);
INSERT INTO USERS ( NAME, EMAIL,  PASSWORD)
VALUES ( 'User_First', 'user@gmail.com', '{noop}password'),
       ( 'Admin_First', 'admin@javaops.ru',  '{noop}admin');


create table USER_ROLE
(
    ROLE    text not null,
    USER_ID    int not null

);
INSERT INTO USER_ROLE (ROLE, USER_ID)
VALUES ('USER', 1),
       ('ADMIN', 2),
       ('USER', 2);