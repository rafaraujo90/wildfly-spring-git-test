package br.com.raph.test;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.raph.wildfly.db.entity.UsuarioEntity;
import br.com.raph.wildfly.db.persistence.UsuarioPersistence;

@RunWith(Arquillian.class)
public class UsuarioPersistenceTest {
	
	@Deployment
    public static WebArchive createDeployment() {
        WebArchive web = ShrinkWrap.create(WebArchive.class, "arquillian.war")
        		.addPackages(true, "br.com.raph.wildfly")
        		.addAsResource("test-persistence.xml", "META-INF/persistence.xml")
        		.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        
        System.out.println( web );
        return web;
    }
	
	@EJB
	private UsuarioPersistence persistence;
	
	@Test
	public void testFind() {
		String key = "rafaraujo90@gmail.com";
		UsuarioEntity entity = persistence.find(key);
		Assert.assertNotNull( entity );
	}

}
