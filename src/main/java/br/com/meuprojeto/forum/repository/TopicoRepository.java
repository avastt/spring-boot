package br.com.meuprojeto.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meuprojeto.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
