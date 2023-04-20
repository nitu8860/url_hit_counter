# URL Hit Counter

## Frameworks and language used
- Spring Boot
- Java
- Maven

## Data flow
- Controller
- Services

## Data Structure used in your project
- HashMap

## Project Summary
The URL Hit Counter is a simple Spring Boot application that keeps track of the number of hits for each username. When a user visits the endpoint **/api/v1/visitor-count-app/username/{username}/count** , the hit count for the specified username is returned. The hit count for each username is stored in a HashMap in the UrlHitService class. The project also includes an endpoint **/api/v1/visitor-count-app/findall** to display the hit count for all usernames.
