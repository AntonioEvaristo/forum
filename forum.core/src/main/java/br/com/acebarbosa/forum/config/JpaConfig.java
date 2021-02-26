package br.com.acebarbosa.forum.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("br.com.acebarbosa.forum.repository")
@Configuration
@EntityScan("br.com.acebarbosa.forum.model")
@EnableAutoConfiguration
public class JpaConfig {
}
