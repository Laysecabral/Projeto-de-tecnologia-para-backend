package br.com.exercicio1.api.service;

import br.com.exercicio1.api.model.Aluno;
import br.com.exercicio1.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;


    public void criarAluno(Aluno aluno) {
        alunoRepository.save(aluno);
    }
}
