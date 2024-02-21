package br.com.fiap.bean;

import java.util.Calendar;

public class Conta {

    private Integer agencia, numero;
    private Calendar dataAbertura;
    private Double saldo;


    public Conta(){}
    public Conta(Integer agencia, Integer numero, Calendar dataAbertura, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public void depositar(Double valor){
        this.saldo = saldo + valor;
    }
    public void retirar(Double valor) throws Exception {
        this.saldo = saldo - valor;
    }

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

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
