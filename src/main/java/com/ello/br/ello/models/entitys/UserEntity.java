package com.ello.br.ello.models.entitys;

import com.ello.br.ello.models.BaseModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "user",schema = "ello")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Builder
public class UserEntity extends BaseModel {

    @Size(min = 3, max = 50, message = "{validation.name.size}")
    @NotBlank
    private String name;
    private Date birthday;
    private String gender;
    private String telephone;
    private String address;

    @Email(message = "{validation.mail.invalid}")
    private String email;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "functional_information_id")
    private FunctionalInformationEntity functionalInformation;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_information_id")
    private PaymentInformationEntity paymentInformation;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "medical_information_id")
    private MedicalInformationEntity medicalInformation;
}
