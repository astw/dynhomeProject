-- create user  
DROP USER 'dynhome'@'localhost';  
CREATE USER 'dynhome'@'localhost' IDENTIFIED BY 'dynhome'; 
GRANT SELECT,INSERT,UPDATE,DELETE ON dynhome.* TO 'dynhome'@'localhost';
GRANT ALL ON dynhome.* TO 'dynhome'@'localhost';
GRANT SELECT,CREATE,DROP ON mysql.proc TO 'dynhome'@'%';  

