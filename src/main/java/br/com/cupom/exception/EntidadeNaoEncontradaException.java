package br.com.cupom.exception;

public class EntidadeNaoEncontradaException extends RuntimeException {

    public static final String MSG = "Produto de código EAN %d não encontrado";

    public EntidadeNaoEncontradaException(Long ean){
        super(String.format(MSG,ean));
    }

}
