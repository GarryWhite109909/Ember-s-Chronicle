package com.yaoyan.game.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Swagger/OpenAPI 配置类
 */
@Configuration
public class SwaggerConfig {

    @Value("${server.port:8080}")
    private String serverPort;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Ember's Chronicle 后端API文档")
                        .version("0.0.1-SNAPSHOT")
                        .description("Ember's Chronicle 游戏后端API接口文档\n" +
                                "技术栈: Spring Boot 3.5.9 + MySQL + Redis + TripoAI SDK\n" +
                                "负责人: 小白\n" +
                                "项目说明: 湖湘文化题材的3D游戏后端服务")
                        .contact(new Contact()
                                .name("Ember's Chronicle Team")
                                .email("yaoyan@example.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")))
                .servers(List.of(
                        new Server().url("http://localhost:" + serverPort).description("本地开发环境"),
                        new Server().url("http://dev.yaoyan.com").description("开发测试环境"),
                        new Server().url("https://api.yaoyan.com").description("生产环境")
                ));
    }
}
