package com.sai;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class CustomSecurity extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/home").permitAll()
		.antMatchers("/balance").authenticated()
		.antMatchers("/statement").authenticated()
		.antMatchers("/loan").authenticated()
		.antMatchers("/contact").permitAll()
		.and().formLogin()     // form login for web appn
		.and().httpBasic();  //post man application login
}
	@Override
	protected void configure(AuthenticationManagerBuilder http) throws Exception {
	http.inMemoryAuthentication()
	.withUser("yakub").password("yakub@123").authorities("admin").and()
	.withUser("sai").password("sai@123").authorities("USER").and()
	.withUser("aryan").password("aryan@123").roles("USER").and()
	.withUser("anil").password("anil@123").authorities("admin").and()
	.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
}
