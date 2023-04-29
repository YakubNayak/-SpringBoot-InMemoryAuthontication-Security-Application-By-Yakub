# -SpringBoot-InMemoryAuthontication-Security-Application-By-Yakub
Spring Boot Rest Application for In Custom Authentication
and in Memeory Authentication 
---------------------------------------------------------------------
My Requirement  is
-------------------
1. /home: no need to secure
2. /balance: the end point should be secured
3. /statement: the end point should be secured
4. /loan: the end point should be secured
5. /contact: no need to secure

=============================================
Reuired Files Are
-------------------------
1. MyRestController   --> @RestController
     with 5 service end points
2. application.properties
3. CustomSecurity.java   --> @Configuration+@EnableWebSecurity+@Bean
4. App.java    --> @SpringBootApplication
=========================================================
Reuired Jars Are
-----------------------
1. Spring web
2. Spring Security
