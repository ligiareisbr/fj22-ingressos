package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public enum TipoDeIngresso {
	
	INTEIRO(new SemDesconto()),
	ESTUDANTE(new DescontoEstudante()),
	BANCO(new DescontoDeTrintaPorCentoParaBancos());
	
	private final Desconto desconto;
	
	TipoDeIngresso(Desconto desconto) {
		this.desconto = desconto;
	}
	
	public String getDescricao() {
		return desconto.getDescricao();
	}

	public BigDecimal aplicaDesconto(BigDecimal valor) {
		return desconto.aplicarDescontoSobre(valor);
	}

}
