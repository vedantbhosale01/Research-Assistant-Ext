## Research Assistant Chrome Extension - Backend
Overview
This project provides the backend services for a Chrome extension that functions as a research assistant. The extension allows users to select text on web pages and get summarized versions of the selected content. The backend is built using Spring Boot with Spring Web and WebFlux for reactive programming support.

#### Features
- Text summarization API endpoint

- Reactive non-blocking architecture

- Scalable backend service

- RESTful API design

- CORS configuration for Chrome extension integration

#### Technologies Used
- Spring Boot 3.x - Core application framework

- Spring Web - Traditional REST controller support

- Spring WebFlux - Reactive programming support

- Project Reactor - Reactive streams implementation

- Lombok - Reduced boilerplate code

##### API Endpoints
- POST /api/summarize
"Summarizes the provided text."

###### Request:

json
{
  "text": "The full text content to be summarized...",
  "length": "short" // optional: "short", "medium", or "long"
}
Response:

json
{
  "summary": "The summarized version of the text...",
  "originalLength": 245,
  "summaryLength": 42,
  "status": "SUCCESS"
}
#### Getting Started
###### Prerequisites
- Java 17 or higher

- Maven 3.6.3 or higher

### Installation
###### Clone the repository:

###### bash:-
- git clone https://github.com/yourusername/research-assistant-backend.git
- cd research-assistant-backend

###### Build the project:

bash
mvn clean install
Run the application:

bash
java -jar target/research-assistant-backend-1.0.0.jar
Configuration
Application properties can be configured in src/main/resources/application.yml:

yaml
server:
  port: 8080
  servlet:
    context-path: /api

spring:
  application:
    name: research-assistant-service
Development
Running in Development Mode
bash
mvn spring-boot:run
Building for Production


######  01 :-
![alt text](image-1.png)

######  02 :-
![alt text](image-2.png)#
