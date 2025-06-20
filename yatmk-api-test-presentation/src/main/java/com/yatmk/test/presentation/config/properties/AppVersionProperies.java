package com.yatmk.test.presentation.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Configuration
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "app")
public class AppVersionProperies {

  private String version;

}
