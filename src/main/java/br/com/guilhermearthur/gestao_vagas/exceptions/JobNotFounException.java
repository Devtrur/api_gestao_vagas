package br.com.guilhermearthur.gestao_vagas.exceptions;

public class JobNotFounException extends RuntimeException {
    public JobNotFounException() {
        super("Job Not Found");
    }
}
