create schema ershouche collate utf16_general_ci;

use ershouche;
-- auto-generated definition

create table address
(
    id        bigint auto_increment comment '主键'
        primary key,
    addtime   timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    userid    bigint                              not null comment '用户id',
    address   varchar(200)                        not null comment '地址',
    name      varchar(200)                        not null comment '收货人',
    phone     varchar(200)                        not null comment '电话',
    isdefault varchar(200)                        not null comment '是否默认地址[是/否]'
)
    comment '地址' charset = utf8;

DROP TABLE IF EXISTS `cart`;

CREATE TABLE `cart` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                        `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                        `tablename` varchar(200) DEFAULT 'techanxinxi' COMMENT '商品表名',
                        `userid` bigint(20) NOT NULL COMMENT '用户id',
                        `goodid` bigint(20) NOT NULL COMMENT '商品id',
                        `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
                        `picture` varchar(200) DEFAULT NULL COMMENT '图片',
                        `buynumber` int(11) NOT NULL COMMENT '购买数量',
                        `price` float DEFAULT NULL COMMENT '单价',
                        `discountprice` float DEFAULT NULL COMMENT '会员价',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1655295867695 DEFAULT CHARSET=utf8 COMMENT='购物车表';


-- auto-generated definition
create table chandi
(
    id      bigint auto_increment comment '主键'
        primary key,
    addtime timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    chandi  varchar(200)                        not null comment '产地',
    constraint chandi
        unique (chandi)
)
    comment '产地' charset = utf8;

-- auto-generated definition
create table chat
(
    id      bigint auto_increment comment '主键'
        primary key,
    addtime timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    userid  bigint                              not null comment '用户id',
    adminid bigint                              null comment '管理员id',
    ask     longtext                            null comment '提问',
    reply   longtext                            null comment '回复',
    isreply int                                 null comment '是否回复'
)
    comment '在线客服' charset = utf8;

-- auto-generated definition
create table config
(
    id    bigint auto_increment comment '主键'
        primary key,
    name  varchar(100) not null comment '配置参数名称',
    value varchar(100) null comment '配置参数值'
)
    comment '配置文件' charset = utf8;

-- auto-generated definition
create table discusstechanxinxi
(
    id       bigint auto_increment comment '主键'
        primary key,
    addtime  timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    refid    bigint                              not null comment '关联表id',
    userid   bigint                              not null comment '用户id',
    nickname varchar(200)                        null comment '用户名',
    content  longtext                            not null comment '评论内容',
    reply    longtext                            null comment '回复内容'
)
    comment '商品信息评论表' charset = utf8;

-- auto-generated definition
create table discusszhaoshangzixun
(
    id       bigint auto_increment comment '主键'
        primary key,
    addtime  timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    refid    bigint                              not null comment '关联表id',
    userid   bigint                              not null comment '用户id',
    nickname varchar(200)                        null comment '用户名',
    content  longtext                            not null comment '评论内容',
    reply    longtext                            null comment '回复内容'
)
    comment '招商资讯评论表' charset = utf8;

-- auto-generated definition
create table forum
(
    id       bigint auto_increment comment '主键'
        primary key,
    addtime  timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    title    varchar(200)                        null comment '帖子标题',
    content  longtext                            not null comment '帖子内容',
    parentid bigint                              null comment '父节点id',
    userid   bigint                              not null comment '用户id',
    username varchar(200)                        null comment '用户名',
    isdone   varchar(200)                        null comment '状态'
)
    comment '交流论坛' charset = utf8;

-- auto-generated definition
create table news
(
    id           bigint auto_increment comment '主键'
        primary key,
    addtime      timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    title        varchar(200)                        not null comment '标题',
    introduction longtext                            null comment '简介',
    picture      varchar(200)                        not null comment '图片',
    content      longtext                            not null comment '内容'
)
    comment '商品资讯' charset = utf8;

