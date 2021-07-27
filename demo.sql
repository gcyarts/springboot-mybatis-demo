/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80024
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 80024
File Encoding         : 65001

Date: 2021-07-27 13:48:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` varchar(255) NOT NULL,
  `introduction` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', 'folks', '20', '很好用');
INSERT INTO `goods` VALUES ('2', 'plates', '20', '好用');
INSERT INTO `goods` VALUES ('3', 'bed', '150', '舒服');
INSERT INTO `goods` VALUES ('4', 'das', '213', 'ss');
INSERT INTO `goods` VALUES ('5', 'dsa', '213', 'fdsgfdgs');
INSERT INTO `goods` VALUES ('6', 'wqewqew', '333', 'fdsgbgeref');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `ordername` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `orderdate` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', 'game', 'bed', '2021-07-26 22:52:12');
INSERT INTO `orders` VALUES ('2', 'game', 'das', '2021-07-26 22:52:29');
INSERT INTO `orders` VALUES ('3', 'sss', 'dsa', '2021-07-26 22:53:01');
INSERT INTO `orders` VALUES ('4', 'sss', 'folks', '2021-07-27 00:00:00');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'game', '123456');
INSERT INTO `user` VALUES ('2', 'sss', '234');
INSERT INTO `user` VALUES ('3', 'games', '123456');
INSERT INTO `user` VALUES ('4', 'jkkk', '22222');
