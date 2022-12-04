package com.nttdata.BancaClient.domain;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@ToString
@EqualsAndHashCode(of = {"identityNumber"})
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "client")
public class Client {

    @Id
    private String idClient;

    private String identityNumber;

    @NotNull
    private String name;

    @NotNull
    private String lastName;

    @NotNull
    private String address;

    @NotNull
    private String phone;

    private String city;

    @NotNull
    private String email;

    @NotNull
    private String typeClient;

    private String ruc;

    private String companyName;

    @NotNull
    private LocalDate dateRegister;

}
