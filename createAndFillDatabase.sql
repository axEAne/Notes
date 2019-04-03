DROP DATABASE IF EXISTS test;
CREATE DATABASE test;
USE test;
CREATE TABLE `test`.`test` (
  `id` INT(8) NOT NULL AUTO_INCREMENT,
  `message` VARCHAR(45) NOT NULL,
  `date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `done` BIT(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`))
COLLATE='utf8_general_ci';

INSERT INTO `test`.`test` (`message`,`date`,`done`) VALUES ('Java Core', '2018-12-30 00:00:00', 1);
INSERT INTO `test`.`test` (`message`,`date`,`done`) VALUES ('Hibernate', '2019-03-05 12:00:00', 1);
INSERT INTO `test`.`test` (`message`,`date`,`done`) VALUES ('Spring Framework', '2019-03-04 17:00:00', 0);