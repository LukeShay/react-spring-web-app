//package io.lukeshay.restapi;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.cors().disable()
//				.authorizeRequests()
//				.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
//				.anyRequest()
//				.fullyAuthenticated()
//				.and()
//				.httpBasic()
//				.and()
//				.csrf().disable();
//	}
//
//	@Override
//	public void configure(WebSecurity web) {
//		web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
//	}
//}