package br.com.guilhermearthur.gestao_vagas.modules.candidate.useCase;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guilhermearthur.gestao_vagas.exceptions.JobNotFoundException;
import br.com.guilhermearthur.gestao_vagas.exceptions.UserNotFoundException;
import br.com.guilhermearthur.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.guilhermearthur.gestao_vagas.modules.candidate.entity.ApplyJobEntity;
import br.com.guilhermearthur.gestao_vagas.modules.candidate.repository.ApplyJobRepository;
import br.com.guilhermearthur.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private ApplyJobRepository applyJobRespository;

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    JobRepository jobRepository;

    public ApplyJobEntity execute(UUID idCandidate, UUID idJob) {
        this.candidateRepository.findById(idCandidate)
                .orElseThrow(() -> {
                    throw new UserNotFoundException();
                });
        this.jobRepository.findById(idJob)
                .orElseThrow(() -> {
                    throw new JobNotFoundException();
                });

        var applyJob = ApplyJobEntity.builder()
                .candidateId(idCandidate)
                .jobId(idJob).build();

        applyJob = applyJobRespository.save(applyJob);
        return applyJob;
    }
}
