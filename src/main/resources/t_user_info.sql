/*
 Navicat Premium Data Transfer

 Source Server         : mine京东云
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : 116.196.96.175:3306
 Source Schema         : mine

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 14/08/2018 12:14:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user_info
-- ----------------------------
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE `t_user_info` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '密码',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户表';

-- ----------------------------
-- Records of t_user_info
-- ----------------------------
BEGIN;
INSERT INTO `t_user_info` VALUES (1, '张三', '123456');
INSERT INTO `t_user_info` VALUES (2, '李四', '123456');
INSERT INTO `t_user_info` VALUES (3, '王五', '123456');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
