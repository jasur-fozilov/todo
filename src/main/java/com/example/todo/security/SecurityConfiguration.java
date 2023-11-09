// package com.example.todo.security;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
// import org.springframework.security.crypto.password.NoOpPasswordEncoder;
// import com.sun.management.GarbageCollectorMXBean;
// import jakarta.security.auth.message.AuthException;


// @Configuration
// public class SecurityConfiguration extends WebSecurityConfiguration {
//     @Autowired
//     public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
//     throws Exception {
//         auth.inMemoryAuthentication()
//         .passwordEncoder(NoOpPasswordEncoder.getInstance())
//         .withUser("admin").password("admin")
//         .roles("USER", "ADMIN");
//     }

//     @Override
//     protected void configure(HttpSecurity http) throws Exception{
//         http.authorizeRequests().antMatchers("login/", "/h2-console/**").permitAll()
//         .antMatchers("/","/*todo*/**").access("hasRole('USER')").and().formLogin();

//         http.csrf().disable();
//         http.headers().frameOptions().disable();
//     }
// }