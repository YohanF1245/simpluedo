# Api utilisation instruction

## Update application properties file
Update file in : src/main/ressources/application.properties
```
spring.application.name=<db-name>

spring.datasource.url=jdbc:postgresql://localhost:5432/<db-url>
spring.datasource.username=<db-username>
spring.datasource.password=<db-pass>
spring.jpa.show-sql=true

## Hibernate Properties
# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update
```