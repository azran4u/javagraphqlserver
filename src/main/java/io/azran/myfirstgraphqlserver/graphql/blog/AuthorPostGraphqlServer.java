package io.azran.myfirstgraphqlserver.graphql.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(GraphqlConfiguration.class)
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class AuthorPostGraphqlServer {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "my graphql");
        SpringApplication.run(AuthorPostGraphqlServer.class, args);
    }
}
