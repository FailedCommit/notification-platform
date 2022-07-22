package com.cb.notificationtemplate.controllers;

import com.cb.notificationtemplate.beans.dtos.NotificationTemplateRequest;
import com.cb.notificationtemplate.beans.dtos.NotificationTemplateResponse;
import com.cb.notificationtemplate.services.NotificationTemplateService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/notification-templates")
public class NotificationTemplateApi {
    private final NotificationTemplateService notificationTemplateService;

    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello From Cloudformation :-)");
    }

    @PostMapping(value = "/template")
    public ResponseEntity<NotificationTemplateResponse> createNotificationTemplate(@RequestBody NotificationTemplateRequest request) {
        // Cache and put the template in S3 bucket and template metadata in DynamoDB, ideally. For now just keep in resources folder
        NotificationTemplateResponse notificationTemplate = new NotificationTemplateResponse();//notificationTemplateService.createNotificationTemplate(request);
        notificationTemplate.setStatusDescription("This is a dummy response to continue working with AWS deployment");
        return ResponseEntity.ok(notificationTemplate);
    }
}
