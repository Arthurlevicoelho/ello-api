package com.ello.br.ello.models.entitys;

import com.ello.br.ello.models.BaseModel;
import com.ello.br.ello.models.enums.TypePayment;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "payment_information",schema = "ello")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Builder
public class PaymentInformationEntity extends BaseModel {

    @Column(unique = true)
    @Enumerated(EnumType.STRING)
    private TypePayment typePayment;

    private Double discount;

    private Date billingDate;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "user_id")
    private UserEntity user;

}
