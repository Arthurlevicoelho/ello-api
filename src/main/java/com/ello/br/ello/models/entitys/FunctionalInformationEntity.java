package com.ello.br.ello.models.entitys;

import com.ello.br.ello.models.BaseModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "functional_information",schema = "ello")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Builder
public class FunctionalInformationEntity extends BaseModel {

    private Date acquisitionDate;
    private String dayShift;
    private String time;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "user_id")
    private UserEntity user;

}
