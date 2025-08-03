package com.pk.dentalclinic.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Patient {
    @Id
    private UUID id;

    private String firstName;
    private String lastName;
    private String age;
    private String medicalHistory;
    private String phoneNumber;
    private String email;
    private String address;
    private String password;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Schedule> schedules;
}
