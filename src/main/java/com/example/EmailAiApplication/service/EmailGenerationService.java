package com.example.EmailAiApplication.service;

import com.example.EmailAiApplication.dto.EmailRequest;
import com.example.EmailAiApplication.dto.EmailResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailGenerationService {

    @Value("${ai.api.key}")
    private String aiApiKey;

    public EmailResponse generateEmail(EmailRequest request) {

        long startTime = System.currentTimeMillis();

        String prompt = String.format(
                "Write a %s email for %s regarding %s.",
                request.getTone(),
                request.getRecipientName(),
                request.getPurpose());

        String generatedEmail = simulateAiResponse(prompt);

        long endTime = System.currentTimeMillis();

        return new EmailResponse(generatedEmail, endTime - startTime);
    }

    private String simulateAiResponse(String prompt) {
        return "Dear Recipient,\n\n"
                + "I hope this message finds you well.\n\n"
                + prompt + "\n\n"
                + "Please let me know if you need any additional information from my side. "
                + "I would be happy to assist.\n\n"
                + "Thank you for your time and consideration.\n\n"
                + "Best regards,\n"
                + "Your Company";
    }
}
