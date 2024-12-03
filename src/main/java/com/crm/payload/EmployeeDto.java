package com.crm.payload;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EmployeeDto {
    private Long id;

    @NotBlank
    @Size(min = 3, message = "At least 3 characters required")
    private String name;

    @Email
    private String emailId;

    @Size(min = 10, max = 10, message = "Enter a valid 10-digit mobile number")
    private String mobile;
   // private Date date;
}
