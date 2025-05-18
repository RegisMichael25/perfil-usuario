spring.application.name=api

# Configuracoes do Mysql
spring.datasource.url=jdbc:mysql://mysql-ong-server-ong-web.d.aivencloud.com:20774/api_dev?ssl-mode=REQUIRED
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.username=avnadmin
spring.datasource.password=AVNS_UgZOpmZlPTgGOHK2Rt5

# JPA/Hibernate
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

# Configuracao do Flyway
spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration
spring.flyway.baseline-on-migrate=true