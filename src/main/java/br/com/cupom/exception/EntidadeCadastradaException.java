package br.com.cupom.exception;

public class EntidadeCadastradaException extends RuntimeException {

    public static final String MSG = "Produto de código EAN %d já está cadastrado";

    public EntidadeCadastradaException(Long ean){
        super(String.format(MSG,ean));
    }

}
