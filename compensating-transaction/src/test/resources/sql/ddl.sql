SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `follow_transaction_record`;
CREATE TABLE `follow_transaction_record`(
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `transation_id` bigint(20) unsigned NOT NULL,
  `topic` varchar(30) NOT NULL,
  `gmt_create` datetime NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `transaction_record`;
CREATE TABLE `transaction_record`(
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `relate_id` bigint(20) unsigned NOT NULL,
  `type` tinyint(3) unsigned NOT NULL,
  `is_processed` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `times` bigint(20) unsigned NOT NULL DEFAULT '0',
  `gmt_modified` datetime NOT NULL,
  `gmt_create` datetime NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `shopping_order`;
CREATE TABLE `shopping_order` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `member_id` bigint(20) unsigned NOT NULL COMMENT '用户ID',
  `member_num` varchar(19) DEFAULT NULL COMMENT '会员编号',
  `member_nickname` varchar(50) NOT NULL COMMENT '会员昵称',
  `merchant_id` bigint(20) NOT NULL COMMENT '商家ID',
  `merchant_store_id` bigint(20) unsigned NOT NULL COMMENT '门店id',
  `merchant_store_region_path` varchar(25) NOT NULL COMMENT '商家门店区域（省市区id）',
  `activity_id` bigint(20) unsigned DEFAULT NULL COMMENT '抢购活动id',
  `activity_product_id` bigint(20) unsigned DEFAULT NULL COMMENT '抢购活动商品id',
  `merchant_num` varchar(19) DEFAULT '' COMMENT '商家编号',
  `merchant_name` varchar(100) NOT NULL COMMENT '商家名称',
  `consignee_name` varchar(20) NOT NULL COMMENT '收货人姓名',
  `consignee_address` varchar(180) NOT NULL COMMENT '收货人地址',
  `consignee_mobile` varchar(15) NOT NULL COMMENT '收货人手机号码',
  `remark` varchar(100) DEFAULT NULL COMMENT '订单备注(退货理由)',
  `message` varchar(200) DEFAULT NULL COMMENT '买家留言',
  `freight_price` decimal(10,2) unsigned NOT NULL COMMENT '运费',
  `commodity_total_price` decimal(10,2) unsigned NOT NULL COMMENT '商品总价',
  `order_total_price` decimal(10,2) unsigned NOT NULL COMMENT '订单总价',
  `actual_amount` decimal(10,2) unsigned DEFAULT NULL COMMENT '实际支付给商家的金额',
  `commission_status` tinyint(2) unsigned NOT NULL DEFAULT '0' COMMENT '是否计算过提成(0-没有计算过提成|1-计算过提成)',
  `order_status` tinyint(2) unsigned NOT NULL COMMENT '订单的总状态(0-待处理|1-待付款|2-待发货|3-待收货|4-交易成功|5-交易关闭|6-退款中)',
  `status` tinyint(2) NOT NULL COMMENT '状态(0删除1正常)',
  `send_time` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '发送提醒的次数',
  `is_fans` tinyint(1) unsigned NOT NULL COMMENT '购买前用户是否是商家的粉丝',
  `is_no_reason_return` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否支持无理由退货,0否 1是',
  `is_automatic_receipt` tinyint(1) unsigned DEFAULT NULL COMMENT '是否自动收货(0-否|1-是)',
  `is_done` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '当前订单是否完成(0-未完成|1-已完成)',
  `is_refund_items` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否有退款项(0-没有|1-有)',
  `shopping_cart_ids_str` varchar(50) DEFAULT NULL COMMENT '对应的购物车相应的id(多个id用,分隔)',
  `order_num` varchar(20) NOT NULL COMMENT '订单编号',
  `payment_method` tinyint(2) unsigned DEFAULT NULL COMMENT '支付方式(1-余额 2-支付宝 3-微信)',
  `third_number` varchar(50) DEFAULT NULL COMMENT '第三方支付交易号',
  `is_needs_logistics` tinyint(1) unsigned DEFAULT '0' COMMENT '是否需要物流(0-不需要|1-需要)',
  `waybill_num` varchar(20) DEFAULT NULL COMMENT '运单编号',
  `express_company_id` int(11) unsigned DEFAULT NULL COMMENT '快递公司id',
  `express_company_code` varchar(40) DEFAULT NULL COMMENT '快递公司编码',
  `express_company_name` varchar(50) DEFAULT NULL COMMENT '快递公司名称',
  `gmt_commission` datetime DEFAULT NULL COMMENT '计算提成的时间',
  `gmt_payment` datetime DEFAULT NULL COMMENT '付款时间',
  `gmt_transport` datetime DEFAULT NULL COMMENT '发货时间',
  `gmt_transaction` datetime DEFAULT NULL COMMENT '成交时间',
  `gmt_done` datetime DEFAULT NULL COMMENT '订单完成时间',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
);

DROP TABLE IF EXISTS `seckill_activity_product`;
CREATE TABLE `seckill_activity_product` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity_id` bigint(20) unsigned NOT NULL COMMENT '抢购活动id',
  `merchant_id` bigint(20) unsigned NOT NULL COMMENT '商家id',
  `product_id` bigint(20) unsigned NOT NULL COMMENT '商品id',
  `product_picture` varchar(120) NOT NULL COMMENT '商品图片',
  `product_name` varchar(100) NOT NULL COMMENT '商品名称',
  `original_price` decimal(10,2) unsigned NOT NULL COMMENT '商品原价',
  `product_model_count` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '商品型号总数量',
  `left_count` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '剩余数量',
  `turnover` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '成交额',
  `reasons` varchar(200) NOT NULL DEFAULT '' COMMENT '反馈原因',
  `auditor_account` varchar(50) DEFAULT NULL COMMENT '审核人员',
  `audit_time` datetime DEFAULT NULL COMMENT '审核时间',
  `attention_count` int(10) unsigned NOT NULL COMMENT '关注人数',
  `status` tinyint(2) unsigned NOT NULL DEFAULT '1' COMMENT '状态(1-未审核|2-已审核|3-未通过|)',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
);