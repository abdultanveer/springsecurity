package com.harman;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			// TODO Auto-generated method stub
			
			auth.inMemoryAuthentication()
			.withUser("aditya")
			.password("harman")
			.roles("USER")
			.and()
			.withUser("abdul")
			.password("ansari")
			.roles("ADMIN");
			
		}
		
		@Bean  //@Bean means hey spring  create and inject this bean[PasswordEncoder]
		public PasswordEncoder getPasswordEncoder() {
			return NoOpPasswordEncoder.getInstance();
		}
		
}
