package com.microservice.notification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @javax.persistence.Id
    @SequenceGenerator(name = "notification_id_sequence"
            , sequenceName = "notification_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "notification_id_sequence")
    private Long Id;
    private Long toCustomerId;
    private String toCustomerEmail;
    private String sender;
    private String message;
    private LocalDateTime sentAt;
}
