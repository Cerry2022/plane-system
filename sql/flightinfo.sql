/*
 Navicat Premium Data Transfer

 Source Server         : Mydatabase
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : java_data

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 18/11/2019 21:59:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for airlineinfo
-- ----------------------------
DROP TABLE IF EXISTS `airlineinfo`;
CREATE TABLE `airlineinfo`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '航空公司编码',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '航空公司名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of airlineinfo
-- ----------------------------
INSERT INTO `airlineinfo` (`id`, `code`, `name`) VALUES
('1', 'CA', '中国国际航空公司'),
('2', 'MU', '中国东方航空公司'),
('3', 'CZ', '中国南方航空公司'),
('4', 'HU', '海南航空公司'),
('5', 'MF', '厦门航空公司');

-- ----------------------------
-- Table structure for flightinfo
-- ----------------------------
DROP TABLE IF EXISTS `flightinfo`;
CREATE TABLE `flightinfo`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `airlineinfoid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '航空公司表id(外键）',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '航班号',
  `Type_f` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '飞机类型',
  `Time_s` TIME NOT NULL COMMENT '出发时间',
  `Time_e` TIME NOT NULL COMMENT '到达时间',
  `City_s` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '出发地点',
  `City_e` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '到达地点',
  `Top_price` float NOT NULL COMMENT '商务舱价格',
  `Second_price` float NOT NULL COMMENT '经济舱价格',
  `Seat_t` int NOT NULL COMMENT '商务舱座位数',
  `Seat_s` int NOT NULL COMMENT '经济舱座位数',
  PRIMARY KEY (`id`) USING BTREE,
  CONSTRAINT `fk_airlineinfo` FOREIGN KEY (`airlineinfoid`) REFERENCES `airlineinfo` (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of flightinfo
-- ----------------------------
INSERT INTO `flightinfo` (`id`, `airlineinfoid`, `code`, `Type_f`, `Time_s`, `Time_e`, `City_s`, `City_e`, `Top_price`, `Second_price`, `Seat_t`, `Seat_s`) VALUES
('1', '1', 'CA123', '国际', '08:00:00', '10:00:00', '北京', '上海', 1000.0, 800.0, 50, 200),
('2', '2', 'MU456', '国际', '09:00:00', '11:00:00', '上海', '北京', 1200.0, 900.0, 40, 150),
('3', '3', 'CZ789', '国内', '10:00:00', '12:00:00', '广州', '深圳', 800.0, 600.0, 30, 100),
('4', '3', 'CZ321', '国内', '11:00:00', '13:00:00', '深圳', '广州', 700.0, 500.0, 35, 120),
('5', '1', 'CA654', '国际', '12:00:00', '14:00:00', '北京', '上海', 1100.0, 850.0, 45, 180),
('6', '2', 'MU987', '国际', '13:00:00', '15:00:00', '上海', '北京', 1300.0, 950.0, 50, 200),
('7', '3', 'CZ111', '国内', '14:00:00', '16:00:00', '广州', '深圳', 750.0, 550.0, 35, 120),
('8', '3', 'CZ222', '国内', '15:00:00', '17:00:00', '深圳', '广州', 650.0, 450.0, 30, 100),
('9', '1', 'CA333', '国际', '16:00:00', '18:00:00', '北京', '上海', 1200.0, 900.0, 40, 150),
('10', '2', 'MU444', '国际', '17:00:00', '19:00:00', '上海', '北京', 1400.0, 1000.0, 45, 180),
('11', '3', 'CZ555', '国内', '18:00:00', '20:00:00', '广州', '深圳', 800.0, 600.0, 35, 120),
('12', '3', 'CZ666', '国内', '19:00:00', '21:00:00', '深圳', '广州', 700.0, 500.0, 30, 100),
('13', '1', 'CA777', '国际', '20:00:00', '22:00:00', '北京', '上海', 1100.0, 850.0, 45, 180),
('14', '2', 'MU888', '国际', '21:00:00', '23:00:00', '上海', '北京', 1300.0, 950.0, 50, 200),
('15', '3', 'CZ999', '国内', '22:00:00', '00:00:00', '广州', '深圳', 750.0, 550.0, 35, 120),
('16', '3', 'CZ000', '国内', '23:00:00', '01:00:00', '深圳', '广州', 650.0, 450.0, 30, 100),
('17', '1', 'CA111', '国际', '08:00:00', '10:00:00', '北京', '上海', 1000.0, 800.0, 50, 200),
('18', '2', 'MU222', '国际', '09:00:00', '11:00:00', '上海', '北京', 1200.0, 900.0, 40, 150),
('19', '3', 'CZ333', '国内', '10:00:00', '12:00:00', '广州', '深圳', 800.0, 600.0, 30, 100),
('20', '3', 'CZ444', '国内', '11:00:00', '13:00:00', '深圳', '广州', 700.0, 500.0, 35, 120),
('21', '1', 'CA555', '国际', '12:00:00', '14:00:00', '北京', '上海', 1100.0, 850.0, 45, 180);

SET FOREIGN_KEY_CHECKS = 1;