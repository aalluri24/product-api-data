# product-api-data
 Implemented Spingboot data jpa with Hibernate & Actuator
 
 This is to retrieve the list of products in an Order

Used embedded Apache Derby as this is an sample project created for the below concepts
1. Springboot Data JPA with Hibernate
2. Actuator -- For default monitoring such as Health, DB Status etc.


**Actuator:**

Endpoints for Actuator:
http://localhost:8081/actuator/health -- This is for checking the health of the service including the Database Apache Derby

Inorder to see all the info about service Health, please give the following setting in the resources/application.properties.
management.endpoint.health.show-details=always
