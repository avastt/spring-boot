package br.com.meuprojeto.forum.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meuprojeto.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	
	Curso findByNome(String nomeCurso);
}
