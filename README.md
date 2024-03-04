Microservices Communication
----------------------------------
1.RestTemplate
2.WebClient
3.FiegnClient

using RestTemplate
-------------------
RestTemplate is a class provided by the Spring Framework that simplifies the process of making HTTP requests to RESTful web services. It abstracts away much of the complexity of working directly with the Java URLConnection API or other HTTP client libraries.

With RestTemplate, you can perform various HTTP methods such as GET, POST, PUT, DELETE, etc., and handle the responses easily.

Requirements(RestTemplate)
--------------------------------
-> Consider Employe belongs to department and employee has a unique department code.     
-> Chanage Get EMployee RestAPI return Employee along with it's department in response.

Development Steps
-------------------
-> Add departmentCode field in Employee JPA Entity.       
-> Create DepartmentDto Class.                        
-> Configure RestTemplate as spring Bean.                       
-> Inject and Use RestTemplate to make RESTAPi call in EmployeeService class.                    
