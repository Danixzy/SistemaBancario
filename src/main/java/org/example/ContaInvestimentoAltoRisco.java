package org.example;

class ContaInvestimentoAltoRisco extends ContaInvestimento {
    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.05; // Taxa de 5%
        if (saldo >= 10000 && valor + taxa <= saldo) { // Saldo mínimo de R$ 10.000,00
            saldo -= (valor + taxa);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Taxa de R$ " + taxa + " aplicada.");
        } else {
            System.out.println("Saldo insuficiente ou abaixo do mínimo exigido para saque.");
        }
    }
}