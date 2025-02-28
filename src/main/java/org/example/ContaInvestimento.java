package org.example;

class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.02; // Taxa de 2%
        if (valor + taxa <= saldo) {
            saldo -= (valor + taxa);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Taxa de R$ " + taxa + " aplicada.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}