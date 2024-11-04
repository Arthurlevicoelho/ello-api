package com.ello.br.ello.repositorys;

import com.ello.br.ello.models.entitys.PaymentInformationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentInformationRepository extends JpaRepository<PaymentInformationEntity, UUID>{
}
