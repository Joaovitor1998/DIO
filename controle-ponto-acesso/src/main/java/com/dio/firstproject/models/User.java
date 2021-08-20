package com.dio.firstproject.models;
import lombok.*;

import javax.persistence.*;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private UserCategory userCategory;
    private String userName;
    @ManyToOne
    private Enterprise enterprise;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private JobWorkdays workdays;
    private BigDecimal tolerance;
    private LocalDateTime jobStart;
    private LocalDateTime jobEnd;
}
