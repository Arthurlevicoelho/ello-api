package com.ello.br.ello.repositorys;

import com.ello.br.ello.models.entitys.FunctionalInformationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FunctionalInformationRepository extends JpaRepository<FunctionalInformationEntity, UUID>{
}
