package com.ello.br.ello.repositorys;

import com.ello.br.ello.models.entitys.MedicalInformationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MedicalInformationRepository extends JpaRepository<MedicalInformationEntity, UUID> {
}
