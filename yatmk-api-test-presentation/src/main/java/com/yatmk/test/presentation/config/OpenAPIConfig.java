package com.yatmk.test.presentation.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
@OpenAPIDefinition(info = @Info(title = "YATMK - TEST API", version = "1.0", description = "YATMK - TEST API"))
public class OpenAPIConfig {

  private static final String SECURITY_SCHEME_NAME = "bearerAuth";

  private static final String SECURITY_SCHEME = "bearer";

  private static final String SECURITY_BEARER_FORMAT = "bearer";

  @Value("${server.servlet.context-path:/}")
  private String serverPath;

  @Bean
  public OpenAPI openAPI() {

    return new OpenAPI()
        .servers(servers())
        .addSecurityItem(securityRequirement())
        .components(components());

  }

  public List<Server> servers() {

    Server server = new Server();
    server.setUrl(serverPath);
    return Arrays.asList(server);

  }

  private SecurityRequirement securityRequirement() {
    return new SecurityRequirement()
        .addList(SECURITY_SCHEME_NAME);

  }

  private Components components() {
    return new Components()
        .addSecuritySchemes(SECURITY_SCHEME_NAME, securityScheme());

  }

  private SecurityScheme securityScheme() {

    return new SecurityScheme()
        .name(SECURITY_SCHEME_NAME)
        .type(SecurityScheme.Type.HTTP)
        .scheme(SECURITY_SCHEME)
        .bearerFormat(SECURITY_BEARER_FORMAT);

  }

}
