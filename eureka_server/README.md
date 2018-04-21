#eureka
 ##eureka 服务端
 ##1,在主方法的类上添加@EnableEurekaClient
 ##2,在配置文件中设置：
 ####spring.application.name=eureka_client
 ####server.port=8881
 ####eureka.client.service-url.defaultZone=http://localhost:9999/eureka/