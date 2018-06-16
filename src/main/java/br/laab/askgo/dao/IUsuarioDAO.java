package br.laab.askgo.dao;

import br.laab.askgo.entities.Usuario;

public interface IUsuarioDAO extends IDAO<Usuario, Long> {
	 
public Usuario logar(String email, String senha);
}
