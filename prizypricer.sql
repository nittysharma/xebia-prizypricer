/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : prizypricer

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2014-08-04 16:53:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `productmaster`
-- ----------------------------
DROP TABLE IF EXISTS `productmaster`;
CREATE TABLE `productmaster` (
  `productid` bigint(20) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `barcode` bigint(20) NOT NULL,
  `productname` varchar(255) DEFAULT NULL,
  `productdescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`productid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of productmaster
-- ----------------------------
INSERT INTO `productmaster` VALUES ('1', 'Categorie 1', '3245612312432', 'Product 1', 'Description 1');
INSERT INTO `productmaster` VALUES ('2', 'Categorie 2', '3245612312433', 'Product 2', 'Description 2');
INSERT INTO `productmaster` VALUES ('3', 'Categorie 3', '3245612312434', 'Product 3', 'Description 3');
INSERT INTO `productmaster` VALUES ('4', 'Categorie 4', '3245612312435', 'Product 4', 'Description 4');
INSERT INTO `productmaster` VALUES ('5', 'Categorie 5', '3245612312436', 'Product 5', 'Description 5');
INSERT INTO `productmaster` VALUES ('6', 'Categorie 6', '3245612312437', 'Product 6', 'Description 6');
INSERT INTO `productmaster` VALUES ('7', 'Categorie 7', '3245612312438', 'Product 7', 'Description 7');
INSERT INTO `productmaster` VALUES ('8', 'Categorie 8', '3245612312439', 'Product 8', 'Description 8');
INSERT INTO `productmaster` VALUES ('9', 'Categorie 9', '3245612312440', 'Product 9', 'Description 9');
INSERT INTO `productmaster` VALUES ('10', 'Categorie 10', '3245612312441', 'Product 10', 'Description 10');
INSERT INTO `productmaster` VALUES ('11', 'Categorie 11', '3245612312442', 'Product 11', 'Description 11');
INSERT INTO `productmaster` VALUES ('12', 'Categorie 12', '3245612312443', 'Product 12', 'Description 12');
INSERT INTO `productmaster` VALUES ('13', 'Categorie 13', '3245612312444', 'Product 13', 'Description 13');
INSERT INTO `productmaster` VALUES ('14', 'Categorie 14', '3245612312445', 'Product 14 ', 'Description 14');
INSERT INTO `productmaster` VALUES ('15', 'Categorie 15', '3245612312446', 'Product 15', 'Description 15');
INSERT INTO `productmaster` VALUES ('16', 'Categorie 16', '3245612312447', 'Product 16', 'Description 16');
INSERT INTO `productmaster` VALUES ('17', 'Categorie 17', '3245612312448', 'Product 17', 'Description 17');
INSERT INTO `productmaster` VALUES ('18', 'Categorie 18', '3245612312449', 'Product 18', 'Description 18');
INSERT INTO `productmaster` VALUES ('19', 'Categorie 19', '3245612312450', 'Product 19', 'Description 19');
INSERT INTO `productmaster` VALUES ('20', 'Categorie 20', '3245612312451', 'Product 20', 'Description 20');

-- ----------------------------
-- Table structure for `productsurvay`
-- ----------------------------
DROP TABLE IF EXISTS `productsurvay`;
CREATE TABLE `productsurvay` (
  `survayid` bigint(20) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `barcode` bigint(20) NOT NULL,
  `productname` varchar(255) DEFAULT NULL,
  `productdescription` varchar(255) DEFAULT NULL,
  `suggestedprice` double NOT NULL,
  `storeid` bigint(20) NOT NULL,
  `note_descriotion` varchar(255) DEFAULT NULL,
  `productid` bigint(20) NOT NULL,
  `workerid` bigint(20) NOT NULL,
  `timestumptaken` datetime DEFAULT NULL,
  PRIMARY KEY (`survayid`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of productsurvay
-- ----------------------------
INSERT INTO `productsurvay` VALUES ('1', 'hkjh', '4566', 'hgm', 'hghjmgkj', '78799', '212', 'jkljkl', '1', '1', '2014-08-04 14:29:15');
INSERT INTO `productsurvay` VALUES ('2', 'hkjh', '4566', 'hgm', 'hghjmgkj', '0', '212', 'k;lk;l', '1', '1', '2014-08-04 14:31:33');
INSERT INTO `productsurvay` VALUES ('3', 'gfhj', '768768', 'hhkj', 'hkjhkj', '6768', '212', 'kjhkjhkj', '2', '1', '2014-08-04 14:33:16');
INSERT INTO `productsurvay` VALUES ('4', 'hkjh', '4566', 'hgm', 'hghjmgkj', '678687', '212', 'hjkhkjh', '1', '1', '2014-08-04 14:33:41');
INSERT INTO `productsurvay` VALUES ('5', 'hkjh', '4566', 'hgm', 'hghjmgkj', '678687', '212', 'hjkhkjh', '1', '1', '2014-08-04 14:36:39');
INSERT INTO `productsurvay` VALUES ('6', 'hkjh', '4566', 'hgm', 'hghjmgkj', '678687', '212', 'hjkhkjh', '1', '1', '2014-08-04 14:37:14');
INSERT INTO `productsurvay` VALUES ('7', 'hkjh', '4566', 'hgm', 'hghjmgkj', '678687', '212', 'hjkhkjh', '1', '1', '2014-08-04 14:38:32');
INSERT INTO `productsurvay` VALUES ('8', 'hkjh', '4566', 'hgm', 'hghjmgkj', '678687', '212', 'hjkhkjh', '1', '1', '2014-08-04 14:38:36');
INSERT INTO `productsurvay` VALUES ('9', 'hkjh', '4566', 'hgm', 'hghjmgkj', '678687', '212', 'hjkhkjh', '1', '1', '2014-08-04 14:38:48');
INSERT INTO `productsurvay` VALUES ('10', 'gfhj', '768768', 'hhkj', 'hkjhkj', '0', '212', '', '2', '1', '2014-08-04 14:39:04');
INSERT INTO `productsurvay` VALUES ('11', 'gfhj', '768768', 'hhkj', 'hkjhkj', '0', '212', '', '2', '1', '2014-08-04 14:39:33');
INSERT INTO `productsurvay` VALUES ('12', 'gfhj', '768768', 'hhkj', 'hkjhkj', '67868', '212', 'kkjklkkl', '2', '1', '2014-08-04 14:39:41');
INSERT INTO `productsurvay` VALUES ('13', 'hkjh', '4566', 'hgm', 'hghjmgkj', '0', '212', '23121', '1', '1', '2014-08-04 14:39:58');
INSERT INTO `productsurvay` VALUES ('14', 'hkjh', '4566', 'hgm', 'hghjmgkj', '0', '212', '23121', '1', '1', '2014-08-04 14:41:53');
INSERT INTO `productsurvay` VALUES ('15', 'hkjh', '4566', 'hgm', 'hghjmgkj', '0', '212', '23121', '1', '1', '2014-08-04 14:44:10');
INSERT INTO `productsurvay` VALUES ('16', 'gfhj', '768768', 'hhkj', 'hkjhkj', '0', '212', '', '2', '1', '2014-08-04 14:44:19');
INSERT INTO `productsurvay` VALUES ('17', 'gfhj', '768768', 'hhkj', 'hkjhkj', '0', '212', '', '2', '1', '2014-08-04 14:46:43');
INSERT INTO `productsurvay` VALUES ('18', 'hkjh', '4566', 'hgm', 'hghjmgkj', '0', '212', '', '1', '1', '2014-08-04 14:46:47');
INSERT INTO `productsurvay` VALUES ('19', 'hkjh', '4566', 'hgm', 'hghjmgkj', '0', '212', '', '1', '1', '2014-08-04 14:47:10');
INSERT INTO `productsurvay` VALUES ('20', 'hkjh', '4566', 'hgm', 'hghjmgkj', '7897', '212', 'hjkj', '1', '1', '2014-08-04 14:47:23');
INSERT INTO `productsurvay` VALUES ('21', 'Categorie 3', '3245612312434', 'Product 3', 'Description 3', '6576', '0', '', '3', '1', '2014-08-04 16:50:33');
INSERT INTO `productsurvay` VALUES ('22', 'Categorie 6', '3245612312437', 'Product 6', 'Description 6', '4766', '0', '', '6', '1', '2014-08-04 16:52:06');
INSERT INTO `productsurvay` VALUES ('23', 'Categorie 7', '3245612312438', 'Product 7', 'Description 7', '568634', '0', 'fbg', '7', '1', '2014-08-04 16:52:15');

-- ----------------------------
-- Table structure for `store`
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store` (
  `storeid` bigint(20) NOT NULL AUTO_INCREMENT,
  `storename` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`storeid`)
) ENGINE=InnoDB AUTO_INCREMENT=322 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of store
-- ----------------------------
INSERT INTO `store` VALUES ('122', 'Croma', 'faridabad');
INSERT INTO `store` VALUES ('321', 'BigBazzar', 'Guroan');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `lastlogouttime` datetime DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'worker', 'worker', '2014-08-04 16:52:18', 'worker');
INSERT INTO `user` VALUES ('2', 'admin', 'admin', '2014-08-04 16:51:42', 'admin');
