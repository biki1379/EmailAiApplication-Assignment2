package com.example.EmailAiApplication.controller;

import com.example.EmailAiApplication.dto.EmailRequest;
import com.example.EmailAiApplication.dto.EmailResponse;
import com.example.EmailAiApplication.service.EmailGenerationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    private final EmailGenerationService emailGenerationService;

    public EmailController(EmailGenerationService emailGenerationService) {
        this.emailGenerationService = emailGenerationService;
    }

    @PostMapping("/generate")
    public EmailResponse generateEmail(@RequestBody EmailRequest request) {
        return emailGenerationService.generateEmail(request);
    }
}
