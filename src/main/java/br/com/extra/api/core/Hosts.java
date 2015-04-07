package br.com.extra.api.core;

/**
 * ExtraAPI-SDK - Hosts.java
 * 
 * Enum que possui os Hosts que podem ser chamados pela API.
 * 
 * @author Gibson Pasquini Nascimento
 * @author Fillipe Massuda
 * 
 *         21/06/2013
 */
public enum Hosts {

	/**
	 * Host do serviço em Ambiente de Sandbox na versão 1.
	 */
	SANDBOX_V1("https://sandbox.cnova.com/api/v1"),
	/**
	 * Host do serviço em Ambiente de Produção na versão 1.
	 */
	PRODUCAO_V1("https://api.cnova.com/api/v1"),

	/**
	 * Host do serviço em Ambiente de Sandbox na versão 2.
	 */
	SANDBOX_V2("https://sandbox.cnova.com/api/v2"),

	/**
	 * Host do serviço em Ambiente de Produção na versão 2.
	 */
	PRODUCAO_V2("https://api.cnova.com/api/v2");

	/**
	 * Endereço do host.
	 */
	private String host;

	/**
	 * Construtor que cria um Host.
	 * 
	 * @param host
	 *            Endereço do serviço
	 */
	private Hosts(String host) {
		this.host = host;
	}

	public Boolean isSandbox() {
		return (SANDBOX_V1.equals(this) || SANDBOX_V2.equals(this));
	}

	public Boolean isV1() {
		return (PRODUCAO_V1.equals(this) || SANDBOX_V1.equals(this));
	}

	@Override
	public String toString() {
		return this.host;
	}

}
