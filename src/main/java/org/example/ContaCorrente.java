package org.example;

class ContaCorrente extends ContaBancaria {
    protected double limiteChequeEspecial; // Alterado para protected

    public ContaCorrente(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = saldo + limiteChequeEspecial;
        if (valor <= saldoDisponivel) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Limite do Cheque Especial: R$ " + limiteChequeEspecial);
    }
}