-- auto-generated definition
create table orders
(
    id            bigint auto_increment comment '主键'
        primary key,
    addtime       timestamp    default CURRENT_TIMESTAMP not null comment '创建时间',
    orderid       varchar(200)                           not null comment '订单编号',
    tablename     varchar(200) default 'techanxinxi'     null comment '商品表名',
    userid        bigint                                 not null comment '用户id',
    goodid        bigint                                 not null comment '商品id',
    goodname      varchar(200)                           null comment '商品名称',
    picture       varchar(200)                           null comment '商品图片',
    buynumber     int                                    not null comment '购买数量',
    price         float        default 0                 not null comment '价格/积分',
    discountprice float        default 0                 null comment '折扣价格',
    total         float        default 0                 not null comment '总价格/总积分',
    discounttotal float        default 0                 null comment '折扣总价格',
    type          int          default 1                 null comment '支付类型',
    status        varchar(200)                           null comment '状态',
    address       varchar(200)                           null comment '地址',
    constraint orderid
        unique (orderid)
)
    comment '订单' charset = utf8;

-- auto-generated definition
create table storeup
(
    id        bigint auto_increment comment '主键'
        primary key,
    addtime   timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    userid    bigint                              not null comment '用户id',
    refid     bigint                              null comment '收藏id',
    tablename varchar(200)                        null comment '表名',
    name      varchar(200)                        not null comment '收藏名称',
    picture   varchar(200)                        not null comment '收藏图片'
)
    comment '收藏表' charset = utf8;

-- auto-generated definition
create table techanfenlei
(
    id           bigint auto_increment comment '主键'
        primary key,
    addtime      timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    techanfenlei varchar(200)                        not null comment '商品分类',
    constraint techanfenlei
        unique (techanfenlei)
)
    comment '商品分类' charset = utf8;

-- auto-generated definition
create table techanxinxi
(
    id              bigint auto_increment comment '主键'
        primary key,
    addtime         timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    techanmingcheng varchar(200)                        not null comment '商品名称',
    techanfenlei    varchar(200)                        not null comment '商品分类',
    tupian          varchar(200)                        not null comment '图片',
    pinpai          varchar(200)                        null comment '品牌',
    guige           varchar(200)                        null comment '规格',
    chandi          varchar(200)                        null comment '产地',
    techanxiangqing longtext                            null comment '商品详情',
    clicktime       datetime                            null comment '最近点击时间',
    clicknum        int       default 0                 null comment '点击次数',
    price           float                               not null comment '价格'
)
    comment '商品信息' charset = utf8;

-- auto-generated definition
create table token
(
    id            bigint auto_increment comment '主键'
        primary key,
    userid        bigint                              not null comment '用户id',
    username      varchar(100)                        not null comment '用户名',
    tablename     varchar(100)                        null comment '表名',
    role          varchar(100)                        null comment '角色',
    token         varchar(200)                        not null comment '密码',
    addtime       timestamp default CURRENT_TIMESTAMP not null comment '新增时间',
    expiratedtime timestamp default CURRENT_TIMESTAMP not null comment '过期时间'
)
    comment 'token表' charset = utf8;

-- auto-generated definition
create table users
(
    id       bigint auto_increment comment '主键'
        primary key,
    username varchar(100)                           not null comment '用户名',
    password varchar(100)                           not null comment '密码',
    role     varchar(100) default '管理员'             null comment '角色',
    addtime  timestamp    default CURRENT_TIMESTAMP not null comment '新增时间'
)
    comment '用户表' charset = utf8;

-- auto-generated definition
create table yonghu
(
    id            bigint auto_increment comment '主键'
        primary key,
    addtime       timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    yonghuming    varchar(200)                        not null comment '用户名',
    mima          varchar(200)                        not null comment '密码',
    xingming      varchar(200)                        null comment '姓名',
    xingbie       varchar(200)                        null comment '性别',
    touxiang      varchar(200)                        null comment '头像',
    lianxidianhua varchar(200)                        null comment '联系电话',
    money         float     default 0                 null comment '余额',
    constraint yonghuming
        unique (yonghuming)
)
    comment '用户' charset = utf8;

-- auto-generated definition
create table zhaoshangzixun
(
    id       bigint auto_increment comment '主键'
        primary key,
    addtime  timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    biaoti   varchar(200)                        not null comment '标题',
    leixing  varchar(200)                        not null comment '类型',
    tupian   varchar(200)                        not null comment '图片',
    neirong  longtext                            null comment '内容',
    faburiqi date                                null comment '发布日期'
)
    comment '招商资讯' charset = utf8;

