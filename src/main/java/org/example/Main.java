package org.example;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("54321", "Takeshi Yamamoto", 2000, 1000);
        cc.exibirInformacoes();
        cc.sacar(2500);
        cc.exibirInformacoes();


        ContaPoupanca cp = new ContaPoupanca("98765", "Aiko Tanaka", 3000);
        cp.exibirInformacoes();
        cp.sacar(3500);
        cp.exibirInformacoes();


        ContaInvestimento ci = new ContaInvestimento("11223", "Haruto Suzuki", 10000);
        ci.exibirInformacoes();
        ci.sacar(2000);
        ci.exibirInformacoes();


        ContaSalario cs = new ContaSalario("33445", "Yui Nakamura", 2500, 500);
        cs.exibirInformacoes();
        cs.sacar(1000);
        cs.sacar(500);
        cs.exibirInformacoes();


        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco("55667", "Riku Kobayashi", 15000);
        ciar.exibirInformacoes();
        ciar.sacar(5000);
        ciar.exibirInformacoes();
    }
}