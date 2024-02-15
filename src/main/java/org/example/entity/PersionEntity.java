package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PersionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long persionId;
    private String nameWithInitials;
    private String fullName;
    private String nic;
    private Date date;
    private String countryOfBirth;
    private String gender;
    private String sourceOfIncome;
    private String permanentAddress;
    private String contactNumber;
    private String civilStatus;
    private String profession;
}
