package br.com.meuprojeto.forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meuprojeto.forum.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
	Optional<Usuario> findByEmail(String email);
}
