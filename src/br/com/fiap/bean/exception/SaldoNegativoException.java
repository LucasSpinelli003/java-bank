package br.com.fiap.bean.exception;

public class SaldoNegativoException extends RuntimeException{


    public SaldoNegativoException(String message){
        super(message);
    }
    public SaldoNegativoException(Double valor){
        super("Saldo Insuficiente, valor disponível: " + valor);
    }




}
