package br.com.fiap.bean;

import br.com.fiap.bean.exception.SaldoNegativoException;

import java.util.Calendar;

public class ContaCorrente extends Conta {

    private TipoConta tipoConta;

    public ContaCorrente() {
    }

    public ContaCorrente(Integer agencia, Integer numero, Calendar dataAbertura, Double saldo, TipoConta tipoConta) {
        super(agencia, numero, dataAbertura, saldo);
        this.tipoConta = tipoConta;
    }

    public Double retirar(Double valor) throws Exception {
        if(valor > saldo && tipoConta == TipoConta.Comum){
            throw new SaldoNegativoException(saldo);
        }
        saldo -= valor;
        return saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
}
