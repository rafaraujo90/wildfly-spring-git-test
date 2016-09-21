package br.com.raph.wildfly.db.persistence;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.raph.wildfly.db.entity.UsuarioEntity;

@Local
@Stateless
public class UsuarioPersistenceImpl implements UsuarioPersistence {
	
	@PersistenceContext(unitName="handson-persist-unit")
	private EntityManager entityManager;
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public UsuarioEntity find(String key) {
		return entityManager.find(UsuarioEntity.class, key);
	}

}
