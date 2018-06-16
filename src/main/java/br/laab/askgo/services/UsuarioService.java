package br.laab.askgo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.laab.askgo.dao.IUsuarioDAO;
import br.laab.askgo.entities.Usuario;


@Service
@Transactional
public class UsuarioService {

	@Autowired
	private IUsuarioDAO usuarioDAO;

	public Usuario logar(String email, String senha) {
		return usuarioDAO.logar(email, senha);
	}
	
}
