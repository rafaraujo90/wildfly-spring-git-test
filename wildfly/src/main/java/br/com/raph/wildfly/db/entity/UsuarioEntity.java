package br.com.raph.wildfly.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class UsuarioEntity implements Serializable {
	
	private static final long serialVersionUID = 1744604435942387937L;

	@Id
	@Column(name="login")
	private String login;
	
	@Column(name="senha")
	private String senha;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return String.format("UsuarioEntity [login=%s, senha=%s]", login, senha);
	}

}
