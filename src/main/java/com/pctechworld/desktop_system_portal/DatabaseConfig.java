// package com.pctechworld.desktop_system_portal;
// import com.zaxxer.hikari.*;

// import javax.sql.DataSource;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.*;

// @Configuration
// public class DatabaseConfig {

//   @Value("${spring.datasource.url}")
//   private String dbUrl;

//   @Bean
//   public DataSource dataSource() {
//       HikariConfig config = new HikariConfig();
//       config.setJdbcUrl(dbUrl);
//       return new HikariDataSource(config);
//   }
// }