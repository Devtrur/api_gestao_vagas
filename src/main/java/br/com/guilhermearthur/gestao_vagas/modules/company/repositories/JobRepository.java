package br.com.guilhermearthur.gestao_vagas.modules.company.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilhermearthur.gestao_vagas.modules.company.entities.JobEntity;
import java.util.List;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {

    List<JobEntity> findByDescriptionContainingIgnoreCase(String filter);

    List<JobEntity> findByCompanyId(UUID companyId);
}
