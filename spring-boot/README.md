This project uses showcases the use of spring boot web.
spring-boot-starter-web
spring-boot-starter-data-jpa
spring-boot-starter-test

Everything is auto configured. Just start writing the controller classes, Spring automatically searchs all packages and identifies the controllers.

Starts with main java, in this case, DasBootApplication.java, which is annotated with @SpringBootApplication

static content can be placed in one of the folders under src/main/resources dir, static, public, resources.

@RestController, @RequestMapping use is showcased.

Repository is autowired. Take a look at ShipwreckRepository on how easy it is to implement CRUD operations on a table that has column names same as fileds on the model.

application.properties & application-<env>.properites use is showcased.

Test cases are also showcased.

flyway db migration is showcased.

mockito & hamcrest is also showcased.

Where to go from here ..
hibernate, jpa, spring jdbc
mockito & hamcrest
flyway db.


