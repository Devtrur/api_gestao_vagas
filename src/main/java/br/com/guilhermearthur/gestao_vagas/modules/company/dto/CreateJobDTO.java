package br.com.guilhermearthur.gestao_vagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateJobDTO {

    @Schema(example = "Vagas para pessoa dev jr", requiredMode = RequiredMode.REQUIRED)
    private String description;
    @Schema(example = "Gym Pass, Plano de Saude...", requiredMode = RequiredMode.REQUIRED)
    private String benefits;
    @Schema(example = "ESTAGIRAIO/JUNIOR", requiredMode = RequiredMode.REQUIRED)
    private String level;
}
