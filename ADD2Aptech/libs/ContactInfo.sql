CREATE DATABASE ContactInfo
GO
USE ContactInfo
GO
CREATE TABLE Contact (
  Email nvarchar(50) NOT NULL,
  Password nvarchar(30) NOT NULL,
  Phone nvarchar(20) 
) 