drop table if exists user;

CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT,
  email varchar(45) NOT NULL,
  password varchar(45) NOT NULL,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) NOT NULL,
  username varchar(45) NOT NULL,
  phone varchar(45) NOT NULL,
  date_created datetime DEFAULT CURRENT_TIMESTAMP,
  user_status int(11),
  PRIMARY KEY (id),
  UNIQUE KEY email_UNIQUE (email)
);
