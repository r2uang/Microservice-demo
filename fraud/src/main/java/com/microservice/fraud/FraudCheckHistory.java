package com.microservice.fraud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FraudCheckHistory {

    @Id
    @SequenceGenerator(name = "fraud_id_sequence"
            , sequenceName = "fraud_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "fraud_id_sequence")
    private Long Id;
    private Long customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}
