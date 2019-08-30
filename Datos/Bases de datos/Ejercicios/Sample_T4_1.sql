-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema logean
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema logean
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `logean` DEFAULT CHARACTER SET utf8 ;
USE `logean` ;

-- -----------------------------------------------------
-- Table `logean`.`classes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `logean`.`classes` (
  `id_classes` INT(3) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `classname` VARCHAR(45) NOT NULL,
  `description` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`id_classes`),
  UNIQUE INDEX `classname_UNIQUE` (`classname` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `logean`.`students`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `logean`.`students` (
  `id_students` INT(3) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `surname` VARCHAR(30) NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id_students`))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `logean`.`students_classes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `logean`.`students_classes` (
  `id_document` INT(3) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `id_students` INT(3) UNSIGNED ZEROFILL NOT NULL,
  `id_classes` INT(3) UNSIGNED ZEROFILL NOT NULL,
  PRIMARY KEY (`id_document`, `id_students`, `id_classes`),
  INDEX `id_students` (`id_students` ASC),
  INDEX `id_classes` (`id_classes` ASC),
  CONSTRAINT `id_classes`
    FOREIGN KEY (`id_classes`)
    REFERENCES `logean`.`classes` (`id_classes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_students`
    FOREIGN KEY (`id_students`)
    REFERENCES `logean`.`students` (`id_students`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;




select * from students_classes;
select * from students;
select * from classes;