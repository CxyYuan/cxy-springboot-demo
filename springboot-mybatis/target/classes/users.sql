/*
Navicat MySQL Data Transfer

Source Server         : 本地sa(192.168.1.69)
Source Server Version : 50637
Source Host           : 192.168.1.69:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2019-05-22 17:15:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `user_name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `user_password` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '用户1', '11111');
INSERT INTO `users` VALUES ('2', '用户2', '22222');
INSERT INTO `users` VALUES ('3', '用户3', '33333');
