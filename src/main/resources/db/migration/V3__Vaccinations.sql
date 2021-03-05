CREATE TABLE `Vaccinations` (
	`vaccination_id` BIGINT NOT NULL,
	`citizen_id` BIGINT NOT NULL,
	`vaccination_date` DATETIME NOT NULL,
	`status` VARCHAR(10) NULL DEFAULT '',
	`note` VARCHAR(200) NULL DEFAULT '',
	`vaccination_type` VARCHAR(20) NULL DEFAULT '',
	PRIMARY KEY (`vaccination_id`)
) COLLATE='utf8_general_ci';

ALTER TABLE `vaccinations`
	ADD CONSTRAINT `FK_vaccinations_cities` FOREIGN KEY (`citizen_id`) REFERENCES `cities` (`city_id`);