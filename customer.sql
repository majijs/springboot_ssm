
SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL COMMENT '?߼?ɾ????1???ڣ?0ɾ??',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `customer` VALUES ('1', 'customer1', 'Jack', '13512345678', 'jack@gmail.com', null, 1, '2017-11-23 15:09:19', null);
INSERT INTO `customer` VALUES ('2', 'customer2', 'Rose', '13623456789', 'rose@gmail.com', null, 1, '2017-11-23 15:09:19', null);
