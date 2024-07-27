package org.example;

public class ParametrosInvalidosException extends Throwable {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); // Passa a mensagem para a classe pai (Exception)
    }

    }
