package com.pk.dentalclinic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Schedule {
    @Id
    private UUID id;

    private Date appointmentDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "patientId")
    private Patient patient;
}
