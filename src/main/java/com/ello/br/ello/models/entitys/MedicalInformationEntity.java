package com.ello.br.ello.models.entitys;


import com.ello.br.ello.models.BaseModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "medical_information",schema = "ello")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Builder
public class MedicalInformationEntity extends BaseModel {

    private String allergies;
    private String frequentlyUsedMedication;
    private String emergencyContact;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "user_id")
    private UserEntity user;
}
