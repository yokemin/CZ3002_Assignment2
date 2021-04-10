# CZ3002 Assignment 2 - Login Webapp with Struts2
Web application with simple login function implemented with Struts2.

## NTU CZ3002 Semester 2 2021 - Group 57
Group Members:
* [Woon Yoke Min](https://github.com/yokemin)
* [Koh Tong Liang](https://github.com/KohTongLiang)
* [Gan Xin](https://github.com/codergan)

## Run program locally
### Pre-requisites:
* Struts2 Libraries
* Eclipse IDE for Java and Web Developers / IntelliJ IDEA
* MySql
* MySql Connector

### MySQL Database:
Set up database using the following SQL Database Script:
```mysql
CREATE TABLE `users`.`login` (
   `username` VARCHAR( 100 ) NOT NULL ,
   `password` VARCHAR( 100 ) NOT NULL ,
    PRIMARY KEY (username, password),
    UNIQUE INDEX username_UNIQUE (username ASC) VISIBLE);

INSERT INTO users.login(username, password) VALUES ('ganxin', 'pass789'), ('tongliang', 'pass456'), ('yokemin', 'pass123');
```

### Running the program:
Type `mvn jetty:run` while in project directory
