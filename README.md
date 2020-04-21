#### Table of contents
- [在线教育网站](#在线教育网站)
    - [项目简介](#项目简介)
    - [技术架构简图](#技术架构简图)
### 在线教育网站

#### 项目简介

学成在线服务端基于Spring Boot构建，采用Spring Cloud微服务框架

| 模块       | **技术栈**                                                   |
| :--------- | ------------------------------------------------------------ |
| 数据访问层 | Spring Data JPA 、Mybatis、Spring Data Mongodb等             |
| 业务层     | Spring IOC、Aop事务控制、Spring Task任务调度、Feign、Ribbon、Spring AMQP、Spring Data Redis |
| 控制层     | Spring MVC、FastJSON、RestTemplate、Spring Security Oauth2+JWT等 |
| 微服务治理 | Eureka、Zuul、Hystrix、Spring Cloud Config等                 |
| 持久层     | MySQL、MongoDB、Redis、ElasticSearch                         |

#### 技术架构简图

![架构图](https://shinkeika.github.io/images/javaedu/xiangmujiagoutu.png)

#### 前端项目

> xc-ui-pc-static-portal      门户工程
>
> xc-ui-pc-sysmanage      系统管理前端工程
>
> xc-ui-pc-teach               课程管理前端工程
>
> 

#### 后端项目

>xc-framework-parent                      父工程，提供依赖管理
>
>xc-framework-common                  通用工程，提供各层封装
>
>xc-framework-model                      模型工程，提供统一的模型类管理
>
>xc-framework-utils                         工具类工程，提供本项目所使用的工具类
>
>xc-framework-api                           接口工程，统一管理本项目的服务接口
>
>xc-service-manage-cms                CMS页面管理系统(端口31001)
>
>xc‐service‐manage‐cms‐client     CMS页面客户端系统(端口31000)
>
>xc-service-manage-course            课程管理系统(端口31200)
>
>xc-service-manage-media			 课程媒体资料管理服务(端口31400)
>
>Xc-service-manage-media-processor  课程
>
>xc-service-base-filesystem            文件上传微服务(22100)
>
>xc-govern-center                           注册中心(50101)




