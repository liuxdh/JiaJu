/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50709
Source Host           : 127.0.0.1:3306
Source Database       : jiaju

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2019-05-22 12:31:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chanpincaizhi
-- ----------------------------
DROP TABLE IF EXISTS `chanpincaizhi`;
CREATE TABLE `chanpincaizhi` (
  `caizhiId` int(11) NOT NULL AUTO_INCREMENT,
  `caizhi` varchar(20) NOT NULL,
  PRIMARY KEY (`caizhiId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chanpincaizhi
-- ----------------------------
INSERT INTO `chanpincaizhi` VALUES ('1', '软皮');
INSERT INTO `chanpincaizhi` VALUES ('2', '皮革');
INSERT INTO `chanpincaizhi` VALUES ('3', '羊毛');
INSERT INTO `chanpincaizhi` VALUES ('4', '丝绸');
INSERT INTO `chanpincaizhi` VALUES ('5', '有麻');
INSERT INTO `chanpincaizhi` VALUES ('6', '真丝');

-- ----------------------------
-- Table structure for chanpinfenlei
-- ----------------------------
DROP TABLE IF EXISTS `chanpinfenlei`;
CREATE TABLE `chanpinfenlei` (
  `fenleiId` int(11) NOT NULL AUTO_INCREMENT,
  `fenleimingcheng` varchar(20) NOT NULL,
  `src` varchar(50) NOT NULL,
  `srcs` varchar(50) NOT NULL,
  PRIMARY KEY (`fenleiId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chanpinfenlei
-- ----------------------------
INSERT INTO `chanpinfenlei` VALUES ('1', '椅子系列', './images/chair.png', './images/chairs.png');
INSERT INTO `chanpinfenlei` VALUES ('2', '餐桌系列', './images/table.png', './images/tables.png');
INSERT INTO `chanpinfenlei` VALUES ('3', '沙发系列', './images/sofa.png', './images/sofas.png');
INSERT INTO `chanpinfenlei` VALUES ('4', '创意系列', './images/creativity.png', './images/creativitys.png');

-- ----------------------------
-- Table structure for chanpinxinxi
-- ----------------------------
DROP TABLE IF EXISTS `chanpinxinxi`;
CREATE TABLE `chanpinxinxi` (
  `chanpinId` int(11) NOT NULL AUTO_INCREMENT,
  `chanpinmingcheng` varchar(20) NOT NULL,
  `chanpincaizhi` int(11) NOT NULL,
  `chanpinshoujia` varchar(20) NOT NULL,
  `shichangjia` varchar(20) NOT NULL,
  `pinpai` int(11) NOT NULL,
  `shifouzuzhuang` tinyint(1) NOT NULL,
  `shifoudingzhi` tinyint(1) NOT NULL,
  `xinghao` varchar(20) NOT NULL,
  `yanse` int(11) NOT NULL,
  `shejiyuansu` int(11) NOT NULL,
  `fengge` int(11) NOT NULL,
  `kuanshi` int(11) NOT NULL,
  `fenleiId` int(11) NOT NULL,
  PRIMARY KEY (`chanpinId`),
  KEY `fenleiId` (`fenleiId`),
  KEY `chanpincaizhi` (`chanpincaizhi`),
  KEY `pinpai` (`pinpai`),
  KEY `yanse` (`yanse`),
  KEY `shejiyuansu` (`shejiyuansu`),
  KEY `fengge` (`fengge`),
  KEY `kuanshi` (`kuanshi`),
  CONSTRAINT `chanpinxinxi_ibfk_1` FOREIGN KEY (`fenleiId`) REFERENCES `chanpinfenlei` (`fenleiId`),
  CONSTRAINT `chanpinxinxi_ibfk_2` FOREIGN KEY (`chanpincaizhi`) REFERENCES `chanpincaizhi` (`caizhiId`),
  CONSTRAINT `chanpinxinxi_ibfk_3` FOREIGN KEY (`pinpai`) REFERENCES `pinpai` (`pinpaiId`),
  CONSTRAINT `chanpinxinxi_ibfk_4` FOREIGN KEY (`yanse`) REFERENCES `yanse` (`yanseId`),
  CONSTRAINT `chanpinxinxi_ibfk_5` FOREIGN KEY (`shejiyuansu`) REFERENCES `shejiyuansu` (`yuansuId`),
  CONSTRAINT `chanpinxinxi_ibfk_6` FOREIGN KEY (`fengge`) REFERENCES `fengge` (`fenggeId`),
  CONSTRAINT `chanpinxinxi_ibfk_7` FOREIGN KEY (`kuanshi`) REFERENCES `kuanshidingwei` (`kuanshiId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chanpinxinxi
-- ----------------------------
INSERT INTO `chanpinxinxi` VALUES ('1', '软皮椅', '1', '10000', '20000', '1', '0', '1', '001', '1', '1', '1', '1', '1');
INSERT INTO `chanpinxinxi` VALUES ('2', '沙发', '1', '10000', '200000', '2', '0', '1', '002', '2', '2', '2', '1', '3');
INSERT INTO `chanpinxinxi` VALUES ('3', '气垫', '1', '10000', '222200', '3', '0', '1', '003', '3', '3', '3', '2', '4');
INSERT INTO `chanpinxinxi` VALUES ('4', '餐桌', '3', '1000', '000001', '4', '0', '1', '10041', '4', '4', '4', '2', '2');

-- ----------------------------
-- Table structure for fengge
-- ----------------------------
DROP TABLE IF EXISTS `fengge`;
CREATE TABLE `fengge` (
  `fenggeId` int(11) NOT NULL AUTO_INCREMENT,
  `fengge` varchar(20) NOT NULL,
  PRIMARY KEY (`fenggeId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fengge
-- ----------------------------
INSERT INTO `fengge` VALUES ('1', '日式');
INSERT INTO `fengge` VALUES ('2', '中式');
INSERT INTO `fengge` VALUES ('3', '洋式');
INSERT INTO `fengge` VALUES ('4', '美式');
INSERT INTO `fengge` VALUES ('5', '韩式');

-- ----------------------------
-- Table structure for img
-- ----------------------------
DROP TABLE IF EXISTS `img`;
CREATE TABLE `img` (
  `gid` int(10) NOT NULL AUTO_INCREMENT,
  `gimgurl` varchar(100) NOT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of img
-- ----------------------------
INSERT INTO `img` VALUES ('1', './images/banner.jpg');
INSERT INTO `img` VALUES ('2', './images/banner2.jpg');
INSERT INTO `img` VALUES ('3', './images/banner3.jpg');

-- ----------------------------
-- Table structure for kuanshidingwei
-- ----------------------------
DROP TABLE IF EXISTS `kuanshidingwei`;
CREATE TABLE `kuanshidingwei` (
  `kuanshiId` int(11) NOT NULL AUTO_INCREMENT,
  `kuanshi` varchar(20) NOT NULL,
  PRIMARY KEY (`kuanshiId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kuanshidingwei
-- ----------------------------
INSERT INTO `kuanshidingwei` VALUES ('1', '现代');
INSERT INTO `kuanshidingwei` VALUES ('2', '古代');
INSERT INTO `kuanshidingwei` VALUES ('3', '电气时代');
INSERT INTO `kuanshidingwei` VALUES ('4', '美元时代');
INSERT INTO `kuanshidingwei` VALUES ('5', '耗油时代');
INSERT INTO `kuanshidingwei` VALUES ('6', '发光时代');

-- ----------------------------
-- Table structure for liuyanbiao
-- ----------------------------
DROP TABLE IF EXISTS `liuyanbiao`;
CREATE TABLE `liuyanbiao` (
  `liuyanbiaoid` int(11) NOT NULL AUTO_INCREMENT,
  `liuyanbiaoxingming` varchar(20) NOT NULL,
  `liuyanbiaodianhua` int(20) NOT NULL,
  `liuyanbiaoemail` varchar(20) NOT NULL,
  `liuyanbiaoneirong` varchar(100) NOT NULL,
  PRIMARY KEY (`liuyanbiaoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of liuyanbiao
-- ----------------------------

-- ----------------------------
-- Table structure for pinpai
-- ----------------------------
DROP TABLE IF EXISTS `pinpai`;
CREATE TABLE `pinpai` (
  `pinpaiId` int(11) NOT NULL AUTO_INCREMENT,
  `pinpai` varchar(20) NOT NULL,
  PRIMARY KEY (`pinpaiId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pinpai
-- ----------------------------
INSERT INTO `pinpai` VALUES ('1', '华为');
INSERT INTO `pinpai` VALUES ('2', '小米');
INSERT INTO `pinpai` VALUES ('3', '苹果');
INSERT INTO `pinpai` VALUES ('4', '美图');
INSERT INTO `pinpai` VALUES ('5', '三星');

-- ----------------------------
-- Table structure for qiyexinxi
-- ----------------------------
DROP TABLE IF EXISTS `qiyexinxi`;
CREATE TABLE `qiyexinxi` (
  `qiyezhucehao` varchar(500) NOT NULL,
  `chenglishijian` varchar(20) NOT NULL,
  `shichangleixing` varchar(20) NOT NULL,
  `faren` varchar(500) NOT NULL,
  `zhuceziben` varchar(20) NOT NULL,
  `wangzhi` varchar(50) NOT NULL,
  `dizhi` varchar(50) NOT NULL,
  `qiyedianhua` varchar(20) NOT NULL,
  `qiyewenhua` varchar(700) NOT NULL,
  `qiyejieshao` varchar(700) NOT NULL,
  `email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`qiyezhucehao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qiyexinxi
-- ----------------------------
INSERT INTO `qiyexinxi` VALUES ('FURNITUREDESGIN是一家拥有丰富的经验的家具设计公司。所设计的家具销往全国各地。设计的实践，在于为生活提供更舒适的环境及精确负责的施工，我们具有非常专业的团队，为客户创造符合装修风格的贴心家具。满足客户的要求与喜好，甚至将梦想中的生活氛围透过专业的感知力呈现，将家具透过色彩以及最和谐的比例设计而成。公司凭借高素质的人才队伍，先进的工艺和完善的企业管理，赢得了国内外客户的良好赞誉。', '2019-04-29', '家具', 'FURNITUREDESGIN是一家拥有丰富的经验的家具设计公司。所设计的家具销往全国各地。设计的实践，在于为生活提供更舒适的环境及精确负责的施工，我们具有非常专业的团队，为客户创造符合装修风格的贴心家具。满足客户的要求与喜好，甚至将梦想中的生活氛围透过专业的感知力呈现，将家具透过色彩以及最和谐的比例设计而成。公司凭借高素质的人才队伍，先进的工艺和完善的企业管理，赢得了国内外客户的良好赞誉。', '500万', 'baidu.com', '河南省安阳市文峰区中所屯社区', '0326-1393098', '我们的家居一直秉承绿色的核心理念，以“贴近生活、用心服务、用爱做事”为企业核心文化价值。所有家具确保以最环保、安全、绿色为基础色调和核心基因，全心全意为您打造一个安全的、贴心的、精致的生活空间，环保、安全、精致不仅是对产品的用心打造，更是对员工、事业伙伴、用户、社会的责任和担当。', '大冶市云阿拉丁科技有限公司创建于2015年1月5日，总部位于青铜故里——大冶市。公司致力于帮助传统行业实现在互联网时代的转型升 级。目前经营的范围包括：电子商务平台开发技术支持、技术转让、运维技术服务、大数据、云计算等。大冶市云阿拉丁科技有限公司创建于2015年1月5日，总部位于青铜故里——大冶市。公司致力于帮助传统行业实现在互联网时代的转型升级。目前经营的范围包括：电子商务平台开发技术支持、技术转让、运维技术服务、大数据、云计算等。大冶市云阿拉丁科技有限公司创建于2015年1月5日，总部位于青铜故里——大冶市。公司致力于帮助传统行业实现在互联网时代的转型升 级。目前经营的范围包括：电子商务平台开发技术支持、技术转让、运维技术服务、大数据、云计算等。大冶市云阿拉丁科技有限公司创建于2015年1月5日，总部位于青铜故里——大冶市。公司致力于帮助传统行业实现在互联网时代的转型升级。目前经营的范围包括：电子商务平台开发技术支持、技术转让、运维技术服务、大数据、云计算等。大冶市云阿拉丁科技有限公司创建于2015年1月5日，总部位于青铜故里——大冶市。公司致力于帮助传统行业实现在互联网时代的转型升级。目前经营的范围包括：电子商务平台开发技术支持、技术转让、运维技术服务、大数据、云计算等', '130077@qq.com');

-- ----------------------------
-- Table structure for shejishixinxibiao
-- ----------------------------
DROP TABLE IF EXISTS `shejishixinxibiao`;
CREATE TABLE `shejishixinxibiao` (
  `shejishiid` int(11) NOT NULL AUTO_INCREMENT,
  `shejishisname` varchar(20) NOT NULL,
  `shejishidengji` varchar(20) NOT NULL,
  `img` varchar(50) NOT NULL,
  PRIMARY KEY (`shejishiid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shejishixinxibiao
-- ----------------------------
INSERT INTO `shejishixinxibiao` VALUES ('1', '史密斯', '首席金牌设计师', './images/team1.png');
INSERT INTO `shejishixinxibiao` VALUES ('2', '刘凯力', '首席金牌设计师', './images/team2.png');
INSERT INTO `shejishixinxibiao` VALUES ('3', '小李子', '首席金牌设计师', './images/team3.png');
INSERT INTO `shejishixinxibiao` VALUES ('4', 'lisa', '首席金牌设计师', './images/team4.png');

-- ----------------------------
-- Table structure for shejiyuansu
-- ----------------------------
DROP TABLE IF EXISTS `shejiyuansu`;
CREATE TABLE `shejiyuansu` (
  `yuansuId` int(11) NOT NULL AUTO_INCREMENT,
  `yuansu` varchar(20) NOT NULL,
  PRIMARY KEY (`yuansuId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shejiyuansu
-- ----------------------------
INSERT INTO `shejiyuansu` VALUES ('1', '大师设计');
INSERT INTO `shejiyuansu` VALUES ('2', '小弟设计');
INSERT INTO `shejiyuansu` VALUES ('3', '弟弟设计');
INSERT INTO `shejiyuansu` VALUES ('4', '大哥设计');
INSERT INTO `shejiyuansu` VALUES ('5', '老大设计');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) NOT NULL,
  `upwd` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'liuxiang', '123456', '4@qq.com');
INSERT INTO `user` VALUES ('2', 'zuojiaxiu', '123456', '4@qq.com');
INSERT INTO `user` VALUES ('3', 'maaofei', '123456', '4@qq.com');
INSERT INTO `user` VALUES ('4', 'songzhiyi', '123456', '4@qq.com');

-- ----------------------------
-- Table structure for yanse
-- ----------------------------
DROP TABLE IF EXISTS `yanse`;
CREATE TABLE `yanse` (
  `yanseId` int(11) NOT NULL AUTO_INCREMENT,
  `yanse` varchar(20) NOT NULL,
  PRIMARY KEY (`yanseId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yanse
-- ----------------------------
INSERT INTO `yanse` VALUES ('1', '红色');
INSERT INTO `yanse` VALUES ('2', '黄色');
INSERT INTO `yanse` VALUES ('3', '紫色');
INSERT INTO `yanse` VALUES ('4', '蓝色');
INSERT INTO `yanse` VALUES ('5', '白色');
INSERT INTO `yanse` VALUES ('6', '黄色');

-- ----------------------------
-- Table structure for zixunleibie
-- ----------------------------
DROP TABLE IF EXISTS `zixunleibie`;
CREATE TABLE `zixunleibie` (
  `zixunleibieid` int(11) NOT NULL AUTO_INCREMENT,
  `zixunleibiemingcheng` varchar(20) NOT NULL,
  PRIMARY KEY (`zixunleibieid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zixunleibie
-- ----------------------------
INSERT INTO `zixunleibie` VALUES ('1', '行业新闻');
INSERT INTO `zixunleibie` VALUES ('2', '家具百科');
INSERT INTO `zixunleibie` VALUES ('3', '公司新闻');

-- ----------------------------
-- Table structure for zixunxinxi
-- ----------------------------
DROP TABLE IF EXISTS `zixunxinxi`;
CREATE TABLE `zixunxinxi` (
  `zixunxinxiid` int(11) NOT NULL AUTO_INCREMENT,
  `zixunxinxibiaoti` varchar(20) NOT NULL,
  `zixunxinxineirong` varchar(100) NOT NULL,
  `zixunxinxirqi` date NOT NULL,
  `zixunleibieid` int(11) DEFAULT NULL,
  PRIMARY KEY (`zixunxinxiid`),
  KEY `zixunleibieid` (`zixunleibieid`),
  CONSTRAINT `zixunxinxi_ibfk_1` FOREIGN KEY (`zixunleibieid`) REFERENCES `zixunleibie` (`zixunleibieid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zixunxinxi
-- ----------------------------
INSERT INTO `zixunxinxi` VALUES ('1', '家具有那些类型', '现代家具，欧式古典家具，美式家具，中式古典家具，（也就是红木家具），还有近两年比较流行的新古典', '2017-05-01', '2');
INSERT INTO `zixunxinxi` VALUES ('2', '家具质量怎么样', '现代家具，欧式古典家具，美式家具，中式古典家具，（也就是红木家具），还有近两年比较流行的新古典', '2017-05-01', '2');
INSERT INTO `zixunxinxi` VALUES ('3', '家具行情', '现代家具，欧式古典家具，美式家具，中式古典家具，（也就是红木家具），还有近两年比较流行的新古典', '2017-06-08', '1');
INSERT INTO `zixunxinxi` VALUES ('4', '家具销售', '现代家具，欧式古典家具，美式家具，中式古典家具，（也就是红木家具），还有近两年比较流行的新古典', '2017-05-08', '1');
INSERT INTO `zixunxinxi` VALUES ('5', '家具公司新闻', '现代家具，欧式古典家具，美式家具，中式古典家具，（也就是红木家具），还有近两年比较流行的新古典', '2017-06-08', '3');
INSERT INTO `zixunxinxi` VALUES ('6', '家具公司销售', '现代家具，欧式古典家具，美式家具，中式古典家具，（也就是红木家具），还有近两年比较流行的新古典', '2017-06-09', '3');
