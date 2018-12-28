# SpringBootDubbo
SpringBoot整合dubbo实例 纯注解版

项目架构描述
项目采用maven多模块开发
SpringBootDubbo（父工程）
    --dubbo-Serivce（服务提供者工程）
        /src/main/java
          --com.yang.boot 启动类
          --com.yang.service 服务接口 也是dubbo暴露服务接口
          --com.yang.service.impl 服务实现
        /src/main/resource
          --application.properties 全局配置文件
    --dubbo-Web（服务消费者工程）
        /src/main/java
          --com.yang.boot 启动类
          --com.yang.service 服务接口 也是dubbo消费服务接口
          --com.yang.control web层访问配置控制器
        /src/main/resource
          --application.properties 全局配置文件
    
    

