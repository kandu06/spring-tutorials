This project showcases simple application that is configured using spring java annotations.
AppContext.java is the @Configuration file, which simple uses component scan. No ApplicationContext.xml is used in this project.
Bean definition is on the individual classes and @Autowired
 
 Beans like CustomerServiceImple are annotated and autowired where needed.

NOTE:@Service, @Bean, @Repository are all forms of @Bean, you could just use @Bean instead of @Service and @Repository, but it is best practice to use specific annotations for spcefic classes.