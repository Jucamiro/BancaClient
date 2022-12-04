package com.nttdata.BancaClient.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientModel {

    @JsonIgnore
    private String idClient;

    private String identityNumber;


    private String name;


    private String lastName;

    @NotBlank(message="Address cannot be null or empty")
    private String address;

    @NotBlank(message="Phone cannot be null or empty")
    private String phone;

    @NotBlank(message="City cannot be null or empty")
    private String city;

    @NotBlank(message="Email cannot be null or empty")
    private String email;

    @NotBlank(message="Type Client cannot be null or empty")
    private String typeClient;


    private String ruc;


    private String companyName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateRegister;

}
