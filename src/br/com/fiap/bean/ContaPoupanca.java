package br.com.fiap.bean;

import br.com.fiap.bean.exception.SaldoNegativoException;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento{

    private Float taxa;
    private Float rendimento;


    public ContaPoupanca(){}

    public ContaPoupanca(Float taxa, Float rendimento) {
        this.taxa = taxa;
        this.rendimento = rendimento;
    }

    public ContaPoupanca(Integer agencia, Integer numero, Calendar dataAbertura, Double saldo, Float taxa, Float rendimento) {
        super(agencia, numero, dataAbertura, saldo);
        this.taxa = taxa;
        this.rendimento = rendimento;
    }

    @Override
    public Double calculaRetornoInvestimento() {
        return saldo * rendimento;
    }

    @Override
    public Double retirar(Double valor) throws SaldoNegativoException {
        if(valor + taxa > saldo) {
            throw  new SaldoNegativoException(saldo - taxa);
        }
        return saldo -= valor + taxa;
    }


}
