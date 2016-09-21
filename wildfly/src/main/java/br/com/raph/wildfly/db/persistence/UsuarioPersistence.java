package br.com.raph.wildfly.db.persistence;

import br.com.raph.wildfly.db.entity.UsuarioEntity;

public interface UsuarioPersistence {

	UsuarioEntity find(String key);
	
}
