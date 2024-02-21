package br.com.fiap.bean;

public class ContaCorrente extends Conta {

    private TipoConta tipoConta;


    public void depositar(Double valor){
        Double saldo = getSaldo();
        saldo = saldo + valor;
        setSaldo(saldo);
    }
    public void retirar(Double valor) throws Exception {
        Double saldo = getSaldo();
        saldo = saldo - valor;
        if(tipoConta != TipoConta.Comum && saldo < 0){
            setSaldo(saldo);
        }else{
            throw new Exception("Conta irá ficar com saldo negativo!");
        }

    }
}
