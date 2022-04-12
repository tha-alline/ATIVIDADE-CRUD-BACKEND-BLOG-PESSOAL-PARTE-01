package org.generation.blogpessoal.security;

import java.util.Collection;
import java.util.List;

import org.generation.blogpessoal.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {
	
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private List<GrantedAuthority> authorities; //autorização para as pessoas cadastradas serem administradores
	
	public UserDetailsImpl(Usuario usuario) {
		
		userName = usuario.getUsuario(); // estou atribuindo meu usuário ao "userName"
		password = usuario.getSenha(); // estou atribuindo minha senha ao "password"
	}
	
	public UserDetailsImpl() {}

	@Override
	public String getPassword() {
		return password;
	}
	
	@Override
	public String getUsername() {
		return userName;
	}
	// Métodos Padrão "Basic Security"
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}