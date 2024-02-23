package br.com.fiap.bean;

import java.util.Calendar;

public abstract class Conta {

    protected Integer agencia, numero;
    protected Calendar dataAbertura;
    protected Double saldo;


    public Conta(){}
    public Conta(Integer agencia, Integer numero, Calendar dataAbertura, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public Double depositar(Double valor) {
        return this.saldo += valor;
    }

    public abstract Double retirar(Double valor) throws Exception;

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Double getSaldo() {
        return saldo;
    }

}
