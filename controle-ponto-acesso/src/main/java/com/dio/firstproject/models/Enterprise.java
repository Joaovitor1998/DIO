package com.dio.firstproject.models;
import lombok.*;
import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    //EIN (Employer Identification Number) = CNPJ
    private String ein;
    private String address;
    private String neighborhood;
    private String city;
    private String state;
    private String phoneNumber;
}
