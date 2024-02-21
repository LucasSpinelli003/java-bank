package br.com.fiap.bean;

public class ContaPoupanca extends Conta implements ContaInvestimento{

    private Float taxa;
    private Float rendimento;

    @Override
    public void calculaRetornoInvestimento() {

    }

    public void depositar(Double valor) {
        Double saldo = getSaldo();
        saldo = saldo + valor;
        setSaldo(saldo);
    }

}
