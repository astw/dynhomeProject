DROP TABLE IF EXISTS identities ; 

CREATE TABLE identities (
  id                  INT(11) NOT NULL AUTO_INCREMENT,
  email               VARCHAR(100) NOT NULL,
  token               VARCHAR(100) NOT NULL,
  valid               TINYINT(1)  NOT NULL DEFAULT 1,
  created_at   TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE INDEX email_token_UNIQU (email,token) 
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

--INSERT INTO `dynhome`.`identities` (`email`, `token`, `valid`, `created_at`)
 VALUES ('wsh@13s.com', '4232323', '0', '2014-09-10');
