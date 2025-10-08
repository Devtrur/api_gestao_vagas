package br.com.guilhermearthur.gestao_vagas.modules.candidate.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilhermearthur.gestao_vagas.modules.candidate.entity.ApplyJobEntity;

public interface ApplyJobRespository extends JpaRepository<ApplyJobEntity, UUID> {

}