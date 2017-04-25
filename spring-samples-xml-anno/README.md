This project showcases simple application that is configured using spring xml configuration and annotations.
ApplicationContext.xml is the xml configuration file, it simple tells spring that this project uses annotations and component scan.

Beans like CustomerServiceImple are annotated and autowired where needed.

NOTE:@Service, @Bean, @Repository are all forms of @Bean, you could just use @Bean instead of @Service and @Repository, but it is best practice to use specific annotations for spcefic classes.