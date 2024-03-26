package com.microservice.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("notification")
public interface NotificationClient {
    @GetMapping("api/v1/notification")
    public void sendNotification(NotificationRequest notificationRequest);
}
