package br.com.alura.exception;

public class DomainException extends  RuntimeException{

    public DomainException(String mensagem){
        super(mensagem);
    }
}
