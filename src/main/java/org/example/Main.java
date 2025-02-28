package org.example;

public class Main {
    public static void main(String[] args) {
       
        ContaCorrente cc = new ContaCorrente("12345", "João Silva", 1000, 500);
        cc.exibirInformacoes();
        cc.sacar(1200);
        cc.exibirInformacoes();


        ContaPoupanca cp = new ContaPoupanca("67890", "Maria Oliveira", 2000);
        cp.exibirInformacoes();
        cp.sacar(2500);
        cp.exibirInformacoes();


        ContaInvestimento ci = new ContaInvestimento("54321", "Carlos Souza", 5000);
        ci.exibirInformacoes();
        ci.sacar(1000);
        ci.exibirInformacoes();


        ContaSalario cs = new ContaSalario("98765", "Ana Pereira", 1500, 300);
        cs.exibirInformacoes();
        cs.sacar(500);
        cs.sacar(200);
        cs.exibirInformacoes();


        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco("11223", "Pedro Costa", 12000);
        ciar.exibirInformacoes();
        ciar.sacar(3000);
        ciar.exibirInformacoes();
    }
}