package org.example;

class ContaSalario extends ContaCorrente {
    private int saquesGratuitosRestantes;

    public ContaSalario(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
        this.saquesGratuitosRestantes = 1; // 1 saque gratuito por mês
    }

    @Override
    public void sacar(double valor) {
        if (saquesGratuitosRestantes > 0) {
            super.sacar(valor);
            saquesGratuitosRestantes--;
        } else {
            double taxa = 5.0; // Taxa de R$ 5,00 para saques adicionais
            if (valor + taxa <= saldo + limiteChequeEspecial) { // Acesso direto ao atributo
                saldo -= (valor + taxa);
                System.out.println("Saque de R$ " + valor + " realizado com sucesso. Taxa de R$ " + taxa + " aplicada.");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Saques gratuitos restantes: " + saquesGratuitosRestantes);
    }
}