Microservices Communication
----------------------------------
1.RestTemplate
2.WebClient
3.FiegnClient

using RestTemplate
-------------------
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
