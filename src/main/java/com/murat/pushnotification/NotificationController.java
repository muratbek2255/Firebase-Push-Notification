package com.murat.pushnotification;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private FirebaseMessagingService firebaseMessagingService;

    @PostMapping
    public ResponseEntity<String> sendNotificationByToken(@RequestBody NotificationMessage notificationMessage) {

        return ResponseEntity.status(201).body(firebaseMessagingService.sendNotificationByToken(notificationMessage));
    }
}
