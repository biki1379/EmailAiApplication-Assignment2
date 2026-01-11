# EmailAiApplication-Assignment2
# AI-Powered Email Template Generator

## Overview
This project is a simple Spring Boot backend service that generates professional email templates based on user input.
The service is designed to be AI-ready and follows clean backend architecture principles.

The API accepts a few input fields such as purpose, recipient name, and tone, and returns a generated email template along with the response time.

--------------------------------------------------------------------------------------------------------------------

## API Endpoint

### POST /api/email/generate

#### Request Body
json
{
  "purpose": "job application follow-up",
  "recipientName": "HR Team",
  "tone": "professional"
}
## Response 

{
  "email": "Generated email content",
  "responseTimeMs": 3
}

## HOW IT WORKS 
1.The client sends a POST request with email details.
2.The controller receives the request and forwards it to the service layer.
3.The service layer constructs an AI-style prompt using the input fields.
4.An email template is generated based on the prompt.
5.The response time is calculated and returned along with the email.

## AI Usage
The application uses the concept of AI prompt design. A prompt is dynamically created using the provided inputs (purpose, tone, recipient).
For this assignment, the AI response is simulated to keep the project simple and beginner-friendly. The design allows easy integration of a real AI provider (such as OpenAI) in the future without changing the API.

## Environment Variable Handling
The application is configured to read the AI API key from an environment variable. This ensures that sensitive information is not hardcoded.

ai.api.key=${AI_API_KEY:dummy-key} -"If no API key is provided, a default dummy value is used so the application runs safely."

Architecture
Controller layer: Handles HTTP requests and responses
Service layer: Contains business logic and AI interaction logic
DTOs: Handle request and response data transfer
This separation keeps the code clean and easy to understand.

Response Time Logging
The response time is measured by calculating the difference between start and end timestamps during email generation. This helps in monitoring AI performance.

## Tech Stack
Java 17
Spring Boot
Maven

## How to Run
1.Clone the repository
2.Open the project in an IDE
3.Run the main Spring Boot application
4.Test the API using Postman or curl at: http://localhost:8080/api/email/generate
