package br.ages.crud.bo;

import java.util.List;

import br.ages.crud.dao.UsuarioDAO;
import br.ages.crud.exception.PersistenciaException;
import br.ages.crud.model.Usuario;

public class UsuarioBO {
	//private Usuario usuario;
	private List<Usuario> lista;
	private UsuarioDAO dao;
	
	public UsuarioBO(){
		dao = new UsuarioDAO();
	}
	
	public boolean validaUsuario(Usuario aux) throws PersistenciaException{
		return dao.validarUsuario(aux);
	}
	
	public List<Usuario> ListarUsuario(){
		return lista;
	}
}
