CREATE TABLE `Citizens` (
	`citizen_id` BIGINT NOT NULL AUTO_INCREMENT,
	`citizen_name` VARCHAR(200) NOT NULL,
	`zip` CHAR(4) NOT NULL,
	`age` BIGINT NOT NULL,
	`email` VARCHAR(200) NULL DEFAULT '',
	`taj` VARCHAR(10) NULL DEFAULT '',
	`number_of_vaccination` BIGINT NULL DEFAULT NULL,
	`last_vaccination` DATETIME NULL DEFAULT NULL,
	PRIMARY KEY (`citizen_id`)
)
COLLATE='utf8_general_ci'
;