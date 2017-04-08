CREATE DATABASE AccountManager
GO
USE AccountManager
GO
CREATE TABLE Account(
ID INT IDENTITY PRIMARY KEY,
Username nvarchar(60) NOT NULL,
Fullname nvarchar(70) NOT NULL,
Email nvarchar(100) NOT NULL,
Password nvarchar(100) NOT NULL,
Code INT NOT NULL DEFAULT(0)
)
