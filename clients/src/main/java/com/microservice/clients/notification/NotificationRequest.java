package com.microservice.clients.notification;

public record NotificationRequest(Long customerId
        , String customerEmail
        , String message) {
}
