package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persion {
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
