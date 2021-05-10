<p align="center">
<img src="https://img.shields.io/badge/Ova-1.0-success.svg" alt="Build Status">
 <img src="https://img.shields.io/badge/Spring%20Cloud-2020-blue.svg" alt="Coverage Status">
 <img src="https://img.shields.io/badge/Spring%20Boot-2.4-blue.svg" alt="Downloads">
 <img src="https://img.shields.io/badge/license-Apache 2.0-519dd9.svg"/>
</p>
   

## 系统说明

- 参照 Pig 开源项目 ，参考搭建
- 基于 Spring Cloud 2020 、Spring Boot 2.4、 OAuth2 的 RBAC **权限管理系统**
- 基于数据驱动视图的理念封装 element-ui，即使没有 vue 的使用经验也能快速上手
- 提供对常见容器化支持 Docker、Kubernetes、Rancher2 支持
- 提供 lambda 、stream api 、webflux 的生产实践

### 核心依赖

| 依赖                   | 版本          |
| ---------------------- | ------------- |
| Spring Boot            | 2.4.5 |
| Spring Cloud           | 2020.0.2    |
| Spring Cloud Alibaba   | 2021.1|
| Spring Security OAuth2 | 2.3.6         |
| Mybatis Plus           | 3.4.2         |
| hutool                 | 5.6.3         |
| Avue                   | 2.6.16        |

### 模块说明

```lua
ova-ui  -- https://gitee.com/log4j/ova-ui

ova
├── ova-auth -- 授权服务提供[3000]
└── ova-common -- 系统公共模块
     ├── ova-common-core -- 公共工具类核心包
     ├── ova-common-datasource -- 动态数据源包
     ├── ova-common-job -- xxl-job 封装
     ├── ova-common-log -- 日志服务
     ├── ova-common-mybatis -- mybatis 扩展封装
     ├── ova-common-security -- 安全工具类
     ├── ova-common-swagger -- 接口文档
     ├── ova-common-feign -- feign 扩展封装
     └── ova-common-test -- oauth2.0 单元测试扩展封装
├── ova-register -- Nacos Server[8848]
├── ova-gateway -- Spring Cloud Gateway网关[9999]
└── ova-upms -- 通用用户权限管理模块
     └── ova-upms-api -- 通用用户权限管理系统公共api模块
     └── ova-upms-biz -- 通用用户权限管理系统业务处理模块[4000]
└── ova-visual
     └── ova-monitor -- 服务监控 [5001]
     ├── ova-codegen -- 图形化代码生成 [5002]
     ├── ova-sentinel-dashboard -- 流量高可用 [5003]
     └── ova-xxl-job-admin -- 分布式定时任务管理台 [5004]
```



## 快速开始

### 本地开发 运行

ova 提供了详细的包括开发环境安装、服务端代码运行、前端代码运行等。

请务必**完全按照**文档部署运行章节 进行操作，减少踩坑弯路！！

### Docker 运行

```
# 下载并运行服务端代码
git clone https://gitee.com/log4j/ova.git

cd ova && mvn clean install && docker-compose up -d

# 下载并运行前端UI
git clone https://gitee.com/log4j/ova-ui.git

cd ova-ui && npm install -g cnpm --registry=https://registry.npm.taobao.org

npm run build:docker && docker-compose up -d
```

### 快速构架微服务

```bash
<!-- ova-gen archetype -->
# 在空文件夹执行以下命令，注意 windows 下  \ 修改成 ^
mvn archetype:generate \
       -DgroupId=com.ova4cloud \
       -DartifactId=demo \
       -Dversion=1.0.0-SNAPSHOT \
       -Dpackage=com.ova4cloud.ova.demo \
       -DarchetypeGroupId=com.ova4cloud.archetype \
       -DarchetypeArtifactId=ova-gen \
       -DarchetypeVersion=3.1.2 \
       -DarchetypeCatalog=local
```





## 开源共建

### 开源协议

ova 开源软件遵循 [Apache 2.0 协议](https://www.apache.org/licenses/LICENSE-2.0.html)。
允许商业使用，但务必保留类作者、Copyright 信息。

![](https://gitee.com/ova4cloud/oss/raw/master/2020-10-9/1602229452602-image.png)

### 其他说明

1. 欢迎提交 [PR](https://dwz.cn/2KURd5Vf)，注意对应提交对应 `dev` 分支

2. 欢迎提交 [issue](https://gitee.com/log4j/ova/issues)，请写清楚遇到问题的原因、开发环境、复显步骤。

3. 联系作者 <a href="mailto:ova4cloud@qq.com">ova4cloud@qq.com</a>


[![Stargazers over time](https://whnb.wang/img/log4j/ova?e=604800)](https://whnb.wang/log4j/ova?e=604800)

