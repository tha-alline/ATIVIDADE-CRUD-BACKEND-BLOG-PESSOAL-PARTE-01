package org.generation.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.generation.blogpessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByUsuario(String usuario); // optional porquê podemos ter duas respostas. ex:cadastrado e não cadastrado.
	
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome); // linha add pra fazer o teste.
}