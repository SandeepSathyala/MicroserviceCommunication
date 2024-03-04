Microservices Communication
-----------------------------

This project demonstrates different options for communication between microservices in a Spring Boot application. The following communication methods are explored:

1. RestTemplate
2. WebClient
3. FeignClient

Requirements
--------------------------------
-> Consider Employe belongs to department and employee has a unique department code.     
-> Chanage Get EMployee RestAPI return Employee along with it's department in response.

using RestTemplate
-------------------
RestTemplate is a synchronous HTTP client for making HTTP requests to external services or APIs. It is part of the Spring framework and provides a straightforward way to communicate with RESTful services. However, it can be blocking and less efficient in handling concurrent requests compared to reactive alternatives.
To use RestTemplate, you can simply create an instance and make HTTP requests using methods like `getForObject()` or `postForObject()`.

Development Steps (RestTemplate)
----------------------------------
-> Add departmentCode field in Employee JPA Entity.       
-> Create DepartmentDto Class.                        
-> Configure RestTemplate as spring Bean.                       
-> Inject and Use RestTemplate to make RESTAPi call in EmployeeService class.           

Usng WebClient
------------------
WebClient is a non-blocking, reactive web client introduced in Spring WebFlux. It provides a more efficient way to make HTTP requests compared to RestTemplate, especially in reactive applications. WebClient supports both synchronous and asynchronous request/response handling and integrates well with reactive streams.
To use WebClient, you can create an instance and build requests using a fluent API. It offers methods like `get()`, `post()`, and `exchange()` for making different types of HTTP requests.

Development Steps
-------------------
-> Add Spring WebFlux Dependency.    
-> Configure webClient as Spring Bean.    
-> Inject and use webClient to call the RESTAPI.      
-> Test using Postman Client.  

Using FeignClient
-------------------
FeignClient is part of the Spring Cloud Netflix project and provides a declarative way to create REST clients. It allows you to define interfaces annotated with special annotations that describe how to interact with other RESTful services. FeignClient handles the HTTP requests and responses, including serialization and deserialization of data.
To use FeignClient, you define an interface with method signatures corresponding to the REST endpoints of the external service. FeignClient generates proxy implementations of these interfaces, making it easy to consume RESTful services in a concise and readable manner.
Choose the appropriate communication method based on your application requirements, considering factors like performance, concurrency, and ease of use.

Development Steps
---------------------
-> Add spring cloud open feign Maven dependency to employee-service.          
-> Enable Feign Client using @EnableFeignClients.              
-> Create Feign API Client.               
-> Change the getEmployeeById method to use APIClient.               
-> Test using postman Client.    

You can use any of the mentioned communication methods in your Spring Boot application based on your specific use case. Each method has its advantages and trade-offs, so choose the one that best fits your requirements.
Ensure that you include the necessary dependencies in your project's `pom.xml` or `build.gradle` file to use RestTemplate, WebClient, or FeignClient effectively.
