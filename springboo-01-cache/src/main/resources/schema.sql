

--人员表
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` int(2) DEFAULT NULL,
  `d_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

--部门表
DROP TABLE IF EXISTS `department`;
CREATE TABLE spring_cache.department
(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    DepartmentName varchar(20)
);