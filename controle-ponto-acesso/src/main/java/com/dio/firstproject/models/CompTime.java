package com.dio.firstproject.models;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class CompTime {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class CompTimeId implements Serializable{
        private Long id;
        private Long transactionId;
        private Long userId;
    }

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private CompTimeId id;
    private LocalDateTime workedDate;
    private BigDecimal hoursQuantity;
    private BigDecimal hoursBalance;
}
