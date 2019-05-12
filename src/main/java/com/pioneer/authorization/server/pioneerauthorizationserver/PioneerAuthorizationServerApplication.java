package com.pioneer.authorization.server.pioneerauthorizationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class PioneerAuthorizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PioneerAuthorizationServerApplication.class, args);
	}

}

// https://www.baeldung.com/sso-spring-security-oauth2
// https://medium.com/@akourtim.ahmed/oauth-2-centralized-authorization-with-spring-boot-2-0-2-and-spring-security-5-and-jdbc-token-store-8dbc063bd5d4